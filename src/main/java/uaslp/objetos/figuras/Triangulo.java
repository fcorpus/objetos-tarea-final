package uaslp.objetos.figuras;

import java.security.PublicKey;

public class Triangulo implements DrawableItem, Figura{
    private double base;
    private double altura;
    private double area;
    private String description = "Cualquier triangulo";
    public Triangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    public Triangulo(){

    }
    public Triangulo(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
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
    public String getName(){
        return "Triangulo";
    }
}
