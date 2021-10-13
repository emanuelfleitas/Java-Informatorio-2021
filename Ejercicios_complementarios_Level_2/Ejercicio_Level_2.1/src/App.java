import java.util.ArrayList;

public class App {
    public static void main(String[] args)  {
       
   /* 1.Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking */

        ArrayList <String> ciud_favoritas = new ArrayList<>();

        String ciud1 = "Corrientes",ciud2="Bariloche",ciud3="La plata";

        ciud_favoritas.add(ciud1);
        ciud_favoritas.add(ciud2);
        ciud_favoritas.add(ciud3);

        for (int i = 0; i < ciud_favoritas.size(); i++) {
            System.out.println("#"+(i+1)+" - "+ciud_favoritas.get(i));
        }

    }
}
