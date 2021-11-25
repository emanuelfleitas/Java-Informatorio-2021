import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
/*  Dada una lista que contiene
    valores de tipo String, se deberá filtrar todos los valores que NO sean null o vacío (""). */

    List <String> palabras = new ArrayList<>();
    List <String> palabrasFiltradas = new ArrayList<>();

    palabras.add("Hola");
    palabras.add(null);
    palabras.add("Informatorio");
    palabras.add("");
    
        for (String palabra : palabras) {
            if(palabra!=null && palabra != "") {
                palabrasFiltradas.add(palabra);
            }
        }
        System.out.println(palabrasFiltradas);

    }
}
