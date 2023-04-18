package Classes;
import Interfaces.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica{
    private double l;
    private Integer x;
    private  Integer y;

    public Triangulo(double l, Integer x, Integer y) {
        if (l < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        if (x < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        if (y < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        this.l = l;
        this.x = x;
        this.y = y;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if (l < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        this.l = l;
    }

    @Override
    public Integer calcularPerimetro() {
        return (int) this.l * 3;
    }

    @Override
    public Integer calcularSuperficie() {
        double a = Math.sqrt((Math.pow(l, 2))-(Math.pow(l/2, 2)));
        return (int) (l*a/2);
    }

    @Override
    public String toString() {
        return "Perimetro Triangulo: " + calcularPerimetro() + ". Superficie Triangulo: " + calcularSuperficie();
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
