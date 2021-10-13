import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
      /*   
        5.Se desea una aplicación que solicite 2 números enteros y 
        realice la operación  de multiplicación por sumas sucesivas 
        (sin uso de librerías). */
        Scanner ent = new Scanner(System.in);
        int num,num2;

        System.out.println("Ingrese los valores que desea multiplicar: ");
        System.out.print("Valor 1: ");
        num = ent.nextInt();
        System.out.print("Valor 2: ");  
        num2 = ent.nextInt();
        System.out.println("El resultado del producto entre "+num+" y "+num2+" es: "+producto(num,num2));

        ent.close();
    }

    public static int producto(int num,int num2){
        int resultado = 0;

        for (int i = 0; i < num2; i++) {
            resultado +=num;
        }

        return resultado;
        
    }
}
