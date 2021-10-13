import java.util.Scanner;

public class App {
    public static void main(String[] args) {

     /*  9.Dado un String de en
        (frase, texto, etc) calcular la cantidad de veces 
        que aparece una letra dada. */

        Scanner ent = new Scanner(System.in);

        String frase,letra;int cont= 0;
       

        System.out.print("Ingrese una (frase,texto,etc): ");
        frase = ent.nextLine();
        System.out.print("Ingrese la letra que desea saber cuantes veces se repite: ");
        letra = ent.next();

        char let = letra.charAt(0);

        char let_frase[] = frase.toCharArray();

        for (int i = 0; i < let_frase.length; i++) {
            if(let == let_frase[i]){
                cont +=1;
            }
        }

        System.out.println("La letra "+letra+" se repite "+cont+" veces en la frase");
        ent.close();
    }
}
