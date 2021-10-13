import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args)  {
   /*      2.Crear un ArrayList, agregar 5 números enteros. Luego, agregar 
        un número entero al principio de la lista y otro al final. Por 
        último, iterar e imprimir los elementos de la lista y el tamaño de 
        la misma (antes y después de agregar a en la primera y última posición). */


        Scanner ent = new Scanner(System.in);
        ArrayList <Integer> enteros = new ArrayList<Integer>();
        int val1,val2;
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);


        System.out.println("Impresion de la lista antes de agregar en la primera y ultima posicion: ");

        for (int i : enteros) {
            System.out.println(i);
        }

        System.out.println("Tamaño de la lista andes de modificar: "+enteros.size());

        System.out.println("Ingrese un valor al principio de la lista y al final: ");
        System.out.print("Valor al principio: ");
        val1 = ent.nextInt();
        System.out.print("Valor al final: ");
        val2 = ent.nextInt();
        
        System.out.println("Impresion de la lista despues de agregar en la primera y ultima posicion: ");

        enteros.set(0, val1);
        enteros.add(val2);
        for (int i : enteros) {
            System.out.println(i);
        }

        System.out.println("Tamaño de la lista despues de modificar: "+enteros.size());

        ent.close();
    }
}
