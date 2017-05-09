
package taller1.binary.search.java;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller1BinarySearchJava {

    public static void main(String[] args) {
       int Array [] = {1,2,3,4,5,6,7,8,9,10};
        int n = 2;
        int posicionInicial = 0;
        int posicionFinal = Array.length-1;
        int posicionCentral;
        
        while(posicionInicial <= posicionFinal){
            posicionCentral = (posicionFinal + posicionInicial)/2;
            if(Array[posicionCentral] == n){
                System.out.println("Tu dato ha sido encontrado entre las pociciones " +posicionInicial+ " y "+ posicionFinal);
                break;
            }else if (n < Array[posicionCentral]){
                posicionFinal = posicionCentral-1;
            }else {
                posicionInicial = posicionCentral+1;
            }
        }
    }
    
}
