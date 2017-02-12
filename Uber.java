/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Santiago
 */
public class Uber {
    private ArrayList<Empleado>empleados;
    Empleado emple;
    private int min;
    
    
     Scanner teclado = new Scanner(System.in);
        
    //constructor
    public Uber() {
        this.empleados= new ArrayList<>();
   
    }
    //para validar el dni
    public static boolean isNif(String valor) {
        return validarB("[1-9]{1}[0-9]{6,7}[A-Z]{1}", valor);
    
    }
    //metodo para validarlo
    private static boolean validarB(String expReg, String valor) {
        
        Pattern patron = Pattern.compile(expReg);
        
        Matcher encajador = patron.matcher(valor);
       

        return encajador.matches();
    }
    public boolean agregarEmpleado(String dni){
        //validar
        boolean agregado=false;
        if(isNif(dni)){
            agregado=true;
            System.out.println("¿Minutos que ha conducido?: ");
            min=teclado.nextInt();
          
            emple = new Empleado(dni,min) {
                @Override
                public double getSueldo() {
                    throw new UnsupportedOperationException("Not supported yet."); //To chaed methods, choose Tools | Templates.
                }

                @Override
                public String getDni() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public int getMinConducido() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            } ;
            empleados.add(emple);
        }
        return agregado;
    }
    
    
}
