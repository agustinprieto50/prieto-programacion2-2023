import Classes.Empleado;


public class Main {
    public static void main(String[] args) {
        String empleadoString1 = "nombre=Pablo, apellido=Marquez, legajo=001, aniosTrabajados=10";
        String empleadoString2 = "nombre=Pablo,apellido=Marquez,legajo=001,aniosTrabajados=10";
        String empleadoString3 = "nombre=Pablo ,apellido=Marquez ,legajo=001, aniosTrabajados=10";
        String empleadoString4 = "Nombre=Pablo,apellidO=Marquez ,LEGAJO=001, ANIOStrabajados=10";
        String empleadoString5 = "nombre=Pablo,legajo=001,aniosTrabajados=10,apellido=Marquez";
        String empleadoString6 = "nombre=Pablo, apellido=, legajo=001, aniosTrabajados=10";
        String empleadoString7 = "nombre=Pablo, apellido=?Marquez, legajo=001, aniosTrabajados=-10";
        String empleadoString8 = "nombre=Pablo, apellido=, legajo=001, aniosTrabajados=1.5";



        System.out.println(Empleado.crearObjetos(empleadoString1));
        System.out.println(Empleado.crearObjetos(empleadoString2));
        System.out.println(Empleado.crearObjetos(empleadoString3));
        System.out.println(Empleado.crearObjetos(empleadoString4));
        System.out.println(Empleado.crearObjetos(empleadoString5));
        System.out.println(Empleado.crearObjetos(empleadoString6));
        System.out.println(Empleado.crearObjetos(empleadoString7));
        System.out.println(Empleado.crearObjetos(empleadoString8));


    }
}