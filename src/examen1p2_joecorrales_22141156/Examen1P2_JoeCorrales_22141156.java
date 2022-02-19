package examen1p2_joecorrales_22141156;

import java.util.ArrayList;
import java.util.Scanner;

/** @author Joe Corrales */
public class Examen1P2_JoeCorrales_22141156 {
    static ArrayList<Persona> heroes = new ArrayList<>();
    static ArrayList<Persona> villanos = new ArrayList<>();
    
    
    static ArrayList<Persona> personajes = new ArrayList<>();
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
                case 3: { opcionesPersonajes(); } break;
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
    
    //verificarUniverso()
    {
//    private static boolean verificarUniverso(String nombre) {
//        for(Universo universo : universos) {
//            if (universo.getNombre().equalsIgnoreCase(nombre)) {
//                System.out.println("Ya existe un universo con ese nombre!");
//                return false;
//            }
//        }
//        return true;
//    }
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
    
    private static void opcionesEscuadron() {
        int opcion = myNextInt("\n[=== Menu Universo ===]"
                + "\nOpciones: "
                + "\n1. Crear Escuadron"
                + "\n2. Modificar Escuadron"
                + "\n3. Eliminar Escuadron"
                + "\n4. Listar Escuadron"
                + "\n5. Simular Batalla"
                + "\n0. Salir"
                + "\nOpcion: ");
        crudEscuadron(opcion);
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
    
    private static void opcionesPersonajes() {
        int opcion = myNextInt("\n[=== Menu Personajes ===]"
                + "\nOpciones: "
                + "\n1. Crear Personaje"
                + "\n2. Modificar Personaje"
                + "\n3. Eliminar Personaje"
                + "\n4. Listar Personaje"
                + "\n0. Salir"
                + "\nOpcion: ");
        crudPersonajes(opcion);
    }
    
    private static void tipo(int opcion) {
        String nombre = myNextString("Nombre: ");
        int tipo = myNextInt("Es 1) heroe o  2) villano?: ");
        String poder = myNextString("Poder: ");
        String debilidad = myNextString("Debilidad: ");
        String tipoPersonaje = "";
        if(tipo == 1) tipoPersonaje = "Heroe";
        else tipoPersonaje = "Villano";
        int fuerza = myNextInt("Puntos de fuerza: ");
        int habilidadmental = myNextInt("Puntos de habilidad mental: ");
        int habilidadFisica = myNextInt("Puntos de habilidad Fisica: ");
        String tiene = myNextString("Tiene escuadron? [true/false]: ");
        Boolean tieneEscuadron = Boolean.parseBoolean(tiene);
        
        switch (opcion) {
            case 1: {
                PersonaNormal p = new PersonaNormal(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica);
                p.setTieneEscuadron(tieneEscuadron);
                p.setTipoPersonaje(tipoPersonaje);
                if(tipo == 1) heroes.add(p);
                else villanos.add(p);
                personajes.add(p);
            }
                break;
                
            case 2: {
                String superPoder = myNextString("Super poder: ");
                SuperHumano sh = new SuperHumano(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica, superPoder);
                sh.setTieneEscuadron(tieneEscuadron);
                sh.setTipoPersonaje(tipoPersonaje);
                if(tipo == 1) heroes.add(p);
                else villanos.add(p);
                personajes.add(sh);
            }
                break;
                
            case 3: {
                int edad = myNextInt("Edad a la que murio: ");
                String tipoA = myNextString("Tipo de accidente: ");
                PorAccidenteRadioactivo ar = new PorAccidenteRadioactivo(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica, edad, tipoA);
                ar.setTieneEscuadron(tieneEscuadron);
                ar.setTipoPersonaje(tipoPersonaje);
                if(tipo == 1) heroes.add(p);
                else villanos.add(p);
                personajes.add(ar);
            }
                break;   
                
            case 4: {
                Mutante m = new Mutante(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica);
                m.setTieneEscuadron(tieneEscuadron);
                m.setTipoPersonaje(tipoPersonaje);
                if(tipo == 1) heroes.add(p);
                else villanos.add(p);
                personajes.add(m);
            }
                break;
                
            case 5: {
                System.out.println("Tiene Creyentes? [true/false]: ");
                boolean tCreyentes = input.nextBoolean();
                String rMitlogica = myNextString("Religion Mitologica: ");
                Deidad d = new Deidad(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica, tCreyentes, rMitlogica);
                d.setTieneEscuadron(tieneEscuadron);
                d.setTipoPersonaje(tipoPersonaje);
                if(tipo == 1) heroes.add(d);
                else villanos.add(d);
                personajes.add(d);
            }
                break;
                
            case 6: {
                String planeta = myNextString("Planeta: ");
                Alien a = new Alien(planeta, nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica);
                a.setTieneEscuadron(tieneEscuadron);
                a.setTipoPersonaje(tipoPersonaje);
                if(tipo == 1) heroes.add(a);
                else villanos.add(a);
                personajes.add(a);
                opcionesPersonajes();
            }
                break;
            default:
                System.out.println("No disponible");
        }
    }
    
    
    private static void crudPersonajes(int opcion) {
        switch(opcion) {
            case 1: { 
                System.out.println("\n[=== Creacion de Personaje ===]");
                int op = myNextInt("[=== Tipo de Personaje ===]"
                        + "\n1) Persona normal"
                        + "\n2) Super Humano"
                        + "\n3) Accidente Radioactivo"
                        + "\n4) Mutante"
                        + "\n5) Deidad"
                        + "\n6) Alien"
                        + "\n0) Salir"
                        + "\nOpcion: ");
                tipo(op);
                opcionesPersonajes();
            } break;
            
            case 2: { 
                System.out.println("\n[=== Modificacion de Personaje ===]");
//                String nombre = myNextString("Nombre del universo a modificar: ");
//                if((buscarUniverso(nombre) != null)) {
//                    String nombre2 = myNextString("Nuevo nombre del universo: ");
//                    buscarUniverso(nombre).setNombre(nombre2);
//                    System.out.println("Universo modificado!");
//                }
                opcionesPersonajes();
            } break;
            
            case 3: { 
                System.out.println("\n[=== Eliminar un Personaje ===]");
//                System.out.println("\nSe imprimiran los universos...");
//                listarUniverso();
//                int i = myNextInt("Ingrese la posicion a borrar: ");
//                universos.remove(i);
                opcionesPersonajes();
            } break;
            
            case 4: { 
                System.out.println("\n[=== Lista de Personajes ===]");
                listarPersonajes();
                opcionesPersonajes();
            } break;
            
            case 0: { main(); } break;
            
            default: System.out.println("Opcion invalida!");
        }
    }
    
    private static void listarPersonajes() {
        int i = 0;
        for (Persona personaje : personajes) {
            System.out.println("\n["+i+"] " + personaje.toString()+"\n");
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
