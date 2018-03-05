package principal;
public class Partido {
    public long costo;
    public int influencia;
    /**
     * @param influencia
     * @param costo 
     */
    public Partido(long costo){
        this.costo = costo;
    }
    public Partido(int influencia){
        this.influencia = influencia;
    }
}
