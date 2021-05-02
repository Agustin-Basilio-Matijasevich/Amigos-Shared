package com.mycompany.alumnos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
                case 1 -> /*Cargar datos de estudiantes*/
                {
                    cargar_estudiante(estudiantes);         
                }
                
                case 2 -> /*Cargar notas y asignar estado de la materia*/
                {
                    asignar_notas (estudiantes);  
                    estado (estudiantes);
                }

                
                case 3 -> /*Mostrar lista de estudiantes, con notas y estado de la materia*/
                {
                    mostrar_estudiantes(estudiantes);      
                }
                
                case 4 -> /*Salir*/
                {
                }
                
                default -> /*Datos invalidos*/
                {
                    System.out.println("Opcion invalida, por favor reintente.");
                    
                }
                
            }
            
        } while (opcionMP != 4);
        
    }
    
    private static void cargar_estudiante (ArrayList <Estudiante> estudiantes)
    {
        Scanner entrada = new Scanner (System.in);
        /*Variables locales*/
        String nombre, apellido, estado="null";
        int DNI, parcial_1=0, parcial_2=0, recu_1=0, recu_2=0;
        
       
        /*Ingreso de variables*/
        System.out.println("Ingrese el Nombre del alumno: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el Apellido del alumno: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese el DNI del alumno: ");
        DNI = entrada.nextInt();
        
        /*Cargar datos en la lista*/
        estudiantes.add(new Estudiante(DNI, nombre, apellido, parcial_1, parcial_2, recu_1, recu_2, estado));
    }
    
    private static int buscar_persona (ArrayList <Estudiante> estudiantes, int DNI)  //Recibe la lista de estudiantes y un dni para buscar, devuelve el ID de lista del estudiante
    {
        int ID = -1;
        
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante p = estudiantes.get(i);
            if (p.getdni()== DNI) 
            {
                ID = i;
                break; 	
            }	
        }	
        
        return ID; 
    }
    
    private static void asignar_notas (ArrayList <Estudiante> estudiantes)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);  
        int DNI, parcial_1, parcial_2, recu_1, recu_2, ID;
      
        do
        {
        System.out.println("Ingrese el DNI del alumno: ");
        DNI = entrada.nextInt();
        ID = buscar_persona(estudiantes,DNI);
        if (ID == -1)
        {
            System.out.println("El DNI ingresado es incorrecto, intentelo nuevamente.");
        }
        }
        while (ID == -1);
        
        System.out.println("Ingrese la nota del primer parcial: ");
        parcial_1 = entrada.nextInt();
        estudiantes.get(ID).setparcial1(parcial_1);
        
        System.out.println("Ingrese la nota del segundo parcial: ");
        parcial_2 = entrada.nextInt();
        estudiantes.get(ID).setparcial2(parcial_2);
        
        if (parcial_1 < 6)
        {
            System.out.println("Ingrese la nota del recuperatorio del primer parcial: ");
            recu_1 = entrada.nextInt();
            estudiantes.get(ID).setrecuperatorio1(recu_1);
        }else
        {
            estudiantes.get(ID).setrecuperatorio1(0);
        }
        if (parcial_2 < 6)
        {
            System.out.println("Ingrese la nota del recuperatorio del seguno parcial: ");
            recu_2 = entrada.nextInt();
            estudiantes.get(ID).setrecuperatorio2(recu_2);
        }else
        {
            estudiantes.get(ID).setrecuperatorio2(0);
        }
    }
    
    private static void estado (ArrayList <Estudiante> estudiantes)
    {
        int parcial_1, parcial_2;
         
        for (int i = 0; i < estudiantes.size(); i++) {
          parcial_1 = estudiantes.get(i).getparcial1(); 
          parcial_2 = estudiantes.get(i).getparcial2();
          if (parcial_1 >= 8 && parcial_2 >= 8)
          {
            estudiantes.get(i).setestado("promocional");
          }else if (parcial_1 >= 6 && parcial_2 >= 6)
          {
            estudiantes.get(i).setestado("regular");
          }else 
          {
            estudiantes.get(i).setestado("reprobado");
          }
        }
        
    }
    
    private static void mostrar_estudiantes (ArrayList <Estudiante> estudiantes)
    {
        int recu_1, recu_2;
       
        for (int i = 0; i < estudiantes.size(); i++) {
           /*Se imprimen datos y notas del estudiante*/
        System.out.println("\n\n**ALUMNO**");
        System.out.println("DNI: " + estudiantes.get(i).getdni());
        System.out.println("Nombre: " + estudiantes.get(i).getnombre());
        System.out.println("Apellido: " + estudiantes.get(i).getapellido());
        System.out.println("DNI: " + estudiantes.get(i).getestado());
        System.out.println("Nota 1er Parcial : " + estudiantes.get(i).getparcial1());
        System.out.println("Nota 2do Parcial : " + estudiantes.get(i).getparcial2());
       
        /*Se imprimen las notas de los recuperatorios solo si el estudiante los realizo*/
        recu_1 = estudiantes.get(i).getparcial1();
        if (recu_1 < 6)
        { 
        System.out.println("Nota Recuperatorio 1er Parcial: " + estudiantes.get(i).getrecuperatorio1());
        }
        recu_2 = estudiantes.get(i).getparcial2();
        if (recu_2 < 6)
        {
        System.out.println("Nota Recuperatorio 2do Parcial: " + estudiantes.get(i).getrecuperatorio2());
        } 
        }
        
        
    }   
}
