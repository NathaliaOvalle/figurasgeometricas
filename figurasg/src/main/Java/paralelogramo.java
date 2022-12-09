package figurasgeometricas;

public class paralelogramo extends figurasgeometricas
 {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double perimetro;
    private double area;
  
    
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
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public paralelogramo(){}
    public paralelogramo(double base,double altura,double lado)
    {
        this.base= base;
        this.altura= altura;
        this.lado1= lado;
        this.lado2= lado2;
        
    }
    
    public void calcularArea(double base,  double altura){
        area= base*altura;
        System.out.println("el area ingresada tiene una base" +base+" y una altura "+altura+" que dan como resultado");
    }
    
    public void calcularPerimetro(double lado){
        perimetro= lado1+lado2;
        System.out.println("el perimetro ingresado"+lado+"da como resultado");
    }
}