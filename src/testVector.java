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
    
    
    Vector discretas= new Vector (4);
    Vector programacion = new Vector (3);
    Vector fisica = new Vector (2);
    
    llenarVector(discretas);
    llenarVector(fisica);
    imprimir(discretas);
    imprimir(fisica);
} 
    public static void llenarVector (Vector v[]){
        
         for(int i=0;i<v.length;i++)
        {
            int dato=(int)(Math.random()*100);
            v.set
                    
    }
    }
   public static void imprimir (int v[]){
             System.out.println(v.toString());
             
         }
    
}
