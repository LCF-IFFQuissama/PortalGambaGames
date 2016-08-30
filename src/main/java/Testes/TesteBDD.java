package Testes;

import EntidadesNoticias.HibernateUtil;
import EntidadesNoticias.NoticiaDAO;
import EntidadesNoticias.Noticia;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class TesteBDD {
    public static void main (String args[]){
        /*Session sessao = HibernateUtil.gimmeSession();
        
        Criteria crit = sessao.createCriteria(Aluno.class);
        
        List<Aluno> alunos = crit.list();
        
        AlunoDAO usuario = new AlunoDAO();

        for(Aluno aluno : alunos)
        {
            System.out.println("\nFirst Name: " + aluno.getPrimeiro_nome());
            System.out.print("\nLast Name: " + aluno.getSobrenome());
        }*/
        
        Session sessao = HibernateUtil.gimmeSession();
        
        Criteria crit = sessao.createCriteria(Noticia.class);
        
        List<Noticia> noticias = crit.list();
        
        NoticiaDAO noticiaDAO = new NoticiaDAO();

        for(Noticia noticia : noticias)
        {
            System.out.println("\nTitulo: " + noticia.getTitulo_noticia());
            System.out.print("\nSubtitulo: " + noticia.getSubtitulo_noticia());
        }
        
        /*NoticiaDAO noticia = new NoticiaDAO();
        
        noticia.listNoticias();*/
    }
}
