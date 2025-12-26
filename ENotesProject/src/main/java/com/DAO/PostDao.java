package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.User.Post;
import com.User.UserDetails;

public class PostDao {

		private Connection conn;

		public PostDao(Connection conn) {
			super();
			this.conn = conn;
		}
		
		public boolean AddNotes(String title , String content ,int uid) {
			
			boolean f =false;
			try {
				String query = "insert into post(title ,content ,uid) values(? ,? ,?)";
				
				PreparedStatement ps = conn.prepareStatement(query);
				
				ps.setString(1, title);
				ps.setString(2 , content);
				ps.setInt(3, uid);
				
				int i =ps.executeUpdate();
				if(i==1) {
					f=true;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			
			return f;
			
		}
		
		public List<Post> getData(int id){
		List <Post>list = 	new ArrayList<Post>();
		Post po ;
			try {
				String qu = "select * from post where uid = ?";
				PreparedStatement ps = conn.prepareStatement(qu);
				
				ps.setInt(1, id);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					po = new Post();
					po.setId(rs.getInt("id"));
					po.setTitle(rs.getString("title"));
					po.setContent(rs.getString("content"));
					po.setPdate(rs.getTimestamp("date"));
					
					list.add(po);
					
				}
				
				
;			}catch(Exception e) {
				e.printStackTrace();
			}
			return list;
			
		}
		
		
	public Post getDataById(int noteid) {
		Post p = null;
		
		try {
			String qu = "select * from post  where id =?";
			PreparedStatement ps = conn.prepareStatement(qu);
			
			ps.setInt(1, noteid);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
            	p = new Post();
            	p.setId(rs.getInt(1));
            	p.setTitle(rs.getString(2));
            	p.setContent(rs.getString(3));
            	
            	
            	
            }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return p;
	}
	
	
	public boolean PostUpdate(int nid ,String title ,String content ) {
		boolean f= false;
		
		try {
			String qu = "UPDATE post SET title = ?, content = ? WHERE id = ?";

			PreparedStatement ps = conn.prepareStatement(qu);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3 , nid);
			
		int i =	ps.executeUpdate();
			
			if(i==1) {
				f =true;
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return f;
	}
	
	public boolean DeleteNotes(int nid) {
		boolean f =  false;
		
		try {
			String qu = "delete from post where id =?";
			PreparedStatement ps = conn.prepareStatement(qu);
			ps.setInt(1, nid);
			int i =ps.executeUpdate();
			
			if(i==1) {
				f = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	
}
