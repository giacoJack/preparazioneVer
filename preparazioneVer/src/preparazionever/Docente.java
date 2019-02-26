package preparazionever;

/**
 *
 * @author giacomelli_davide
 */
public class Docente {
    private String materia;
    private String nome;
    private Ora ora;
    
    
    public Docente(String nome, String materia, Ora ora){
        this.nome=nome;
        this.materia = materia;
        this.ora=ora;
    }
    public void setMateria(String materia){
        this.materia=materia;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setOra(Ora ora){
        this.ora=ora;
    }
    public Ora getOra(){
        return ora;
    }
    public String getMateria(){
        return materia;
    }
    public String getNome(){
        return nome;
    }
}
