import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        

       /*  4.Realizar un programa que calcule el factorial de un número:
        n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
        Sin hacer uso de librerías. */
        Scanner entrada = new Scanner(System.in);
        int fact, resu = 1;

        System.out.print("Ingrese el numero que desee saber el factorial: ");
        fact = entrada.nextInt();
       
        for (int i = fact; i > 0 ; i--) {
            resu *= i;
        }

        System.out.println("El factorial de "+fact+" es "+resu);
        entrada.close();    

    }
}
