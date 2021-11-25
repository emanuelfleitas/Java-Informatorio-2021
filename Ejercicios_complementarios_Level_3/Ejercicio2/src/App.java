import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    /*  Dada una lista que contiene números enteros,
        se deberá generar otra lista que contendrá el resultado de aplicar la operación de potencia a 2. */
        List<Integer> palabras = List.of(1,2,3,4,5);
        List<Integer> resultado = new ArrayList<Integer>();
        for (Integer palabra : palabras) {
            resultado.add((int) Math.pow(palabra,2));
        }
        System.out.println(resultado);
    }
}
