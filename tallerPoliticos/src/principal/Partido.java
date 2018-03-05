package principal;
public class Partido {
    private long costo;
    private int influencia;
    private String nombre;
    
    public Partido(String nombre){
        this.nombre=nombre;
    }
    /**
     * @param costo 
     */
    public Partido(long costo, String nombre){
        this.costo = costo;
        this.nombre = nombre;
    }
    //metodos de encapsulamiento
    public Partido(int influencia){
        this.influencia = influencia;
    }
    //metodo que establece un valor (polimorfismo)
    public void setInfluencia(int inf){
        this.influencia=inf;
    }
    public int getInfluencia(){
        return this.influencia;
    }
    public void setCosto(long cos){
        cos = cos + costo;
        this.costo=cos;
    }
    public long getCosto(){
        return this.costo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    } 
}

