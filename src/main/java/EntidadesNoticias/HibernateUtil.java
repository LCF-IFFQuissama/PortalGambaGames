package EntidadesNoticias;

import EntidadesBolsista.Bolsista;
import EntidadesProfessores.Professor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory factory; 
    
    static {
        try{
            Configuration configuration = new Configuration();
            configuration.configure();
            factory = new AnnotationConfiguration().configure()
                    .addAnnotatedClass(Noticia.class)
                    .addAnnotatedClass(Bolsista.class)
                    .addAnnotatedClass(Professor.class)
                    .buildSessionFactory();
        } catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static Session gimmeSession() {
        return factory.openSession();
    }
}
