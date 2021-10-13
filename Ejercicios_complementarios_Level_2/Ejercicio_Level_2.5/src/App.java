import java.util.ArrayList;

public class App {
    public static void main(String[] args)  {
    /*      
        5.Dados 2 ArrayList que contienen horas-trabajadas (array1) y 
        valor-por-hora(array2) del resumen de carga de horas semanal de 
        un empleado. Se debe generar otra lista que contenga los totales
        y luego imprimir el total final a cobrar.
    */
        ArrayList<Integer> hor_trabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valor_hora = new ArrayList<Integer>();
        ArrayList<Integer> total = new ArrayList<Integer>();
        int resu = 0;

        hor_trabajadas.add(6);
        hor_trabajadas.add(7);
        hor_trabajadas.add(8);
        hor_trabajadas.add(4);
        hor_trabajadas.add(5);

        valor_hora.add(350);
        valor_hora.add(345);
        valor_hora.add(550);
        valor_hora.add(600);
        valor_hora.add(320);

        for (int i = 0; i < hor_trabajadas.size(); i++) {

            total.add(hor_trabajadas.get(i)*valor_hora.get(i));
            
        }     

        System.out.println(total);

        for(int i: total){
            resu += i;
        }

        System.out.println("Total final: $"+resu);

    }
}
