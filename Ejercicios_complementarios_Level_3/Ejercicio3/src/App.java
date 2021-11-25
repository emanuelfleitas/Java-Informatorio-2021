import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /* Se dispone de una lista de Strings, de la cual saber 
        la cantidad de valores que comiencen con la letra B 
        (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase). */
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        int cantidad = 0 ;

        for (String palabra : palabras) {
            
            char letra = palabra.charAt(0);
       
            if(letra == 'b' || letra == 'B'){
                cantidad += 1;
            }
        }
        
        System.out.println(cantidad);
    }
}
