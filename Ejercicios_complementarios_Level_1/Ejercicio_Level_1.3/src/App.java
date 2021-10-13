import java.util.Scanner;

public class App {
    public static void main(String[] args) {

      /*   3.Confeccionar un programa que dado un número entero como
        dato de entrada imprima la secuencia de números 
        (incrementos de 1) de la siguiente forma: */
        
    /*  
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
    */

        Scanner rta = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int limite = rta.nextInt();

        for (int i = 1; i <= limite; i++) {
            
            System.out.println(i);
            if(i==limite){
                break;
            }
            for (int j = 1; j < (i+1); j++){
                System.out.print(j+" ");
            }
        }
        rta.close();
    }
}
