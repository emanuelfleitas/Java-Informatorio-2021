import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
    /*  Se dispone de una lista de Integer, de la 
        cual queremos obtener otra lista aplicando la 
        operación de factorial pero no se desean valores repetidos. */
        
        List<Integer> palabras = List.of(1,2,4,4,4);
        List<Integer> palabrasNoRepetidas = new ArrayList<Integer>();
        palabrasNoRepetidas = palabras.stream().distinct().collect(Collectors.toList());
        System.out.println("Valores no repetidos "+palabrasNoRepetidas );

        List<Integer> factoriales = palabrasNoRepetidas.stream().map(p ->(int)factorial(p)).collect(Collectors.toList());

        System.out.println("Factoriales: "+factoriales);
      /*   List<Integer> factoriales = new ArrayList<Integer>();
        for (Integer palabra : palabrasNoRepetidas) {
            factoriales.add(factorial((int)palabra));
        }
        System.out.println(factoriales); */
    }
    public static int factorial(int num){
        int resultado = 1;
        if(num==0){
            return resultado;
        }
        for (int i = 1; i <= num;i++){
            resultado *= i;
        }
        return resultado;
    }
}


