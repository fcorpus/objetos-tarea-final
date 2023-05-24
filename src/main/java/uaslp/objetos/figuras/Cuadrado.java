package uaslp.objetos.figuras;

import uaslp.objetos.figuras.exceptions.LadoNoProvistoException;
import uaslp.objetos.figuras.exceptions.DatoFaltanteException;

public class Cuadrado implements DrawableItem, Figura {
    private double lado = -1;
    private double area;

    public Cuadrado(double lado){
        this.lado = lado;
    }
    public Cuadrado(){

    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public double getArea() throws LadoNoProvistoException {
        if(lado < 0){
            throw new LadoNoProvistoException();
        }
        return area = lado*lado;
    }

    public double getLado() {
        return lado;
    }

    public String getName() {
        return "Cuadrado";
    }
}
