/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Santiago
 */
public class Choffer extends Conductor {

    protected static double extraPersona;
    private static final double EXTRAPERSONA = 0.01;

    static {
        extraPersona = EXTRAPERSONA;
    }

    public Choffer(String dni, int minutoCond, int personas) {
        super(dni, minutoCond, personas);
    }

    public static double getExtraPersona() {
        return extraPersona;
    }
    
    public static double getEXTRAPERSONA() {
        return EXTRAPERSONA;
    }
    //metodo que nos devuelve el sueldo
    @Override
    public double getSueldo() {
        double sueldoTotal = 0;
        if (getPersonas() == 1) {
            sueldoTotal = getMinConducido() + SUELDO;
        } else if (getPersonas() > 1 && getPersonas() <= 3) {
            sueldoTotal = (getMinConducido() * 2) + SUELDO;
        }else if(getPersonas()>4){
            sueldoTotal=(getMinConducido()*4)+SUELDO;
        }
        return sueldoTotal;
    }
    //metodo que nos devuelve las personas
    @Override
    public int getPersonas() {
        return personas;
    }
    //metodo que nos devuelve los minutos conducidos
    @Override
    public int getMinConducido() {
        return minutoCond;
    }
    //metodo que nos devuelve el dni
    @Override
    public String getDni() {
      return dni;
    }
}
