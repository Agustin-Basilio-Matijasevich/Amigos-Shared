package com.mycompany.ejercitacion_prog_1_puntos_41_al_50_epc;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Estudiante  //Bajo objetos basados en esta clase vamos a almacenar a los estudiantes
{
    //Si o si el objeto tiene dni nombre y apellido y no se puede cambiar
    static private int DNI;
    private int parcial_1;
    private int recu_1;
    private int parcial_2;
    private int recu_2;
    static private String nombre;
    static private String apellido;
    
    public Estudiante(int nuevodni, String nuevonombre, String nuevoapellido)  //Constructor
    {
        DNI = nuevodni;
        nombre = nuevonombre;
        apellido = nuevoapellido;
        parcial_1 = -1;
        recu_1 = -1;
        parcial_2 = -1;
        recu_2 = -1;   
    }
    
    public int getdni()  //Devuelve el dni
    {
        return DNI;
    }
    
    public String getnombre ()  //Devuelve el nombre
    {
        return nombre;        
    }
    
    public String getapellido ()  //Devuelve el apellido
    {
        return apellido;       
    }
    
    public int getparcial1 ()  //Devuelve parcial 1
    {
        return parcial_1;      
    }
    
    public int getrecuperatorio1 ()  //Devuelve recu 1
    {
        return recu_1;       
    }
    
    public int getparcial2 ()  //Devuelve parcial 2
    {
        return parcial_2;        
    }
    
    public int getrecuperatorio2 ()  //Devuelve recu 2
    {
        return recu_2;       
    }
    
    public void setparcial1 (int nuevanota)  //Recibe un valor y lo carga en parcial 1
    {
        parcial_1 = nuevanota;       
    }
    
    public void setrecuperatorio1 (int nuevanota)  //Recibe un valor y lo carga en recu 1
    {
        recu_1 = nuevanota;        
    }
    
    public void setparcial2 (int nuevanota)  //Recibe un valor y lo carga en parcial 2
    {
        parcial_2 = nuevanota;       
    }
    
    public void setrecuperatorio2 (int nuevanota)  //Recibe un valor y lo carga en recu 2
    {
        recu_2 = nuevanota;       
    }
    
}

public class Punto_49
{
    private static int buscar_persona (ArrayList <Estudiante> estudiantes, int DNI)  //Recibe la lista de estudiantes y un dni para buscar, devuelve el ID de lista del estudiante
    {
        int ID = 1;
        
        
        
        return ID;
        
    }
    
    private static void mostrar_estudiantes (ArrayList <Estudiante> estudiantes)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        
        int DNI;
        int ID;
        
        System.out.println("De que estudiante quiere ver la informacion (DNI)");
        DNI = entrada.nextInt();
        
        ID = buscar_persona (estudiantes, DNI);
        
        System.out.println("DNI: " + estudiantes.get(ID).getdni());
        System.out.println("Nombre: " + estudiantes.get(ID).getnombre());
        System.out.println("Apellido: " + estudiantes.get(ID).getapellido());
        System.out.println("Parcial 1: " + estudiantes.get(ID).getparcial1());
        System.out.println("Parcial 2: " + estudiantes.get(ID).getparcial2());
        System.out.println("Recuperatorio 1: " + estudiantes.get(ID).getrecuperatorio1());
        System.out.println("Recuperatorio 2: " + estudiantes.get(ID).getrecuperatorio2());
        
    }
    
    private static void asignar_notas ()
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        
        
    }
    
    private static void cargar_estudiante (ArrayList <Estudiante> estudiantes)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        
        String nombre, apellido;
        int DNI;
       
        System.out.println("Ingrese el Nombre del alumno: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el Apellido del alumno: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese el Apellido del alumno: ");
        DNI = entrada.nextInt();
        
        estudiantes.add(new Estudiante(DNI, nombre, apellido));
    }
    
    public static void main(String[] args)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        // Lista de estudiantes
        ArrayList <Estudiante> estudiantes = new ArrayList ();
        // Variables
        int opcionMP; //  Contiene la opcion seleccionada en el menu principal
        
        do
        {
            System.out.println("\n\n");
            System.out.println("Seleccione que desea hacer ingresando el numero de la opcion");
            System.out.println("Opcion 1: Cargar Estudiante");
            System.out.println("Opcion 2: Asignar notas");
            System.out.println("Opcion 3: Mostrar todos los estudiantes");
            System.out.println("Opcion 4: Salir");
            
            try
            {
                opcionMP = entrada.nextInt();
                
            }
            catch (InputMismatchException ime)
            {
                opcionMP = 0;
                entrada.next();
                
            }
            
            switch (opcionMP)
            {
                case 1:
                {
                    cargar_estudiante(estudiantes);
                    break;
                    
                }
                case 2:
                {
                    asignar_notas ();
                    break;
                    
                }
                case 3:
                {
                    mostrar_estudiantes (estudiantes);
                    break;
                    
                }
                case 4:
                {
                    break;
                    
                }
                default:
                {
                    System.out.println("Opcion invalida, por favor reintente.");
                    break;
                    
                }
                
            }
            
        } while (opcionMP != 4);
        
    }
    
}
