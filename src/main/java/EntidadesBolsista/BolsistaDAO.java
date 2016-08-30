package EntidadesBolsista;

import EntidadesNoticias.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BolsistaDAO {
    
    public Integer addBolsista (Bolsista bolsista){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        Integer bolsistaID = null;
        try{
            tx = session.beginTransaction();
                        
            bolsistaID = (Integer) session.save(bolsista);
            
            session.flush();                              
            
            tx.commit();
            
        }catch (HibernateException e) {
            if (tx!=null)
                tx.rollback();
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        
        return bolsistaID;
    }
    
    public List<Bolsista> listBolsistas(){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        List bolsistas = null;
        try{
                System.out.println("\n\n\n\nTô listando...\n\n\n");

                tx = session.beginTransaction();

                BolsistaDAO bolsistasDAO = new BolsistaDAO();

                bolsistas = session.createQuery("FROM Bolsista").list();  
                
                tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
                e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return bolsistas;
    }
    
    public Bolsista getBolsista(Integer bolsistaID){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            
            Bolsista bolsista = (Bolsista) session.createQuery("from bolsista where pk_bolsista = ?").setInteger(0, bolsistaID).uniqueResult();
            System.out.println("\n\n\nVou dar um get no bolsista\n\n\n");
            
            if (bolsista == null)
            {
                System.out.println("\n Didn't Work :(");
            }
            else
            {
                System.out.println("Noticia: " + bolsista.getNome_completo());
                return bolsista;
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
    
    /*public void updateEditor (String nomeEditor){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{            
            tx = session.beginTransaction();
            
            Editor editorNovo = new Editor();
            
            editorNovo.setEditor(nomeEditor);
            
            editorNovo.setPk_editor(1);
            
            session.update(editorNovo); 
            
            session.save(editorNovo);
            
            tx.commit();
            
            session.flush();                        
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
        } finally {
            session.close(); 
        }
    }*/
    
    
    public void updateBolsista (Integer bolsistaID, Bolsista bolsistaAntigo){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Bolsista bolsista = (Bolsista) session.createQuery("from Bolsista where pk_bolsista = ?").setInteger(0, bolsistaID).uniqueResult();
            
            bolsista.setEmail(bolsistaAntigo.getEmail());
            
            bolsista.setNome_completo(bolsistaAntigo.getNome_completo());
            
            bolsista.setSenha(bolsistaAntigo.getSenha());
            
            session.update(bolsista); 
            
            tx.commit();
            
            session.flush();                        
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
        } finally {
            session.close(); 
        }
    }
    
    /* Method to DELETE an employee from the records */
    public void deleteNoticia(Integer bolsistaID){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Bolsista bolsista = (Bolsista)session.get(Bolsista.class, bolsistaID); 
            session.delete(bolsista); 
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
        }finally {
            session.close(); 
        }
    }
    
}
