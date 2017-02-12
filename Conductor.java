/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Santiago
 */
public abstract class Conductor extends Empleado{
    
    
  int personas;
  
    //constructor
    public Conductor(String dni, int minutoCond,int personas) {
        super(dni, minutoCond);
        this.personas=personas;
    }

    public  abstract int getPersonas();
    
    

    
   
    
}
