package Testes;

import EntidadesNoticias.Noticia;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tutorial1 {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
         factory = new AnnotationConfiguration().
                   configure().
                   //addPackage("com.xyz") //add package if used.
                   //addAnnotatedClass(Tutorial.class).
                 addAnnotatedClass(Noticia.class).
                   buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("\n\nFalhou: " + ex + "\n\n");
         throw new ExceptionInInitializerError(ex); 
      }
      Tutorial1 tutorial = new Tutorial1();

      /* Add few employee records in database
      Integer noticiaID1 = tutorial.addTutorial("Zara", "Ali", "ABCDE", 1);
      Integer noticiaID2 = tutorial.addTutorial("Lucas", "Paes", "XWYZ", 2); */
      
      tutorial.listTutorials();

      tutorial.listTutorials();
   }
   /* Method to CREATE an employee in the database */
    public Integer addNoticia(Noticia noticia){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer noticiaID = null;
        try{
            tx = session.beginTransaction();
            
            noticiaID = (Integer) session.save(noticia); 
         
            noticia.setPk_noticia(noticiaID);
         
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return noticiaID;
    }
    
    /* Method to  READ all the employees */
   public void listTutorials( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         List noticias = session.createQuery("FROM Noticia").list(); 
         
         for (Iterator iterator = 
                           noticias.iterator(); iterator.hasNext();){
            Noticia noticia = (Noticia) iterator.next(); 
            System.out.print("\n\nTítulo: " + noticia.getTitulo_noticia()); 
            System.out.print("\n\nSubtitulo: " + noticia.getSubtitulo_noticia()); 
            System.out.println("\n\nTexto: " + noticia.getTexto_noticia()); 
         }
         
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to UPDATE salary for an employee */
   public void updateTutorial(Integer noticiaID, String Texto ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Noticia noticia = 
                    (Noticia)session.get(Noticia.class, noticiaID); 
         noticia.setTexto_noticia(Texto);
		 session.update(noticia); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to DELETE an employee from the records */
   public void deleteTutorial(Integer noticiaID){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Noticia noticia = 
                   (Noticia)session.get(Noticia.class, noticiaID); 
         session.delete(noticia); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
}