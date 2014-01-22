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
        int i;

        for (i = 0; i < v.cardinalidad(); i++) {

            int da = v.get(i);
            nuevo.set(i, v.get(i));
        }

        for (i = 0; i < v2.cardinalidad(); i++) {

            int da2 = v2.get(i);
            nuevo.set(v.cardinalidad() + i, da2);


        }
        Vector c= eliminarRepetidos(nuevo);
        
        return c;
    }


    
    public static Vector eliminarRepetidos (Vector v){
        int j;
        int cont=0;
        Vector nuevo = new Vector(v.cardinalidad());
       
       for (int i =0;i<v.cardinalidad();i++){
           int elemento =v.get(i);
           boolean elementoRepetido=false;
           
           for ( j=0;j<nuevo.cardinalidad();j++){
               if (nuevo.get(j)==elemento){
                   elementoRepetido=true;
                   cont ++;
                   break;
               }
           }
               if (elementoRepetido==false){
                   int tam= nuevo.cardinalidad()-cont;
                   Vector temporal =new Vector (nuevo.cardinalidad()+1);
                   for( j = 0; j<nuevo.cardinalidad(); j++){ 
                      temporal.set(j, nuevo.get(j));
               }
                   temporal.set(j, elemento);
                   nuevo = temporal;
           }
       }
      
    
       return nuevo;
}
    
}