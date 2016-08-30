package EntidadesNoticias;

import java.util.*;
//import org.hibernate.Criteria;
import org.hibernate.HibernateException; 
import org.hibernate.Session;
import org.hibernate.Transaction;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;


public class NoticiaDAO {     // Data Access Object
   private static SessionFactory factory; 
    public Integer addNoticia(Noticia noticia){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        Integer noticiaID = null;
        try{
            tx = session.beginTransaction();
                        
            noticiaID = (Integer) session.save(noticia);
            
            noticia.setPk_noticia(noticiaID);
            
            session.flush();                              
            
            tx.commit();
            
        }catch (HibernateException e) {
                if (tx!=null)
                    tx.rollback();
                e.printStackTrace(); 
            }finally {
                session.close(); 
            }
            return noticiaID;
        }
    
    public List<Noticia> listNoticias(){
      Session session = HibernateUtil.gimmeSession();
      Transaction tx = null;
      List noticias = null;
      try{
         tx = session.beginTransaction();
         
         NoticiaDAO nDAO = new NoticiaDAO();
         
         noticias = session.createQuery("FROM Noticia order by pk_noticia desc").list(); 
         
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return noticias;
   }
    
    public Noticia getNoticias(Integer codNoticia){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            
            Noticia noticia = (Noticia) session.createQuery("from Noticia where pk_noticia = ?").setInteger(0, codNoticia).uniqueResult();
                        
            if (noticia != null)
            {
                return noticia;
            }
            
            tx.commit(); 
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx!=null) tx.rollback();
        } finally {
            session.close();
        }
        return null;
    }
    
    public void updateNoticia(Integer codigo_noticia, Noticia noticiaNova){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            
            Noticia noticia = (Noticia) session.createQuery("from Noticia where pk_noticia = ?").setInteger(0, codigo_noticia).uniqueResult();
            
            noticia.setSubtitulo_noticia(noticiaNova.getSubtitulo_noticia());
            
            noticia.setTexto_noticia(noticiaNova.getTexto_noticia());
            
            noticia.setTitulo_noticia(noticiaNova.getTitulo_noticia());
            
            session.update(noticia); 
            
            tx.commit();
            
            session.flush();                        
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
        } finally {
            session.close(); 
        }
    }
    
    public void deleteNoticia(Integer codigo_noticia){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
    
            Noticia noticia = (Noticia)session.get(Noticia.class, codigo_noticia); 
            
            session.delete(noticia); 
            
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
        }finally {
            session.close(); 
        }
    }    
}