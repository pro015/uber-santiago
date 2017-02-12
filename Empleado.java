/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Santiago
 */
public  abstract class Empleado {
    String dni;
    protected static double sueldo;
    static final double SUELDO = 500;

    static {
        sueldo =SUELDO;
    }
     protected static double precio;
    static final double PRECIO = 0.02;

    static {
        precio =PRECIO;
    }
   int minutoCond;
   
   //constructor
    public Empleado(String dni, int minutoCond) {
        this.dni = dni;
        this.minutoCond = minutoCond;
    }

    public abstract double getSueldo();
    public abstract String getDni();
    public abstract int getMinConducido();

    

   
   
}
