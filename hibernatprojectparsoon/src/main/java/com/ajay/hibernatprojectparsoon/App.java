package com.ajay.hibernatprojectparsoon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ajay.entity.Registration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure("cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       System.out.println(factory);
       
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
      // Registration reg = new Registration(1 ,"ajay" ,"kota" ,98874);
       
       // ======================================
       // 1) save()
       // ======================================
       Registration reg = new Registration(1, "Ajay", "Kota", 98874);
       session.save(reg);
       System.out.println("save() called");

       // ======================================
       // 2) persist()
       // ======================================
       Registration reg2 = new Registration(2, "Vijay", "Jaipur", 99887);
       session.persist(reg2);
       System.out.println("persist() called");

       // ======================================
       // 3) saveOrUpdate()
       // ======================================
       Registration reg3 = new Registration(3, "Pawan", "Delhi", 88765);
       session.saveOrUpdate(reg3);
       System.out.println("saveOrUpdate() called");

       // ======================================
       // 4) get()
       // ======================================
       Registration r1 = session.get(Registration.class, 1);
       System.out.println("get(): " + r1);

       // ======================================
       // 5) load()
       // ======================================
       Registration r2 = session.load(Registration.class, 2);
       System.out.println("load(): " + r2);

       // ======================================
       // 6) update()
       // ======================================
       r1.setAddress("Mumbai");
       session.update(r1);
       System.out.println("update() called");

       // ======================================
       // 7) delete()
       // ======================================
       session.delete(r2);
       System.out.println("delete() called");

       // ======================================
       // 8) merge()
       // ======================================
       Registration detachedReg = new Registration(3, "Pawan Updated", "Goa", 88765);
       session.merge(detachedReg);
       System.out.println("merge() called");

       // ======================================
       // 9) contains()
       // ======================================
       boolean isAttached = session.contains(r1);
       System.out.println("contains(): " + isAttached);

       // ======================================
       // 10) evict()
       // ======================================
       session.evict(r1); // r1 अब session से remove हो गया
       System.out.println("evict() called");

       // ======================================
       // 11) clear()
       // ======================================
       session.clear(); // पूरे session को clear कर दिया
       System.out.println("clear() called");

       // ======================================
       // 12) flush()
       // ======================================
       session.flush(); // buffer से DB मे sync
       System.out.println("flush() called");

       tx.commit();

    
       session.close();
       System.out.println("session closed.");
    }
}
