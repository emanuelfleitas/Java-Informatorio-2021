import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
       

     /*    4.Cargar un arrayList con 12 nombres de estudiantes (String), 
        luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos. */


       
        List<String> alumnos = new ArrayList<String>();
        
        alumnos.add("Pepe");
        alumnos.add("Luis");
        alumnos.add("Lucas");
        alumnos.add("Sebastian");
        alumnos.add("Leandro");
        alumnos.add("Luciano");
        alumnos.add("Emanuel");
        alumnos.add("Fabri");
        alumnos.add("santiago");
        alumnos.add("Alberto");
        alumnos.add("Facundo");
        alumnos.add("Lula");


        List<String> curso1 = alumnos.subList(0,4);
        List<String> curso2 = alumnos.subList(4,8);
        List<String> curso3 = alumnos.subList(8,12);

        System.out.println("Alumnos en el curso 1: ");
        System.out.println(curso1);
        System.out.println("Alumnos en el curso 2: ");
        System.out.println(curso2);
        System.out.println("Alumnos en el curso 3: ");
        System.out.println(curso3);
        System.out.println(alumnos.size());
    }
}
