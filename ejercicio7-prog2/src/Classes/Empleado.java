package Classes;
import java.util.regex.*;

public class Empleado {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private Integer aniosTrabajados;

    public Empleado(String nombre, String apellido, Integer legajo, Integer aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Integer getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(Integer aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }
    public String toString() {
        return "Empleado: " + getNombre() + " " + getApellido() + ", Legajo: " + getLegajo() + ", Años trabajados: " + getAniosTrabajados();
    }

    public static Empleado crearObjetos(String string){
        String regex = "\\b(?i)(nombre|apellido|legajo|aniosTrabajados)\\s*=\\s*([^,]+)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        Integer legajo = null;
        Integer aniosTrabajados = null;
        String nombre = "";
        String apellido = "";
        while (matcher.find()) {

            String atributo = matcher.group(1).toLowerCase();
            String value = matcher.group(2);
            switch (atributo) {
                case "legajo" -> legajo = Integer.parseInt(value);
                case "aniostrabajados" -> aniosTrabajados = Integer.parseInt(value);
                case "nombre" -> nombre = value;
                case "apellido" -> apellido = value;
            }

        }
        return new Empleado(nombre, apellido, legajo, aniosTrabajados);

    }
}


