import java.util.Scanner;



public class App {
    public static void main(String[] args)  {
/*         8.Crear una aplicación que solicite de entrada los 
        datos de una persona en este orden:
        Nombre y Apellido
        Edad
        Dirección
        Ciudad
        Luego imprimirá el siguiente mensaje:
        {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido} */

        Scanner ent = new Scanner(System.in);
        String nom_apell ,ciudad,direccion;int edad;


        System.out.print("Nombre y Apellido: ");
        nom_apell = ent.nextLine();
        
        System.out.print("Edad: ");
        edad = ent.nextInt();
        
    
        System.out.print("Direccion: ");
        direccion = ent.next();
       

        System.out.print("Ciudad: ");
        ciudad = ent.next(); 

        System.out.println(nom_apell+" - "+edad+" - "+direccion+" - "+ciudad);

        ent.close();
    }
}
