package examen1p2_joecorrales_22141156;

import java.util.ArrayList;
import java.util.Scanner;

/** @author Joe Corrales */
public class Examen1P2_JoeCorrales_22141156 {
    static ArrayList<Persona> heroes = new ArrayList<>();
    static ArrayList<Persona> villanos = new ArrayList<>();
    static ArrayList<Escuadron> escuadrones = new ArrayList<>();
    static ArrayList<Universo> universos = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        main();
    }
    
    private static void main() {
        do {
            switch (menu()) {
                case 1: { opcionesUniverso(); } break;
                case 2: { opcionesEscuadron(); } break;
                case 3: { /* opcionesPersona(); */ } break;
                case 4: { System.exit(0); } break;
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
                + "\n4. Salir"
                + "\nOpcion: ");
        return opcion;
    }
    
    private static void opcionesUniverso() {
        int opcion = myNextInt("\n[=== Menu Universo ===]"
                + "\nOpciones: "
                + "\n1. Crear Universo"
                + "\n2. Modificar Universo"
                + "\n3. Eliminar Universo"
                + "\n4. Listar Universo"
                + "\n0. Salir"
                + "\nOpcion: ");
        crudUniverso(opcion);
    }
    
    private static void opcionesEscuadron() {
        int opcion = myNextInt("\n[=== Menu Universo ===]"
                + "\nOpciones: "
                + "\n1. Crear Escuadron"
                + "\n2. Modificar Escuadron"
                + "\n3. Eliminar Escuadron"
                + "\n4. Listar Escuadron"
                + "\n0. Salir"
                + "\nOpcion: ");
        crudEscuadron(opcion);
    }
    
    private static void crudUniverso(int opcion) {
        switch(opcion) {
            
            case 1: { 
                System.out.println("\n[=== Creacion de Universo ===]");
                String nombre = myNextString("Nombre del universo: ");
                if(buscarUniverso(nombre) == null) {
                    universos.add(new Universo(nombre));
                    System.out.println("Universo creado!");
                }
                else System.out.println("Ya existe un universo con ese nombre!");
                opcionesUniverso();
            } break;
            
            case 2: { 
                System.out.println("\n[=== Modificacion de Universo ===]");
                String nombre = myNextString("Nombre del universo a modificar: ");
                if((buscarUniverso(nombre) != null)) {
                    String nombre2 = myNextString("Nuevo nombre del universo: ");
                    buscarUniverso(nombre).setNombre(nombre2);
                    System.out.println("Universo modificado!");
                }
                opcionesUniverso();
            } break;
            
            case 3: { 
                System.out.println("\n[=== Eliminar un universo ===]");
                System.out.println("\nSe imprimiran los universos...");
                listarUniverso();
                int i = myNextInt("Ingrese la posicion a borrar: ");
                universos.remove(i);
                opcionesUniverso();
            } break;
            
            case 4: { 
                System.out.println("[=== Lista ===]");
                listarUniverso();
                opcionesUniverso();
            } break;
            
            case 0: { main(); } break;
            
            default: System.out.println("Opcion invalida!");
        }
    }
    
    {
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
    }
    
    private static boolean verificarUniverso(String nombre) {
        for(Universo universo : universos) {
            if (universo.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ya existe un universo con ese nombre!");
                return false;
            }
        }
        return true;
    }
    
    private static Universo buscarUniverso(String nombre) {
        for (Universo universo : universos) {
            if(universo.getNombre().equalsIgnoreCase(nombre)) 
                return universo;
        }
        return null;
    }
    
    private static void listarUniverso() {
        int i = 0;
        for (Universo universo : universos) {
            System.out.println("\n["+i+"] " + universo.toString()+"\n");
            i++;
        }
    }
    
    private static void crudEscuadron(int opcion) {
        switch(opcion) {
            case 1: { 
                System.out.println("\n[=== Creacion de Escuadron ===]");
                String nombre = myNextString("Nombre del Escuadron: ");
                String lugarBase = myNextString("Lugar de Base: ");
                String tipoPersonaje = myNextString("Tipo de personajes: ");
                if(buscarEscuadron(nombre) == null) escuadrones.add(new Escuadron(nombre, lugarBase, tipoPersonaje));
                else System.out.println("Ya existe un escuadron con ese nombre!");
                opcionesEscuadron();
            } break;
            
            case 2: { 
                System.out.println("\n[=== Modificacion de Escuadron ===]");
                String nombre = myNextString("Nombre del escuadron a modificar: ");
                if(buscarUniverso(nombre) != null) {
                    String nombre2 = myNextString("Nuevo nombre del escuadron: ");
                    String lugarBase = myNextString("Nuevo Lugar de Base: ");
                    String tipoPersonaje = myNextString("Cambio Tipo de personajes: ");
                    buscarEscuadron(nombre).setNombre(nombre2);
                    buscarEscuadron(nombre).setLugarBase(lugarBase);
                    buscarEscuadron(nombre).setTipoPersonaje(tipoPersonaje);
                } else System.out.println("No existe!");
                opcionesEscuadron();
            } break;
            
            case 3: { 
                System.out.println("\n[=== Eliminar un Escuadron ===]");
                System.out.println("\nSe imprimiran los escuadrones...");
                listarEscuadrones();
                int i = myNextInt("Ingrese la posicion a borrar: ");
                escuadrones.remove(i);
                System.out.println("Escuadron eliminado!");
                opcionesEscuadron();
            } break;
            
            case 4: { 
                System.out.println("[=== Lista ===]");
                listarEscuadrones();
                opcionesEscuadron();
            } break;
            
            case 5: {
                
            } break;
            
            case 0: { main(); } break;
            
            default: System.out.println("Opcion invalida!");
        }
    }
    
    private static Escuadron buscarEscuadron(String nombre) {
        for (Escuadron escuadron : escuadrones) {
            if(escuadron.getNombre().equalsIgnoreCase(nombre)) 
                return escuadron;
        }
        return null;
    }
    
    private static void listarEscuadrones() {
        int i = 0;
        for (Escuadron escuadron : escuadrones) {
            System.out.println("\n["+i+"] " + escuadron.toString()+"\n");
            i++;
        }
    }
    
    
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
