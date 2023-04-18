package Classes;
import Interfaces.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica{
    private double l;

    public Triangulo(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
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
}
