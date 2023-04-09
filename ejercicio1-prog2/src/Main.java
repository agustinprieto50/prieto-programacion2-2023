import Entities.Employee;
import Entities.SetEmployee;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();
        set.add(new Employee("Michael", "Scott", 1, 10));
        set.add(new Employee("Michael", "Scott", 1, 10));
        set.add(new Employee("Jim", "Halpert", 2, 6));
        set.add(new Employee("Pam", "Beesly", 3, 5));
        set.add( new Employee("Dwight", "Schrute", 4, 8));

        System.out.println("\nSet con duplicados: " );
        for (Employee employee: set){
            System.out.println(employee.toString());
        }

        // Crear 5 objetos empleadoSet, donde 2 empleados tienen los mismos valores de atributos, agregarlos al set
        // Iterar sobre el set y mostrar los objetos empleados. Verificar que el duplicado no existe.

        Set<SetEmployee> setEmployee = new HashSet<>();
        SetEmployee e1 = new SetEmployee("Michael", "Scott", 1, 10);
        SetEmployee e2 = new SetEmployee("Michael", "Scott", 1, 10);
        SetEmployee e3 = new SetEmployee("Jim", "Halpert", 2, 6);
        SetEmployee e4 = new SetEmployee("Pam", "Beesly", 3, 5);
        SetEmployee e5 = new SetEmployee("Dwight", "Schrute", 4, 8);
        setEmployee.add(e1);
        setEmployee.add(e2);
        setEmployee.add(e3);
        setEmployee.add(e4);
        setEmployee.add(e5);

        System.out.println("\nEmpleadoSet sin duplicados: " );
        for (SetEmployee setEmployee1: setEmployee){
            System.out.println(setEmployee1.toString());
        }
    }
}