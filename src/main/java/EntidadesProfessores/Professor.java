package EntidadesProfessores;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "professor")
public class Professor implements Serializable {

    @Column(name = "primeiro_nome")
    private String primeiro_nome;

    @Column(name = "nome_completo")
    private String nome_completo;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_professor")
    private Integer pk_professor;

    // -------------------------- //
    public Professor() {
    }

    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPk_professor() {
        return pk_professor;
    }

    public void setPk_professor(Integer pk_professor) {
        this.pk_professor = pk_professor;
    }
    
    
}
