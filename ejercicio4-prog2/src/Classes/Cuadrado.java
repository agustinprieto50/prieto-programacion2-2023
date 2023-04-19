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
        try {
            if (largoLado < 0) {
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            this.largoLado = largoLado;
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public Cuadrado(Integer largoLado, Integer x, Integer y) {
        try {
            if (largoLado < 0) {
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            if (x < 0) {
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            if (y < 0) {
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            this.largoLado = largoLado;
            this.x = x;
            this.y = y;
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
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
        try {
            if (x < 0) {
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
        try {
            if (y < 0) {
                throw new IllegalArgumentException("El parametro no puede ser negativo");
            }
            this.y = y;
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
