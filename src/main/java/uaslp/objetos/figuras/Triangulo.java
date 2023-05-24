package uaslp.objetos.figuras;

import uaslp.objetos.figuras.exceptions.AlturaNoProvistaException;
import uaslp.objetos.figuras.exceptions.BaseNoProvistaException;

import java.security.PublicKey;

public class Triangulo implements DrawableItem, Figura{
    private double base=-1;
    private double altura=-1;
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
    public double getArea() throws BaseNoProvistaException, AlturaNoProvistaException {
        if(base<0){
            throw new BaseNoProvistaException();
        }
        if(altura<0){
            throw new AlturaNoProvistaException();
        }
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
