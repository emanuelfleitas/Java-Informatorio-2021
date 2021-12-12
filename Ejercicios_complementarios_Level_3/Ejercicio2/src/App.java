import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
    /*  Dada una lista que contiene números enteros,
        se deberá generar otra lista que contendrá el resultado de aplicar la operación de potencia a 2. */
        List<Integer> palabras = List.of(1,2,3,4,5);
        List<Integer> resultado = palabras.stream().map(p->(int) Math.pow(p,2)).collect(Collectors.toList());
        System.out.println(resultado);
    }
}
