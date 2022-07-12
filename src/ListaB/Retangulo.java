package ListaB;

public class Retangulo implements FiguraGeometrica{

    private double base;
    private double altura;
    private double area;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calculoArea() {
        this.area = this.base*this.altura;
        System.out.println("A área do retângulo é: "+getArea());
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
