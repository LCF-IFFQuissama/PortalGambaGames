package Testes;

import EntidadesNoticias.NoticiaDAO;
import EntidadesNoticias.Noticia;
import java.util.Scanner;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
import java.util.Scanner;
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tutorial {
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
      Tutorial tutorial = new Tutorial();

      /* Add few employee records in database */
      
      Scanner scanf = new Scanner(System.in);
      
      System.out.println("\nDigite um Título: ");
      String Titulo = scanf.nextLine();
      
      System.out.println("\nDigite um Subtítulo: ");
      String Subtitulo = scanf.nextLine();
      
      System.out.println("\nDigite o texto: ");
      String Texto = scanf.nextLine();
      
      Integer noticiaID1 = tutorial.addTutorial(Titulo, Subtitulo, Texto);
      
      tutorial.listTutorials();
   }
   /* Method to CREATE an employee in the database */
    public Integer addTutorial(String Titulo, String Subtitulo, String Texto){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer noticiaID = null;
        try{
            tx = session.beginTransaction();
         
            Noticia noticia = new Noticia();
         
            noticia.setTitulo_noticia(Titulo);
            noticia.setSubtitulo_noticia(Subtitulo);
            noticia.setTexto_noticia(Texto);         
            //noticia.setPk_noticia(pk);
         
            noticiaID = (Integer) session.save(noticia); 
         
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
         
         NoticiaDAO nDAO = new NoticiaDAO();
         
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