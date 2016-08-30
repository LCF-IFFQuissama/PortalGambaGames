package EntidadesProfessores;

import EntidadesNoticias.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProfessorDAO {
    
    public Integer addProfessor (Professor professor){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        Integer professorID = null;
        try{
            tx = session.beginTransaction();
                        
            professorID = (Integer) session.save(professor);
            
            session.flush();                              
            
            tx.commit();
            
        }catch (HibernateException e) {
            if (tx!=null)
                tx.rollback();
            e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        
        return professorID;
    }
    
    public List<Professor> listProfessor(){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        List professores = null;
        try{
                System.out.println("\n\n\n\nTô listando...\n\n\n");

                tx = session.beginTransaction();

                ProfessorDAO professorDAO = new ProfessorDAO();

                professores = session.createQuery("FROM Professor").list();  
                
                tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
                e.printStackTrace(); 
        }finally {
            session.close(); 
        }
        return professores;
    }
    
    public Professor getProfessor(Integer ProfessorID){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            
            Professor professor = (Professor) session.createQuery("from professor where pk_professor = ?").setInteger(0,ProfessorID).uniqueResult();
            
            if (professor != null)
            {
                return professor;
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
    
    public void updateProfessor (Integer ProfessorID, Professor professorAntigo){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Professor professor = (Professor) session.createQuery("from Professor where pk_professor = ?").setInteger(0, ProfessorID).uniqueResult();
            
            professor.setEmail(professorAntigo.getEmail());
            
            professor.setNome_completo(professorAntigo.getNome_completo());
            
            professor.setSenha(professorAntigo.getSenha());
            
            session.update(professor); 
            
            tx.commit();
            
            session.flush();                        
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
        } finally {
            session.close(); 
        }
    }
    
    public void deleteProfessor(Integer ProfessorID){
        Session session = HibernateUtil.gimmeSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Professor professor = (Professor)session.get(Professor.class, ProfessorID); 
            session.delete(professor); 
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
        }finally {
            session.close(); 
        }
    }
}
