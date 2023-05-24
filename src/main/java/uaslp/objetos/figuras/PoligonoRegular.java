package uaslp.objetos.figuras;

public class PoligonoRegular implements  DrawableItem, Figura{
    private int numeroDeLados;
    private double lado;
    private double area;
    private double hipotenusa, ladoMenor, apotema;

    public PoligonoRegular(int numeroDeLados){
        this.numeroDeLados = numeroDeLados;
    }
    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getArea(){
        hipotenusa = Math.pow(lado,2);
        ladoMenor = Math.pow((lado/2),2);
        apotema = Math.sqrt(hipotenusa-ladoMenor);
        return area = ((lado*numeroDeLados)*apotema)/2;
    }
    public double getLado(){
        return lado;
    }
    public String getName(){
        return "Poligono Regular";
    }
}
