/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Santiago
 */
public class Taxi extends Conductor{

  
    private int equipaje;
    private static final double EXTRAMALETA = 0.02;
    protected static double extra;

    static {
        extra =EXTRAMALETA;
    }

    public Taxi(String dni, int minutoCond, int personas,int equipaje) {
        super(dni, minutoCond, personas);
        this.equipaje=equipaje;
    }

    public int getEquipaje() {
        return equipaje;
    }
    //metodo que nos devuelve el sueldo
      @Override
    public double getSueldo() {
      double sueldoTotal = 0;
        if (getPersonas() == 1) {
            sueldoTotal = getMinConducido() + SUELDO+(EXTRAMALETA*getEquipaje());
        } else if (getPersonas() > 1 && getPersonas() <= 3) {
            sueldoTotal = (getMinConducido() * 2) + SUELDO+(EXTRAMALETA*getEquipaje());
        }else if(getPersonas()>4){
            sueldoTotal=(getMinConducido()*4)+SUELDO+(EXTRAMALETA*getEquipaje());
        }
        return sueldoTotal;
    }
    //metodo que nos devuelve el numero de personas
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
