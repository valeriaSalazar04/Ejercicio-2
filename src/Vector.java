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
       * Contructor de la clase vector parametrizado
       * @param tamaño: variable que recibe el tamaño del vector para ser creado
       */
      public Vector (int tamaño){
          
         this.vector= new int [tamaño];
        
      }
     /**
      * Método para hacer el cambio en las posiciones del vector
      * @param i: variable que hace referncia al indice del vector
      * @param dato: variable que corresponde al  valor que sera asignado en la posición indicada por el indice
      */
     public void set(int i, int dato){
      
        this.vector[i]=dato;
    }
     /**
      * 
      * @return Método que retorna el tamaño del vector
      */
      public int cardinalidad(){
    
        return this.vector.length;
    
    }
      /**
       * 
       * @return Método que retona la cadena de caracteres del vector
       */
       public String toString(){
    
        String msg="";
        for(int dato:this.vector)
            msg+=dato+",";
        return(msg);
    }
       /**
        * Método que obtiene el dato en la posicion indicada
        * @param i: variable de tipo entero que representa el indice de posición del vector
        * @return: retorna el dato en la posicion indicada del vector
        */
       public int get(int i){
       
        return this.vector[i];
    }
      
       
         
       
    
}
