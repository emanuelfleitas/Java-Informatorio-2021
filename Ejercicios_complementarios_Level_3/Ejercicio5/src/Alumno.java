import java.util.Date;

public class Alumno {
    private String nombre;
    private String apellido;
    private Date nacimiento;
   
    public Alumno(String nombre, String apellido, Date nacimiento) {

            this.nombre = nombre; 
            this.apellido = apellido;
            this.nacimiento = nacimiento;

    }
    public String getApellido() {
        return apellido;
    }
    public Date getNacimiento() {
        return nacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    @Override
    public String toString() {
        return this.nombre +" "+this.apellido;
    }

}


