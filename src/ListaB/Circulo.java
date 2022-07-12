package ListaB;

public class Circulo implements FiguraGeometrica{

    private double raio;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calculoArea() {
        this.area = (this.raio*this.raio)*3.14;
        System.out.println("A área do triângulo é: "+getArea());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
