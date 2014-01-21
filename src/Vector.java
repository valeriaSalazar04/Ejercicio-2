/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Inicialización de la clase Vector
 */
/**
 *
 * @author ValeriaG
 */
public class Vector {
    
      private int vector[];
    
      /**
       * Constructor vacío de la clase vector
       */
      public Vector (){
  } 
      /**
       * 
       * @param tamaño 
       */
      public Vector (int tamaño){
          
         this.vector= new int [tamaño];
        
      }
     /**
      * 
      * @param i
      * @param dato 
      */
     public void set(int i, int dato){
      
        this.vector[i]=dato;
    }
     /**
      * 
      * @return 
      */
      public int cardinalidad(){
    
        return this.vector.length;
    
    }
       public String toString(){
    
        String msg="";
        for(int dato:this.vector)
            msg+=dato+",";
        return(msg);
    }
       
       public int get(int i){
       
        return this.vector[i];
    }
      
       
         
       
    
}
