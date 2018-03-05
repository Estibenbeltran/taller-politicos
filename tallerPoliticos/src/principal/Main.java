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
                int opc = leer.nextInt();
            switch(opc){
                case 0:
                    System.out.println("Has salido del programa para poder votar");
                break;
                case 1:
                    System.out.println("Lista de candidatos");
                    System.out.println("Tarjeton de aspirantes politicos, por cual candidato desea votar?");
                    System.out.println("El aspirante numero 1 es: "+politico1);
                    System.out.println("El aspirante numero 2 es: "+politico2);
                    System.out.println("El aspirante numero 3 es: "+politico3);
                    System.out.println("El aspirante numero 4 es: "+politico4);
                    System.out.println("El aspirante numero 5 es: "+politico5);
                    System.out.println("El aspirante numero 6 es: "+politico6);
                    System.out.println("El aspirante numero 7 es: "+politico7);
                    System.out.println("El aspirante numero 8 es: "+politico8);
                    System.out.println("El aspirante numero 9 es: "+politico9);
                break;
                case 1:
                break;
                
            }
        }
    }
}
