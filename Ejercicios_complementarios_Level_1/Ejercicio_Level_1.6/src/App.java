import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
/*      6.Se desea una aplicación que solicite 2 
        números enteros y realice la operación de potencia (sin uso de librerías). */
        Scanner ent = new Scanner(System.in);
        int num , num2;
        System.out.println("Ingrese 2 numeros enteros para realizar la operacion de potencia: ");
        System.out.print("Numero: ");
        num = ent.nextInt();
        System.out.print("Potencia: ");
        num2 = ent.nextInt();
        System.out.print("La potencia de "+num+" elevado a "+num2 +" es igual a: "+potencia(num,num2));

        ent.close();
    }
    public static int potencia(int num,int num2){
        int resultado = 1;

        for (int i = 0; i < num2; i++) {
            resultado *=num;
        }

        return resultado;
    }
}
