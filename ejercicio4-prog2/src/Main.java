import Classes.*;
import Interfaces.FiguraGeometrica;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <FiguraGeometrica> listaDeFiguras = new ArrayList<>();
        Circulo circulo1 = new Circulo(2);
        Circulo circulo2 = new Circulo(6);
        Triangulo triangulo1 = new Triangulo(12);
        Triangulo triangulo2 = new Triangulo(3.5);
        Cuadrado cuadrado = new Cuadrado(4);

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