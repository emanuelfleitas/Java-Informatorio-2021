import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args)  {
       

      /*   6.Se dispone de una lista de Empleados, de cada empleado se conoce:
        Nombre y Apellido
        DNI
        horasTrabajadas
        valorPorHora
        Todos los empleados están cargados en un Set 
        (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) 
        de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave 
        (key) es el dni y el valor (value) es el sueldo calculado.  */
        
        
        Set<Empleado> empleados = new HashSet<>();

        Map<String,Integer> dniYvalor = new HashMap<>();

        Empleado emp1 = new Empleado("luciano","42789622",100,50);
        Empleado emp2 = new Empleado("lucas","41253463",150,70);
        Empleado emp3 = new Empleado("ema","42789622",200,30);
        Empleado emp4 = new Empleado("kun","213123123",300,60);

        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);

        dniYvalor.put("42789611",(emp1.horas * emp1.valor));
        dniYvalor.put("40569612",(emp2.horas * emp2.valor));
        dniYvalor.put("36459667",(emp3.horas * emp3.valor));
        dniYvalor.put("213123123",(emp4.horas * emp4.valor));

        for(Map.Entry<String,Integer> dni: dniYvalor.entrySet()) {
            System.out.println("DNI: " + dni.getKey() + " Total: " + dni.getValue());
        }

    }

    public static class Empleado{
       private String nombre;
       private String dni;
       private int horas;
       private int valor;
      

        public Empleado(String n,String d, int h, int v) {
            this.setNombre(n);
            this.setDni(d);
            this.horas = h;
            this.valor = v;
        }


        public String getDni() {
          return dni;
        }


        public void setDni(String dni) {
          this.dni = dni;
        }


        public String getNombre() {
          return nombre;
        }


        public void setNombre(String nombre) {
          this.nombre = nombre;
        }

    }

}
    

