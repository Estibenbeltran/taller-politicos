package principal;
public class politico extends Partido{
    //inicializacion de variables
    public String nombres,apellidos,direccion,ciudadN;
    public int documento,edad,telefono;
    int votosC,votosP; 
    /**
     * constructor para:
     * @param nombres
     * @param apellidos
     * @param documento
     * @param edad
     * @param telefono
     * @param direccion
     * @param ciudadN
     * @param partido 
     */    
    public politico(String nombres, String apellidos, int documento, int edad, int telefono, String direccion, String ciudadN, String nombre){
        //super invoca el metodo o constructor padre
        super(nombre);     
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.edad = edad; 
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudadN = ciudadN;
              
    }

  
}
