package Classes;
import Interfaces.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica{
    private Integer largoLado;
    private Integer x;
    private Integer y;

    public Integer getLargoLado() {
        return largoLado;
    }

    public void setLargoLado(Integer largoLado) {
        if (largoLado < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        this.largoLado = largoLado;
    }

    public Cuadrado(Integer largoLado, Integer x, Integer y) {
        if (largoLado < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        if (x < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        if (y < 0){
            throw new IllegalArgumentException("El parametro no puede ser negativo");
        }
        this.largoLado = largoLado;
        this.x = x;
        this.y = y;
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
