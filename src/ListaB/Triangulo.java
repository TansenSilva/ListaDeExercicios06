package ListaB;

public class Triangulo implements FiguraGeometrica{

    private double base;
    private double altura;
    private double area;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calculoArea() {
        this.area = (this.base*this.altura)/2;
        System.out.println("A área do triângulo é: "+getArea());
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
