import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner rta = new Scanner(System.in);

        String nombre ;
       /*  1.Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”  */     

        System.out.println("¿Como es tu nombre?");

        nombre = rta.nextLine();

        System.out.println("HOLA "+nombre+"!");

        rta.close();
      
    }
}
