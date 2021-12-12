import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) throws Exception {
        
/*  Dada una lista que contiene
    valores de tipo String, se deberá filtrar todos los valores que NO sean null o vacío (""). */

    List <String> palabras = new ArrayList<String>();
    palabras.add("Hola");
    palabras.add(null);
    palabras.add("informatorio");
    palabras.add("");
    List <String> palabrasF = palabras.stream().filter(p ->(p!="" && p!=null)).collect(Collectors.toList());
    System.out.println(palabrasF);

    }
}
