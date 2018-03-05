package principal;
public class Partido {
    /**
     * variables para los metodos
     */
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
    /**
     * constructor para el el tipo de influencia (television, radio o internet)
     * @param influencia 
     */
    public Partido(int influencia){
        this.influencia = influencia;
    }
    /**metodo para enviar el dato influencia 
     * 
     * @param inf 
     */
    public void setInfluencia(int inf){
        this.influencia=inf;
    }
    /**
     * metodo para recibir el dato influencia 
     */
    public int getInfluencia(){
        return this.influencia;
    }
    /**
     * metodo para enviar costo 
     */
    public void setCosto(long cos){
        cos = cos + costo;
        this.costo=cos;
    }
    /**
     * metodo para recibir el costo
     * @return 
     */
    public long getCosto(){
        return this.costo;
    }
    /**
     * metodo para enviar el nombre del partido
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * metodo para recibir el nombre del partido
     * @return 
     */
    public String getNombre(){
        return this.nombre;
    } 
}

