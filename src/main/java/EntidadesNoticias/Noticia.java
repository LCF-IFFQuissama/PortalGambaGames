package EntidadesNoticias;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "noticia")
public class Noticia implements Serializable {

    @Column(name = "texto_noticia")
    private String texto_noticia;

    @Column(name = "titulo_noticia")
    private String titulo_noticia;

    @Column(name = "subtitulo_noticia")
    private String subtitulo_noticia;

    @Column(name = "autor")
    private String autor;

    @Column(name = "data")
    private String data;

    @Column(name = "hora")
    private String hora;
    
/*
    variavel:=DateTostr(date); pega a data
    variavel:=Timetostr(time); pega a hora;
    
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_noticia")
    private Integer pk_noticia;

    // -------------------------- //
    public Noticia() {
    }

    public Integer getPk_noticia() {
        return pk_noticia;
    }

    public void setPk_noticia(Integer pk_noticia) {
        this.pk_noticia = pk_noticia;
    }

    public String getTitulo_noticia() {
        return titulo_noticia;
    }

    public void setTitulo_noticia(String titulo_noticia) {
        this.titulo_noticia = titulo_noticia;
    }

    public String getSubtitulo_noticia() {
        return subtitulo_noticia;
    }

    public void setSubtitulo_noticia(String subtitulo_noticia) {
        this.subtitulo_noticia = subtitulo_noticia;
    }

    public String getTexto_noticia() {
        return texto_noticia;
    }

    public void setTexto_noticia(String texto_noticia) {
        this.texto_noticia = texto_noticia;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor ) {
        this.autor = autor ;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
