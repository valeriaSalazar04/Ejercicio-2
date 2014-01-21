/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ValeriaG
 */
public class testVector {
     public static void main(String nada[]){
    
         Vector discretas = new Vector (3);
          Vector fisica = new Vector (4);
           Vector programacion = new Vector (3);
     
    llenarVector(discretas);
    llenarVector(fisica);
    llenarVector(programacion);
    imprimir(discretas);
    imprimir(fisica);
    imprimir(programacion);
    Vector n = unirVector(discretas, fisica);
    imprimir(n);
    
}
      
    
    public static void llenarVector (Vector v){
        
         for(int i=0;i<v.cardinalidad();i++)
        {
            int dato=(int)(Math.random()*10);
            v.set(i, dato);
                    
            
    }
    }
   public static void imprimir (Vector v){
             System.out.println(v.toString());
             
         }
     public static Vector unirVector (Vector v, Vector v2){
        
         int tamaño = v.cardinalidad()+v2.cardinalidad();
         Vector nuevo=new Vector (tamaño);
         
        int d=tamaño-v2.cardinalidad();
         for (int i=0;i<v.cardinalidad();i++){
                int dato= v.get(i);
                nuevo.set(++d,dato);
              for (int j=0;j<v2.cardinalidad();j++){
                   int dato2= v2.get(j);
                 nuevo.set(j,dato2);
             
//             
             
              }       
         }
         
          return nuevo;


     }
}