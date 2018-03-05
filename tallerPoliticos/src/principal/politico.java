package principal;
public class politico{
    //inicializacion de variables
    public String nombres,apellidos,direccion,ciudadN,partido;
    public int documento,edad,telefono;
    
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
    
}
