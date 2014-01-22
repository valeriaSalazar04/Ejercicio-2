/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ValeriaG
 */
public class testVector {

    public static void main(String nada[]) {

        Vector discretas = new Vector(2);
        Vector fisica = new Vector(5);
        Vector programacion = new Vector(3);
        
        

        llenarVector(discretas);
        llenarVector(fisica);
        llenarVector(programacion);
        System.out.print("vector de codigos matriculados en  Matemticas Discretas: ");
        imprimir(discretas);
        System.out.print("vector de codigos matriculados en Fisica: ");
        imprimir(fisica);
        System.out.print("vector de codigos matriculados en Programación:");
        imprimir(programacion);
        Vector n = unirVector(discretas, fisica);
        imprimir(n);
        Vector m = unirVector(fisica, programacion);
       
        imprimir(m);
        
      
    }

    /**
     * Método para llenar vectores con número aleatorios
     *
     * @param v: recibe un vector como parametro para ser llenado
     */
    public static void llenarVector(Vector v) {

        for (int i = 0; i < v.cardinalidad(); i++) {
            int dato = (int) (Math.random() * 10);
            v.set(i, dato);


        }
    }

    /**
     * Método para imprimir el vector
     *
     * @param v: recibe un vector como parámetro
     */
    public static void imprimir(Vector v) {
        System.out.println(v.toString());

    }
    /**
     * Método que une dos vectores en uno solo
     * @param v: vector de tipo Vector 
     * @param v2: vector de tipo Vector 
     * @return retorna el nuevo vector con los datos de los vectores recibidos 
     */
    public static Vector unirVector(Vector v, Vector v2) {

        int tamaño = v.cardinalidad() + v2.cardinalidad();
        Vector nuevo = new Vector(tamaño);
        int i ;
        
       
       
        
        for ( i=0;i<v.cardinalidad();i++){
           
            int da= v.get(i);
            nuevo.set(i,v.get(i));
        }
            
            for (i=0;i<v2.cardinalidad();i++){
               
                int da2=v2.get(i);
                nuevo.set(v.cardinalidad()+i,da2);
            
           
            }
        return nuevo;
    }
}
//        for ( int i=0;i < v.cardinalidad(); i++) {
//            
//            int dato = v.get(i);
//            nuevo.set(j++, dato);
//            for (; j < v2.cardinalidad(); j++) {
//                int dato2 = v2.get(j);
//                nuevo.set(j, dato2);
//               
//            
//
//            }
//        }
//         
////        Vector comparados=comparar(nuevo);
//        return nuevo;
//

    
    
//    public static Vector comparar (Vector v){
//        
//        Vector nuevo = new Vector(v.cardinalidad());
//        int i=0, j=i+1;
//        int dato = v.get(i);
//        int dato2 = nuevo.get(j);
//        boolean repetido;
//        for (i = 0; i < v.cardinalidad(); i++) {
//         if (v.get(i)==v.get(j)){
//             nuevo.set(i, i);
//             
//         }
//        }   
//        
//       return nuevo;
//    }
//
