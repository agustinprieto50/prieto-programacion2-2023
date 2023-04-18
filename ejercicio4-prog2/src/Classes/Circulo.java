package Classes;
import Interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica{
    private double radio;

    public Circulo(Integer radio) {
        this.radio = radio;
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
        this.radio = radio;
    }
    @Override
    public String toString() {
        return "Perimetro Circulo: " + calcularPerimetro() + ". Superficie Circulo: " + calcularSuperficie();
    }
}
