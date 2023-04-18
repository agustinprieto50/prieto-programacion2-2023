import Classes.*;
import Interfaces.FiguraGeometrica;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <FiguraGeometrica> listaDeFiguras = new ArrayList<>();
        Circulo circulo1 = new Circulo(2, 4, 6);
        Circulo circulo2 = new Circulo(6, 2, -3);
        Triangulo triangulo1 = new Triangulo(-12, 1, 1);
        Triangulo triangulo2 = new Triangulo(3.5, 5, 2);
        Cuadrado cuadrado = new Cuadrado(4, 2, 5);

        listaDeFiguras.add(circulo1);
        listaDeFiguras.add(circulo2);
        listaDeFiguras.add(triangulo1);
        listaDeFiguras.add(triangulo2);
        listaDeFiguras.add(cuadrado);

        for (FiguraGeometrica figura: listaDeFiguras) {
            System.out.println(figura.toString());
        }

    }
}