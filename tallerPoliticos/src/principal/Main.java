package principal;
import java.util.Scanner;
import principal.politico;
import principal.Partido;
/**
 *@version 1.0
 * @author Dairo Estiben Beltran Martinez
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        int opc=20, conP=0,conL=0,conV=0,conM=0,cT=0,cR=0,cI=0;
        //creacion de los costos por partido
        long costosPolo=0,costosLiberal=0,costosVerde=0,costosMira=0;
        //instanceado de partidos
        Partido polo = new Partido(3000000000l);
        Partido liberal = new Partido(2000000000l);
        Partido verde = new Partido(1000000000l);
        Partido mira = new Partido(500000000l);
        //instanceado de las variables politicos
        politico politico1 = new politico("Carlos Alberto", "Martinez Velandia", 62377111, 26, 3845265, "cll 5 a sur","Villeta (Cundinamarca)", "Polo");
        politico politico2 = new politico("Andres Camilo", "Beltran Ovalle", 80895881, 30, 9684528,"cll  6 norte","Facatativa (Cundinamarca)", "Polo");
        politico politico3 = new politico("Ana Lucia", "Lee Cano", 21114308, 43, 3986542, "cll 9 sur","Villeta (Cundinamarca)", "Polo");
        politico politico4 = new politico("Ilifonso", "Leon Perez", 80277881, 48, 3845265, "cll 4 a norte","Facatativa (Cundinamarca)", "Liberal");
        politico politico5 = new politico("Catherin Andrea", "Lopez Preciado", 89549789, 21, 8646464, "cra 6 a sur","Villeta (Cundinamarca)", "liberal");
        politico politico6 = new politico("Yeison Mauricio", "Martinez Martinez", 10709890, 29, 31435560, "cra 2 sur","Villeta (Cundinamarca)", "Verde");
        politico politico7 = new politico("William Alberto", "Rodriguez Cepeda", 107066645, 33, 9852467, "cll 5 a sur 4-12","Bogota", "Verde");
        politico politico8 = new politico("Edinson Ferney", "Alvarez Vivas", 90123564, 44, 9866478, "cll 23ab sur","Sasaima (Cundinamarca)", "Mira");
        politico politico9 = new politico("Dairo Estiben", "Beltran Martinez", 1070989058, 18, 3845265, "cll 32 a sur 9-22","Quebradanegra (Cundinamarca)", "Mira");
        //instanceado de influencias
        Partido tele = new Partido(200000);
        Partido radio = new Partido(150000);
        Partido internet = new Partido(10000);
        //creacion del menu
        while(opc!=0){
                System.out.println("Bienvenido, que desea hacer?"); 
                System.out.println("1)Ver la lista de los candidatos");
                System.out.println("2)Votar por un candidato");
                System.out.println("3)Ver el total de votos por candidato y partido politico");
                System.out.println("4)Ver el costo promedio por partido politico");
                System.out.println("0)Salir");
                opc = leer.nextInt();
                while(opc<0 || opc>4){
                    System.out.println("opcion invalida");
                    opc = leer.nextInt();
                }
                switch(opc){
                    case 0:
                        //aqui se finaliza el programa
                        System.out.println("Has salido del programa para poder votar");
                    break;
                    case 1:
                        //listado de candidatos
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
                        System.out.println("Por cual Aspirante desea votar?");
                        System.out.println("1 Apirante (nombres) "+politico1.nombres);
                        System.out.println("2 Apirante (nombres) "+politico2.nombres);
                        System.out.println("3 Apirante (nombres) "+politico3.nombres);
                        System.out.println("4 Apirante (nombres) "+politico4.nombres);
                        System.out.println("5 Apirante (nombres) "+politico5.nombres);
                        System.out.println("6 Apirante (nombres) "+politico6.nombres);
                        System.out.println("7 Apirante (nombres) "+politico7.nombres);
                        System.out.println("8 Apirante (nombres) "+politico8.nombres);
                        System.out.println("9 Apirante (nombres) "+politico9.nombres);
                        opc = leer2.nextInt();
                            while(opc<1 || opc>9){
                                    System.out.println("opcion invalida");
                                    opc = leer2.nextInt();
                            }
                        switch(opc){
                            //contadores para la cantidad de votos por candidato
                            case 1:
                                //los tres primeros candidatos son de polo, por lo tanto al sumar los votos de los candidatos
                                //da el resultado de los votos al partido
                                politico1.votosC++; 
                                //contador para el partido conP
                                conP = politico1.votosC+politico2.votosC+politico3.votosC;
                                System.out.println("Por que metodo publicitario se vio influenciado?");
                                System.out.println("1)Voto influenciado por publicidad en Televisión");
                                System.out.println("2)Voto influenciado por publicidad en Radio");
                                System.out.println("3)Voto influenciado por publicidad en Internet");
                                opc = leer.nextInt();
                                while(opc<1 || opc>3){
                                    System.out.println("opcion invalida");
                                    opc = leer.nextInt();
                                }
                                switch(opc){
                                    case 1:
                                        polo.costo = tele.influencia+polo.costo;
                                    break;
                                    case 2:
                                        polo.costo = radio.influencia+polo.costo;
                                    break;
                                    case 3:
                                        polo.costo = internet.influencia+polo.costo;
                                    break;
                                }                            
                            break;
                            case 2:
                                politico2.votosC++; 
                                conP = politico1.votosC+politico2.votosC+politico3.votosC;
                                System.out.println("Por que metodo publicitario se vio influenciado?");
                                System.out.println("1)Voto influenciado por publicidad en Televisión");
                                System.out.println("2)Voto influenciado por publicidad en Radio");
                                System.out.println("3)Voto influenciado por publicidad en Internet");
                                opc = leer.nextInt();
                                while(opc<1 || opc>3){
                                    System.out.println("opcion invalida");
                                    opc = leer.nextInt();
                                }
                                switch(opc){
                                    case 1:
                                        polo.costo = tele.influencia+polo.costo;
                                    break;
                                    case 2:
                                        polo.costo = radio.influencia+polo.costo;
                                    break;
                                    case 3:
                                        polo.costo = internet.influencia+polo.costo;
                                    break;
                                } 
                            break;
                            case 3:
                                politico3.votosC++;
                                conP = politico1.votosC+politico2.votosC+politico3.votosC;
                                System.out.println("Por que metodo publicitario se vio influenciado?");
                                System.out.println("1)Voto influenciado por publicidad en Televisión");
                                System.out.println("2)Voto influenciado por publicidad en Radio");
                                System.out.println("3)Voto influenciado por publicidad en Internet");
                                opc = leer.nextInt();
                                while(opc<1 || opc>3){
                                    System.out.println("opcion invalida");
                                    opc = leer.nextInt();
                                }
                                 switch(opc){
                                    case 1:
                                        polo.costo = tele.influencia+polo.costo;
                                    break;
                                    case 2:
                                        polo.costo = radio.influencia+polo.costo;
                                    break;
                                    case 3:
                                        polo.costo = internet.influencia+polo.costo;
                                    break;
                                } 
                            break;
                            case 4:
                                politico4.votosC++;
                                conL = politico4.votosC+politico5.votosC;
                                System.out.println("Por que metodo publicitario se vio influenciado?");
                                System.out.println("1)Voto influenciado por publicidad en Televisión");
                                System.out.println("2)Voto influenciado por publicidad en Radio");
                                System.out.println("3)Voto influenciado por publicidad en Internet");
                                opc = leer.nextInt();
                                while(opc<1 || opc>3){
                                    System.out.println("opcion invalida");
                                    opc = leer.nextInt();
                                }
                                switch(opc){
                                    case 1:
                                        polo.costo = tele.influencia+polo.costo;
                                    break;
                                    case 2:
                                        polo.costo = radio.influencia+polo.costo;
                                    break;
                                    case 3:
                                        polo.costo = internet.influencia+polo.costo;
                                    break;
                                } 
                            break;
                            case 5:
                                politico5.votosC++;
                                conL = politico4.votosC+politico5.votosC;
                                System.out.println("Por que metodo publicitario se vio influenciado?");
                                System.out.println("1)Voto influenciado por publicidad en Televisión");
                                System.out.println("2)Voto influenciado por publicidad en Radio");
                                System.out.println("3)Voto influenciado por publicidad en Internet");
                                opc = leer.nextInt();
                                while(opc<1 || opc>3){
                                    System.out.println("opcion invalida");
                                    opc = leer.nextInt();
                                }
                                switch(opc){
                                    case 1:
                                        polo.costo = tele.influencia+polo.costo;
                                    break;
                                    case 2:
                                        polo.costo = radio.influencia+polo.costo;
                                    break;
                                    case 3:
                                        polo.costo = internet.influencia+polo.costo;
                                    break;
                                } 
                            break;
                            case 6:
                                politico6.votosC++;
                                conV = politico6.votosC+politico7.votosC;
                                System.out.println("Por que metodo publicitario se vio influenciado?");
                                System.out.println("1)Voto influenciado por publicidad en Televisión");
                                System.out.println("2)Voto influenciado por publicidad en Radio");
                                System.out.println("3)Voto influenciado por publicidad en Internet");
                                opc = leer.nextInt();
                                while(opc<1 || opc>3){
                                    System.out.println("opcion invalida");
                                    opc = leer.nextInt();
                                }
                                switch(opc){
                                    case 1:
                                        polo.costo = tele.influencia+polo.costo;
                                    break;
                                    case 2:
                                        polo.costo = radio.influencia+polo.costo;
                                    break;
                                    case 3:
                                        polo.costo = internet.influencia+polo.costo;
                                    break;
                                } 
                            break;
                            case 7:
                                politico7.votosC++;
                                conV = politico6.votosC+politico7.votosC;
                                System.out.println("Por que metodo publicitario se vio influenciado?");
                                System.out.println("1)Voto influenciado por publicidad en Televisión");
                                System.out.println("2)Voto influenciado por publicidad en Radio");
                                System.out.println("3)Voto influenciado por publicidad en Internet");
                                opc = leer.nextInt();
                                while(opc<1 || opc>3){
                                    System.out.println("opcion invalida");
                                    opc = leer.nextInt();
                                }
                                switch(opc){
                                    case 1:
                                        polo.costo = tele.influencia+polo.costo;
                                    break;
                                    case 2:
                                        polo.costo = radio.influencia+polo.costo;
                                    break;
                                    case 3:
                                        polo.costo = internet.influencia+polo.costo;
                                    break;
                                } 
                            break;
                            case 8:
                                politico8.votosC++;
                                conM = politico8.votosC+politico9.votosC;
                                System.out.println("Por que metodo publicitario se vio influenciado?");
                                System.out.println("1)Voto influenciado por publicidad en Televisión");
                                System.out.println("2)Voto influenciado por publicidad en Radio");
                                System.out.println("3)Voto influenciado por publicidad en Internet");
                                opc = leer.nextInt();
                                while(opc<1 || opc>3){
                                    System.out.println("opcion invalida");
                                    opc = leer.nextInt();
                                }
                                switch(opc){
                                    case 1:
                                        polo.costo = tele.influencia+polo.costo;
                                    break;
                                    case 2:
                                        polo.costo = radio.influencia+polo.costo;
                                    break;
                                    case 3:
                                        polo.costo = internet.influencia+polo.costo;
                                    break;
                                } 
                            break;
                            case 9:
                                politico9.votosC++;
                                conM = politico8.votosC+politico9.votosC;
                                System.out.println("Por que metodo publicitario se vio influenciado?");
                                System.out.println("1)Voto influenciado por publicidad en Televisión");
                                System.out.println("2)Voto influenciado por publicidad en Radio");
                                System.out.println("3)Voto influenciado por publicidad en Internet");
                                opc = leer.nextInt();
                                while(opc<1 || opc>3){
                                    System.out.println("opcion invalida");
                                    opc = leer.nextInt();
                                }
                                switch(opc){
                                    case 1:
                                        polo.costo = tele.influencia+polo.costo;
                                    break;
                                    case 2:
                                        polo.costo = radio.influencia+polo.costo;
                                    break;
                                    case 3:
                                        polo.costo = internet.influencia+polo.costo;
                                    break;
                                } 
                            break;
                        }
                    break;
                    case 3:
                        //mostrar datos del total de votos por candidato y partido
                        System.out.println("El aspirante numero 1 "+politico1.nombres+" obtuvo "+politico1.votosC+" votos(partido Polo)"); 
                        System.out.println("El aspirante numero 2 "+politico2.nombres+" obtuvo "+politico2.votosC+" votos(partido Polo)");
                        System.out.println("El aspirante numero 3 "+politico3.nombres+" obtuvo "+politico3.votosC+" votos(partido Polo)");
                        System.out.println("El aspirante numero 4 "+politico4.nombres+" obtuvo "+politico4.votosC+" votos(partido liberal)");
                        System.out.println("El aspirante numero 5 "+politico5.nombres+" obtuvo "+politico5.votosC+" votos(partido Liberal)");
                        System.out.println("El aspirante numero 6 "+politico6.nombres+" obtuvo "+politico6.votosC+" votos(partido Verde)");
                        System.out.println("El aspirante numero 7 "+politico7.nombres+" obtuvo "+politico7.votosC+" votos(partido Verde)");
                        System.out.println("El aspirante numero 8 "+politico8.nombres+" obtuvo "+politico8.votosC+" votos(partido Mira)");
                        System.out.println("El aspirante numero 9 "+politico9.nombres+" obtuvo "+politico9.votosC+" votos(partido Mira)");
                        //votos partidos politicos
                        System.out.println("El partido politico Polo obtuvo "+conP+" votos");
                        System.out.println("El partido politico Liberal obtuvo "+conL+" votos");
                        System.out.println("El partido politico Verde obtuvo "+conV+" votos");
                        System.out.println("El partido politico Mira obtuvo "+conM+" votos");
                        
                    break;
                    case 4:
                        //costo promedio por partidos politicos
                        System.out.println("El partido politico Polo tuvo un costo promedio de: "+costosPolo);
                        System.out.println("El partido politico Liberal tuvo un costo promedio de: "+costosLiberal);
                        System.out.println("El partido politico Verde tuvo un costo promedio de: "+costosVerde);
                        System.out.println("El partido politico Mira tuvo un costo promedio de: "+costosMira);
                    break;
                
            }
        }
    }
}
