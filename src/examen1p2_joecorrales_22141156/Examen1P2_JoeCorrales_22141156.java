package examen1p2_joecorrales_22141156;

import java.util.ArrayList;
import java.util.Scanner;

/** @author Joe Corrales */
public class Examen1P2_JoeCorrales_22141156 {
    static ArrayList<Persona> heroes = new ArrayList<>();
    static ArrayList<Persona> villanos = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        do {
            switch (menu()) {
                case 1: { /* opcionesUniverso(); */ } break;
                case 2: { /* opcionesUniverso(); */ } break;
                case 3: { /* opcionesUniverso(); */ } break;
                case 4: { System.exit(0); } break;
//                case 1: { /*crearUniverso();*/ } break;
//                case 2: { /*modificarUniverso();*/ } break;
//                case 3: { /*listarUniverso();*/ } break;
//                case 4: { /**/ } break;
            }
        } while (true);
        
    }
    
    //Menu
    private static int menu() {
        int opcion = myNextInt("\n[=== Menu ===]"
                + "\nOpciones: "
                + "\n1. Opciones Universo"
                + "\n2. Opciones Escuadron"
                + "\n3. Opciones Persona"
                + "\nOpcion: ");
        return opcion;
    }
    
    private static int opcionesUniverso() {
        int opcion = myNextInt("\n[=== Menu Universo ===]"
                + "\nOpciones: "
                + "\n1. Crear Universo"
                + "\n2. Modificar Universo"
                + "\n3. Eliminar Universo"
                + "\n4. Listar Universo"
                + "\n0. Salir");
        return opcion;
    }
    
    private static void crudUniverso(int opcion) {
        switch(opcion) {
            
        }
    }
    
    
//    private static void crearPersonaje() {
//        System.out.println("\n[=== Crear personaje ===]");
//        int opcion = myNextInt("\n[=== Tipo de personaje ===]"
//                + "\n1. Persona Normal"
//                + "\n2. Super Humano"
//                + "\n3. Accidente radioactivo"
//                + "\n4. Mutante"
//                + "\n5. Deidad"
//                + "\n6. Alien"
//                + "\nOpcion: ");
//        tipo(opcion);
//    }
    
//    private static void tipo(int opcion) {
//        System.out.println("Ingrese el apellido para verificar");
//        String apellido = myNextString("Apellido: ");
//        String nombre = null; int edad = 0; int ptsVida = 0;
//        
//        if (verificarApellido(personaje)) {
//            nombre = myNextString("Nombre: ");
//            edad = myNextInt("Edad: ");
//            ptsVida = myNextInt("Puntos de vida: ");
//        }
//        
//        switch (opcion) {
//            case 1: {
//                PersonaNormal a = new PersonaNormal(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica, tieneEscuadron);
//                agregarAldeano(a);
//            }
//                break;
//            case 2: {
//                String discurso = myNextString("Ingresa el discurso: ");
//                Pacifista al = new Pacifista(nombre, apellido, edad, ptsVida, discurso);
//                agregarAldeano(al);
//            }
//                break;
//            case 3: {
//                Herrero ald = new Herrero(nombre, apellido, edad, ptsVida);
//                agregarAldeano(ald);
//            }
//                break;                 
//            case 4: {
//                Agronomo alde = new Agronomo(nombre, apellido, edad, ptsVida);
//                agregarAldeano(alde);
//            }
//                break;
//            case 5: {
//                Explosivo aldea = new Explosivo(nombre, apellido, edad, ptsVida);
//                agregarAldeano(aldea);
//            }
//                break;
//            default:
//                System.out.println("No disponible");
//        }
//    } 
    
    private static boolean verificarPersonaje(String nPersonaje, ArrayList<Persona> personajes) {
        for(Persona personaje : personajes) {
            if (personaje.getNombre().equalsIgnoreCase(nPersonaje)) {
                System.out.println("Ya existe un personaje con ese nombre!");
                return false;
            }
        }
        return true;
    }
    
    //Funcion para pedir un entero
    public static int myNextInt(String mensaje) {
        System.out.print(mensaje);
        return input.nextInt();
    }
    
    //Funcion para pedir una cadena
    public static String myNextString(String mensaje) {
        input.useDelimiter("\n");
        System.out.print(mensaje);
        return input.next();
    }
}
