package Classes;
import Interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica{
    private double radio;
    private Integer x;
    private  Integer y;

    public Circulo(Integer radio, Integer x, Integer y) {
        try {
            if (radio < 0) {
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            if (x < 0) {
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            if (y < 0) {
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            this.radio = radio;
            this.x = x;
            this.y = y;
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Integer calcularPerimetro() {
        return (int) (2 * Math.PI* this.radio);
    }

    @Override
    public Integer calcularSuperficie() {
        return (int) (Math.PI * Math.pow(this.radio, 2));
    }

    public Integer getRadio() {
        return (int) radio;
    }

    public void setRadio(Integer radio) {

        try{
            if (radio < 0){
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            this.radio = radio;
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public String toString() {
        return "Perimetro Circulo: " + calcularPerimetro() + ". Superficie Circulo: " + calcularSuperficie();
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        try{
            if (x < 0){
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            this.x = x;
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        try{
            if (y < 0){
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            this.y = y;
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
