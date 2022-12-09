package figurasgeometricas;

public class circulo
{
private double radio;
private double pi;
private double diametro;

public double getRadio() {
    return radio;
}
public void setRadio(double radio) {
    this.radio = radio;
}
public double getPi() {
    return pi;
}
public void setPi(double pi) {
    this.pi = pi;
}
public double getDiametro() {
    return diametro;
}
public void setDiametro(double diametro) {
    this.diametro = diametro;
}
public circulo(){}
public circulo(double base,double altura,double lado)
{
    this.radio= radio;
    this.pi= pi;
    this.diametro= diametro;
    
}

public void calcularArea(){
    System.out.println("el area ingresada tiene una base" +radio+" y una altura "+pi+" que dan como resultado");
}

public void calcularPerimetro(){
    System.out.println("el perimetro ingresado"+diametro+"da como resultado");
}
}