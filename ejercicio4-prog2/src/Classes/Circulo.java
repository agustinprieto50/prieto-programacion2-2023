package Classes;
import Interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica{
    private double radio;
    private Integer x;
    private  Integer y;

    public Circulo(Integer radio, Integer x, Integer y) {
        if (radio < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        if (x < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        if (y < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        this.radio = radio;
        this.x = x;
        this.y = y;
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
        if (radio < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        this.radio = radio;
    }
    @Override
    public String toString() {
        return "Perimetro Circulo: " + calcularPerimetro() + ". Superficie Circulo: " + calcularSuperficie();
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        if (x < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        if (y < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        this.y = y;
    }
}
