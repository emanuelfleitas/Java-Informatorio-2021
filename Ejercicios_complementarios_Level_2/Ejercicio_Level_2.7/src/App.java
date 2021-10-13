import java.util.ArrayList;



public class App {
    public static void main(String[] args) {
       /*  
        7.Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
        nos devuelva un array de Strings. Con la secuencia de números enteros de principio 
        a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo 
        de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. Observacion:
        Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe 
        frenar (no se incluye en el cálculo) Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4  */

        
        System.out.println(fizzBuzzFunc(2,6));
    }
    public static ArrayList<String> fizzBuzzFunc(int val1,int val2){

        ArrayList <String> result = new ArrayList<String>();

        if(val1<val2){
            for (int i = val1; i < val2; i++) {
                if(i % 2 == 0){
                    result.add("Fizz");
                }
                else if(i % 3 == 0){
                    result.add("Buzz");
                }
                else if(i % 2 == 0 && i % 3 == 0){
                    result.add("FizzBuzz");
                }else{
                    String valor = String.valueOf(i);
                    result.add(valor);
                }
            }
            return result;
        }else{
            return result;
        }
    }
}
