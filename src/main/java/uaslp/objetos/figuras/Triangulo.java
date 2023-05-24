package uaslp.objetos.figuras;

public class Triangulo {
    private double base;
    private double altura;
    private double area;
    public Triangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }
    public Triangulo(){

    }
    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getArea(){
        return area = (base*altura)/2;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
}
