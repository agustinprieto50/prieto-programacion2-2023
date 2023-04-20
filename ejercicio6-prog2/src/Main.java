import Classes.Empleado;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", "Pérez", 1234, 5));
        empleados.add(new Empleado("María", "García", 5678, 10));
        empleados.add(new Empleado("Pedro", "Rodríguez", 9012, 3));
        empleados.add(new Empleado("Lucía", "González", 3456, 7));
        empleados.add(new Empleado("Luis", "Martínez", 7890, 2));

        Map<String, Empleado> mapaEmpleados = new HashMap<>();
        for (Empleado empleado : empleados) {
            String clave = empleado.getApellido() + ", " + empleado.getNombre();
            mapaEmpleados.put(clave, empleado);
        }

        for (String clave : mapaEmpleados.keySet()) {
            Empleado empleado = mapaEmpleados.get(clave);
            System.out.println(clave + ": (Objeto) " + empleado);
        }
    }
}