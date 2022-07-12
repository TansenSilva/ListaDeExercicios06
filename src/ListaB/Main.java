package ListaB;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(4,4);
        Retangulo retangulo = new Retangulo(4,2);
        Triangulo triangulo = new Triangulo(5,4);
        Circulo circulo = new Circulo(3.8);
        quadrado.calculoArea();
        retangulo.calculoArea();
        triangulo.calculoArea();
        circulo.calculoArea();




    }
}
