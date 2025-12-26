//package com.ajaysoft.servlet;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.tomcat.util.http.fileupload.FileItem;
//import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
//
//import com.sun.tools.javac.util.List;
//
///**
// * Servlet implementation class fileuploading
// */
//@WebServlet("/file")
//public class fileuploading extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @param <ServletFileUpload>
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected <ServletFileUpload> void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		
//		
//		
//		
//		
//		
//		try {
//			DiskFileItemFactory dfi = new DiskFileItemFactory();
//			
//			ServletFileUpload sfu =  new ServletFileUpload(dfi);
//			
//			List<FileItem> multiparts = ((Object) sfu).parseRequest(request);
//					
//					FileItem item = multiparts.get(0);
//			File f  =new File(item.getName());
//			String name = f.getName();
//			
//			item.write(new File("D:/uploads/"+name));
//			RequestDispatcher rd = request.getRequestDispatcher("/success.html");
//			
//			rd.forward(request, response);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		
//		}
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}


package com.ajaysoft.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

@WebServlet("/file")
public class fileuploading extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Check if request actually contains upload file
        if (ServletFileUpload.isMultipartContent(request)) {
            try {
                // Create a factory for disk-based file items
                DiskFileItemFactory factory = new DiskFileItemFactory();

                // Create a new file upload handler
                ServletFileUpload upload = new ServletFileUpload(factory);

                // Parse the request
                List<FileItem> multiparts = upload.parseRequest(request);

                // Process the uploaded items
                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        String fileName = new File(item.getName()).getName();
                        String uploadPath = "D:/uploads/" + fileName;
                        item.write(new File(uploadPath));
                        System.out.println("File uploaded successfully: " + uploadPath);
                    }
                }

                // Forward to success page
                RequestDispatcher rd = request.getRequestDispatcher("/success.html");
                rd.forward(request, response);

            } catch (Exception e) {
                e.printStackTrace();
                response.getWriter().println("File upload failed: " + e.getMessage());
            }
        } else {
            response.getWriter().println("Sorry! This servlet only handles file upload requests.");
        }
    }
}
