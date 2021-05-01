package com.mycompany.alumnos;

public class Estudiante {
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
        parcial_1= 0;
        recu_1 = 0;
        parcial_2 = 0;
        recu_2 = 0;   
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
        this.parcial_1 = nuevanota;       
    }
    
    public void setrecuperatorio1 (int nuevanota)  //Recibe un valor y lo carga en recu 1
    {
        this.recu_1 = nuevanota;        
    }
    
    public void setparcial2 (int nuevanota)  //Recibe un valor y lo carga en parcial 2
    {
        this.parcial_2 = nuevanota;       
    }
    
    public void setrecuperatorio2 (int nuevanota)  //Recibe un valor y lo carga en recu 2
    {
        this.recu_2 = nuevanota;       
    }
    
}
