import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /* Se dispone de una lista de Strings, de la cual saber 
        la cantidad de valores que comiencen con la letra B 
        (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase). */
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");     
        int cantidad = (int)palabras.stream().filter(p -> p.contains("b")|| p.contains("B") ).count(); 
        System.out.println(cantidad);
    }
}
