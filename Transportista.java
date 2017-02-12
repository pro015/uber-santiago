/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Santiago
 */
public class Transportista extends Empleado{
    private int kg;
    
    
    private static final double EXTRAKILO =0.02;
    protected static double extra;

    static {
        extra =EXTRAKILO;
    }
    //constructor
    public Transportista(String dni, int minutoCond,int kg) {
        super(dni, minutoCond);
        this.kg=kg;
    }
    //metodo que devuelve los kg
    public int getkg() {
        return kg;
    }
    //metodo que nos da el sueldo
    @Override
    public double getSueldo() {
       double sueldoTotal=0;
       sueldoTotal=SUELDO+(EXTRAKILO*getkg());
        return sueldoTotal;
    }
    //metodo que nos devuelve el dni
    @Override
    public String getDni() {
       return dni;
    }
    //metodo que nos devuelve los minutos conducidos
    @Override
    public int getMinConducido() {
        return minutoCond;
    }

    
    
   
    
}
