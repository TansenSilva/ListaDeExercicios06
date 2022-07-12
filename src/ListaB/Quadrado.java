package ListaB;

public class Quadrado implements FiguraGeometrica{
     private double base;
     private double altura;

     private double area;

    public Quadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calculoArea() {
        this.area = this.base*this.altura;
        System.out.println("A área do quadrado é: "+getArea());
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
