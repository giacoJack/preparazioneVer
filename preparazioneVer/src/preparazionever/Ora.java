package preparazionever;

/**
 *
 * @author giacomelli_davide
 */
class Ora {
    private int ora;
    private int minuti;
    
    public Ora(int ora, int minuti){
        this.minuti=minuti;
        this.ora=ora;
    }
    
    public void setOra(int ora){
        this.ora=ora;
    }
    public void setMinuti(int min){
        this.minuti=min;
    }
    public int getOra(){
        return ora;
    }
    public int getMinuti(){
        return minuti;
    }
}
