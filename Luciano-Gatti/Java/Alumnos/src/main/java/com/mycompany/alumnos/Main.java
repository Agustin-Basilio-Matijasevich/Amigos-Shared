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
                case 1:/*Cargar datos de estudiantes*/
                {
                    cargar_estudiante(estudiantes);
                    break;
                    
                }
                case 2:/*Cargar notas*/
                {
                    asignar_notas (estudiantes);
                    break;
                    
                }
                case 3:/*Mostrar lista de estudiantes, con notas y estado de la materia*/
                {
                    mostrar_estudiantes(estudiantes);
                    break;
                    
                }
                case 4:/*Salir*/
                {
                    break;
                    
                }
                default:/*Datos invalidos*/
                {
                    System.out.println("Opcion invalida, por favor reintente.");
                    break;
                    
                }
                
            }
            
        } while (opcionMP != 4);
        
    }
    
    private static void cargar_estudiante (ArrayList <Estudiante> estudiantes)
    {
        Scanner entrada = new Scanner (System.in);
        /*Variables locales*/
        String nombre, apellido;
        int DNI;
        
       
        /*Ingreso de variables*/
        System.out.println("Ingrese el Nombre del alumno: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el Apellido del alumno: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese el DNI del alumno: ");
        DNI = entrada.nextInt();
        
       
        /*Cargar datos en la lista*/
        estudiantes.add(new Estudiante(DNI, nombre, apellido));
    }
    
    private static int buscar_persona (ArrayList <Estudiante> estudiantes, int DNI)  //Recibe la lista de estudiantes y un dni para buscar, devuelve el ID de lista del estudiante
    {
        int ID=0;
        int comparar;
    
        for (int i = 0; i < estudiantes.size(); i++) {
            comparar = estudiantes.get(i).getdni();
         
            if (comparar == DNI)         
            {           
                break;         
            }
            else          
            {         
                ID++;       
            }
        } 
       
        return ID;
    }
    
    private static void asignar_notas (ArrayList <Estudiante> estudiantes)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);  
        int DNI, parcial_1, parcial_2, recu_1, recu_2, ID;
      
        
        System.out.println("Ingrese el DNI del alumno: ");
        DNI = entrada.nextInt();
        ID = buscar_persona(estudiantes,DNI);
        
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
        }
        if (parcial_2 < 6)
        {
            System.out.println("Ingrese la nota del recuperatorio del seguno parcial: ");
            recu_2 = entrada.nextInt();
            estudiantes.get(ID).setrecuperatorio2(recu_2);
        }
    }
    
    private static void estado ()
    {
        
    }
    
    private static void mostrar_estudiantes (ArrayList <Estudiante> estudiantes)
    {
        // Metodo de entrada
        Scanner entrada = new Scanner (System.in);
        int DNI, ID, recu_1, recu_2;
        
        System.out.println("Ingrese el DNI del alumno: ");
        DNI = entrada.nextInt();
        ID = buscar_persona(estudiantes,DNI);
        
        /*Se imprimen datos y notas del estudiante*/
        System.out.println("DNI: " + estudiantes.get(ID).getdni());
        System.out.println("Nombre: " + estudiantes.get(ID).getnombre());
        System.out.println("Apellido: " + estudiantes.get(ID).getapellido());
        System.out.println("Nota 1er Parcial : " + estudiantes.get(ID).getparcial1());
        System.out.println("Nota 2do Parcial : " + estudiantes.get(ID).getparcial2());
       
        /*Se imprimen las notas de los recuperatorios solo si el estudiante los realizo*/
        recu_1 = estudiantes.get(ID).getparcial1();
        if (recu_1 < 6)
        { 
        System.out.println("Nota Recuperatorio 1er Parcial: " + estudiantes.get(ID).getrecuperatorio1());
        }
        recu_2 = estudiantes.get(ID).getparcial2();
        if (recu_2 < 6)
        {
        System.out.println("Nota Recuperatorio 2do Parcial: " + estudiantes.get(ID).getrecuperatorio2());
        }
    }   
}
