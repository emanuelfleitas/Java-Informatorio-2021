
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class App {
    public static void main(String[] args) throws Exception {
        /* Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento (con tipos: String, String 
        y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre 
        (con separador de espacio en blanco) y el value la edad del alumno.
        -La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir
        el ejemplo y demostrar su funcionamiento.
        -En ejemplo se muestra solo con 1 Alumno a modo de abreviar 
        -En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar otra tecnica de 
        construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc) */
        
        List<Alumno> alumnos = new ArrayList<Alumno>();  
        alumnos.add(new Alumno("Pepe","Romero",ParseFecha("23/11/1998")));
        alumnos.add(new Alumno("Mauro","Romero",ParseFecha("23/11/1996")));
        alumnos.add(new Alumno("Ema","Romero",ParseFecha("23/11/1994")));
        alumnos.add(new Alumno("Lucia","Romero",ParseFecha("23/11/1990")));
        alumnos.add(new Alumno("Richard","Romero",ParseFecha("23/11/2000"))); 
        Map<String, Integer> mapAlumnos= new HashMap<String, Integer>();


        for (Alumno alumno : alumnos) {
            mapAlumnos.put(alumno.getApellido()+" "+alumno.getNombre(),años(alumno.getNacimiento()));
        }
        System.out.println(mapAlumnos);
    }

    public static  Date ParseFecha(String fecha) throws ParseException{
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(fecha); 
        return date1;
    }

    public static int  años(Date fechaDeNacimiento) throws ParseException {
    
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Date date = fechaDeNacimiento;        
            String dateStart = dateFormat.format(date);
            /* dateStart = dateStart.trim();
            String[] newStr = dateStart.split("\\s+"); */
            String dateStop = "10-11-2021 09:33:43";
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
            Date d1 = null;
            Date d2 = null;
            try {
                d1 = format.parse(dateStart);
                d2 = format.parse(dateStop);
            } catch (ParseException e) {
                e.printStackTrace();
            }    
            // Get msec from each, and subtract.
            long diff = d2.getTime() - d1.getTime();
            long days = TimeUnit.MILLISECONDS.toDays(diff);
            /* String  resultado = "Days: " + days  ; */
            int años = Math.abs((int)days/365);
            return años;
    }
    
}
