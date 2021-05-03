package com.mycompany.alumnos;


public class Estudiante {
    //Si o si el objeto tiene dni nombre y apellido y no se puede cambiar
    private final int DNI;
    private int parcial_1;
    private int recu_1;
    private int parcial_2;
    private int recu_2;
    private final String nombre;
    private final String apellido;
    private String estado;
    private int ordenar;
    
    public Estudiante(int nuevodni, String nuevonombre, String nuevoapellido, int novoparcial1, int novoparcial2, int novorecu1, int novorecu2, String nuevoestado, int novordenar)  //Constructor
    {
        DNI = nuevodni;
        nombre = nuevonombre;
        apellido = nuevoapellido;
        parcial_1= novoparcial1;
        recu_1 = novorecu1;
        parcial_2 = novoparcial2;
        recu_2 = novorecu2;   
        estado = nuevoestado;
        ordenar = novordenar;
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
    
    public String getestado ()
    {
        return estado;
    }
    
    public void setestado (String nuevoestado)
    { 
        estado = nuevoestado;
    }
    
    public int getordenar ()
    {
        return ordenar;
    }
    
    public void setordenar (int novordenar)
    {
        ordenar = novordenar;
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
