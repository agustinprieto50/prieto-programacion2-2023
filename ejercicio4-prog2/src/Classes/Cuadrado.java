package Classes;
import Interfaces.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica{
    private Integer largoLado;
    public Integer getLargoLado() {
        return largoLado;
    }

    public void setLargoLado(Integer largoLado) {
        this.largoLado = largoLado;
    }

    public Cuadrado(Integer largoLado) {
        this.largoLado = largoLado;
    }

    @Override
    public Integer calcularPerimetro() {
        return this.largoLado * 4;
    }

    @Override
    public Integer calcularSuperficie() {
        return this.largoLado * this.largoLado;
    }

    @Override
    public String toString() {
        return "Perimetro Cuadrado: " + calcularPerimetro() + ". Superficie Cuadrado: " + calcularSuperficie();
    }
}
