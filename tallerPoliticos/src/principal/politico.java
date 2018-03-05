package principal;
public class politico{
    //inicializacion de variables
    public String nombres,apellidos,direccion,ciudadN,partido;
    public int documento,edad,telefono;
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
    public politico(String nombres, String apellidos, int documento, int edad, int telefono, String direccion, String ciudadN, String partido){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.edad = edad; 
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudadN = ciudadN;
        this.partido = partido;            
    }

    politico() {
        System.out.println("los politicos funcionan"); //To change body of generated methods, choose Tools | Templates.
    }

  
}
