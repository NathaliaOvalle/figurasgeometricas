package figurasgeometricas;

public class pentagono
{

    private double altura;
    private double lado;


    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public pentagono(){}
    public pentagono(double base,double altura,double lado)
    {

       
        this.altura= altura;
        this.lado= lado;
    }
    public void calcularArea(){
    System.out.println("el area ingresada tiene una altura" +altura+" y una perimetro "+altura+" que dan como resultado");
}
    public void calcularPerimetro(){
    System.out.println("el perimetro ingresado"+lado+"da como resultado");
}
}
     



