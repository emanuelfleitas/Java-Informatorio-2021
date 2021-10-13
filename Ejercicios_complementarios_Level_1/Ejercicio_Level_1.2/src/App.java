import java.util.Scanner;

public class App {
    public static void main(String[] args){

/*  2.Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir
    el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números. */

        Scanner rta = new Scanner(System.in);
        int num1,num2;
      

        System.out.println("Ingrese dos valores enteros: ");

        num1 = rta.nextInt();
        num2 = rta.nextInt();

        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
        System.out.println(num1+" % "+num2+" = "+(num1%num2));
        
        rta.close();
    }
}
