package principal;
import java.util.Scanner;
import principal.politico;
/**
 *@version 1.0
 * @author Dairo Estiben Beltran Martinez
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        int opc=20;
        //instanceado de las variables
        politico politico1 = new politico("Carlos Alberto", "Martinez Velandia", 62377111, 26, 3845265, "cll 5 a sur","Villeta (Cundinamarca)", "Polo");
        politico politico2 = new politico("Andres Camilo", "Beltran Ovalle", 80895881, 30, 9684528,"cll  6 norte","Facatativa (Cundinamarca)", "Polo");
        politico politico3 = new politico("Ana Lucia", "Lee Cano", 21114308, 43, 3986542, "cll 9 sur","Villeta (Cundinamarca)", "Polo");
        politico politico4 = new politico("Ilifonso", "Leon Perez", 80277881, 48, 3845265, "cll 4 a norte","Facatativa (Cundinamarca)", "Liberal");
        politico politico5 = new politico("Catherin Andrea", "Lopez Preciado", 89549789, 21, 8646464, "cra 6 a sur","Villeta (Cundinamarca)", "liberal");
        politico politico6 = new politico("Yeison Mauricio", "Martinez Martinez", 10709890, 29, 31435560, "cra 2 sur","Villeta (Cundinamarca)", "Verde");
        politico politico7 = new politico("William Alberto", "Rodriguez Cepeda", 107066645, 33, 9852467, "cll 5 a sur 4-12","Bogota", "Verde");
        politico politico8 = new politico("Edinson Ferney", "Alvarez Vivas", 90123564, 44, 9866478, "cll 23ab sur","Sasaima (Cundinamarca)", "Mira");
        politico politico9 = new politico("Dairo Estiben", "Beltran Martinez", 1070989058, 18, 3845265, "cll 32 a sur 9-22","Quebradanegra (Cundinamarca)", "Mira");
        //creacion del menu
        while(opc!=0){
                System.out.println("Bienvenido, que desea hacer?"); 
                System.out.println("1)Ver la lista de los candidatos");
                System.out.println("2)Votar por un candidato");
                System.out.println("3)Ver el total de votos por candidato y partido politico");
                System.out.println("4)Ver el costo promedio por partido politico");
                System.out.println("0)Salir");
                opc = leer.nextInt();
                switch(opc){
                    case 0:
                        //aqui se finaliza el programa
                        System.out.println("Has salido del programa para poder votar");
                    break;
                    case 1:
                        //listado de candidatos
                        System.out.println("Lista de candidatos");
                        System.out.println("Tarjeton de aspirantes politicos");
                        System.out.println("El aspirante numero 1 es: (nombres) "+politico1.nombres+" (apellidos) "+politico1.apellidos+" (documento) "+politico1.documento+" (edad) "+politico1.edad+" (telefono) "+politico1.telefono+" (direccion) "+politico1.direccion+" (ciudad de nacimiento) "+politico1.ciudadN+" partido politico "+politico1.partido);
                        System.out.println("El aspirante numero 2 es: (nombres) "+politico2.nombres+" (apellidos) "+politico2.apellidos+" (documento) "+politico2.documento+" (edad) "+politico2.edad+" (telefono) "+politico2.telefono+" (direccion) "+politico2.direccion+" (ciudad de nacimiento) "+politico2.ciudadN+" partido politico "+politico2.partido);
                        System.out.println("El aspirante numero 3 es: (nombres) "+politico3.nombres+" (apellidos) "+politico3.apellidos+" (documento) "+politico2.documento+" (edad) "+politico3.edad+" (telefono) "+politico1.telefono+" (direccion) "+politico3.direccion+" (ciudad de nacimiento) "+politico3.ciudadN+" partido politico "+politico3.partido);
                        System.out.println("El aspirante numero 4 es: (nombres) "+politico4.nombres+" (apellidos) "+politico4.apellidos+" (documento) "+politico4.documento+" (edad) "+politico4.edad+" (telefono) "+politico4.telefono+" (direccion) "+politico4.direccion+" (ciudad de nacimiento) "+politico4.ciudadN+" partido politico "+politico4.partido);
                        System.out.println("El aspirante numero 5 es: (nombres) "+politico5.nombres+" (apellidos) "+politico5.apellidos+" (documento) "+politico5.documento+" (edad) "+politico5.edad+" (telefono) "+politico5.telefono+" (direccion) "+politico5.direccion+" (ciudad de nacimiento) "+politico5.ciudadN+" partido politico "+politico5.partido);
                        System.out.println("El aspirante numero 6 es: (nombres) "+politico6.nombres+" (apellidos) "+politico6.apellidos+" (documento) "+politico6.documento+" (edad) "+politico6.edad+" (telefono) "+politico6.telefono+" (direccion) "+politico6.direccion+" (ciudad de nacimiento) "+politico6.ciudadN+" partido politico "+politico6.partido);
                        System.out.println("El aspirante numero 7 es: (nombres) "+politico7.nombres+" (apellidos) "+politico7.apellidos+" (documento) "+politico7.documento+" (edad) "+politico7.edad+" (telefono) "+politico7.telefono+" (direccion) "+politico7.direccion+" (ciudad de nacimiento) "+politico7.ciudadN+" partido politico "+politico7.partido);
                        System.out.println("El aspirante numero 8 es: (nombres) "+politico8.nombres+" (apellidos) "+politico8.apellidos+" (documento) "+politico8.documento+" (edad) "+politico8.edad+" (telefono) "+politico8.telefono+" (direccion) "+politico8.direccion+" (ciudad de nacimiento) "+politico8.ciudadN+" partido politico "+politico8.partido);
                        System.out.println("El aspirante numero 9 es: (nombres) "+politico9.nombres+" (apellidos) "+politico9.apellidos+" (documento) "+politico9.documento+" (edad) "+politico9.edad+" (telefono) "+politico9.telefono+" (direccion) "+politico9.direccion+" (ciudad de nacimiento) "+politico9.ciudadN+" partido politico "+politico9.partido);
                    break;
                    case 2:
                        //se da la opcion de por cual candidato se desea votar
                        System.out.println("Por cual candidato desea votar?");
                        System.out.println("El aspirante numero 1 es: (nombres) "+politico1.nombres+" (apellidos) "+politico1.apellidos+" (documento) "+politico1.documento+" (edad) "+politico1.edad+" (telefono) "+politico1.telefono+" (direccion) "+politico1.direccion+" (ciudad de nacimiento) "+politico1.ciudadN+" partido politico "+politico1.partido);
                        System.out.println("El aspirante numero 2 es: (nombres) "+politico2.nombres+" (apellidos) "+politico2.apellidos+" (documento) "+politico2.documento+" (edad) "+politico2.edad+" (telefono) "+politico2.telefono+" (direccion) "+politico2.direccion+" (ciudad de nacimiento) "+politico2.ciudadN+" partido politico "+politico2.partido);
                        System.out.println("El aspirante numero 3 es: (nombres) "+politico3.nombres+" (apellidos) "+politico3.apellidos+" (documento) "+politico2.documento+" (edad) "+politico3.edad+" (telefono) "+politico1.telefono+" (direccion) "+politico3.direccion+" (ciudad de nacimiento) "+politico3.ciudadN+" partido politico "+politico3.partido);
                        System.out.println("El aspirante numero 4 es: (nombres) "+politico4.nombres+" (apellidos) "+politico4.apellidos+" (documento) "+politico4.documento+" (edad) "+politico4.edad+" (telefono) "+politico4.telefono+" (direccion) "+politico4.direccion+" (ciudad de nacimiento) "+politico4.ciudadN+" partido politico "+politico4.partido);
                        System.out.println("El aspirante numero 5 es: (nombres) "+politico5.nombres+" (apellidos) "+politico5.apellidos+" (documento) "+politico5.documento+" (edad) "+politico5.edad+" (telefono) "+politico5.telefono+" (direccion) "+politico5.direccion+" (ciudad de nacimiento) "+politico5.ciudadN+" partido politico "+politico5.partido);
                        System.out.println("El aspirante numero 6 es: (nombres) "+politico6.nombres+" (apellidos) "+politico6.apellidos+" (documento) "+politico6.documento+" (edad) "+politico6.edad+" (telefono) "+politico6.telefono+" (direccion) "+politico6.direccion+" (ciudad de nacimiento) "+politico6.ciudadN+" partido politico "+politico6.partido);
                        System.out.println("El aspirante numero 7 es: (nombres) "+politico7.nombres+" (apellidos) "+politico7.apellidos+" (documento) "+politico7.documento+" (edad) "+politico7.edad+" (telefono) "+politico7.telefono+" (direccion) "+politico7.direccion+" (ciudad de nacimiento) "+politico7.ciudadN+" partido politico "+politico7.partido);
                        System.out.println("El aspirante numero 8 es: (nombres) "+politico8.nombres+" (apellidos) "+politico8.apellidos+" (documento) "+politico8.documento+" (edad) "+politico8.edad+" (telefono) "+politico8.telefono+" (direccion) "+politico8.direccion+" (ciudad de nacimiento) "+politico8.ciudadN+" partido politico "+politico8.partido);
                        System.out.println("El aspirante numero 9 es: (nombres) "+politico9.nombres+" (apellidos) "+politico9.apellidos+" (documento) "+politico9.documento+" (edad) "+politico9.edad+" (telefono) "+politico9.telefono+" (direccion) "+politico9.direccion+" (ciudad de nacimiento) "+politico9.ciudadN+" partido politico "+politico9.partido);
                        opc = leer.nextInt();
                        
                    break;
                    case 3:
                    break;
                    case 4:
                    break;
                
            }
        }
    }
}
