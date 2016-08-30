package EntidadesAdministrador;

import EntidadesBolsista.Bolsista;
import EntidadesNoticias.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AdministradorDAO {
    public Integer addADM (Administrador administrador){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        Integer administradorID = null;
        try{
            tx = session.beginTransaction();
                        
            administradorID = (Integer) session.save(administrador);
            
            session.flush();                              
            
            tx.commit();
            
        }catch (HibernateException e) {
            if (tx!=null)
                tx.rollback();
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        
        return administradorID;
    }
    
    public List<Bolsista> listADM(){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        List administrador = null;
        try{
                System.out.println("\n\n\n\nTô listando...\n\n\n");

                tx = session.beginTransaction();

                AdministradorDAO admDAO = new AdministradorDAO();

                administrador = session.createQuery("FROM Administrador").list();  
                
                tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
                e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return administrador;
    }
    
    public Bolsista getADM(Integer admID){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            
            Administrador administrador = (Administrador) session.createQuery("from administrador where pk_administrador = ?").setInteger(0, admID).uniqueResult();
                        
            tx.commit(); 
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx!=null) tx.rollback();
        } finally {
            session.close();
        }
        return null;
    }
    
    public void updateADM (Integer admID, Administrador admAntigo){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Administrador administrador = (Administrador) session.createQuery("from Administrador where pk_administrador = ?").setInteger(0, admID).uniqueResult();
            
            administrador.setEmail(admAntigo.getEmail());
            
            administrador.setNome_completo(admAntigo.getNome_completo());
            
            administrador.setSenha(admAntigo.getSenha());
            
            session.update(administrador); 
            
            tx.commit();
            
            session.flush();                        
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
        } finally {
            session.close(); 
        }
    }
    
    /* Method to DELETE an employee from the records */
    public void deleteADM (Integer admID){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Administrador administrador = (Administrador)session.get(Administrador.class, admID); 
            session.delete(administrador); 
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
        }finally {
            session.close(); 
        }
    }
}
