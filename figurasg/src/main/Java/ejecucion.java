package figurasgeometricas;

public class ejecucion 
{
    public static void main(String[] args) 
    {
        paralelogramo paralelogramito = new paralelogramo();
        
        paralelogramito.setBase(12);
        paralelogramito.setAltura(8);

        paralelogramito.calcularArea(3,10);
        paralelogramito.calcularPerimetro(4);

        circulo circulito = new circulo();

        circulito.setPi(7);
        circulito.setRadio(5);

        circulito.calcularArea(11, 4);
        circulito.calcularPerimetro(3);

        pentagono pentagonito = new pentagono();

        pentagonito.setPerimetro(8);
        pentagonito.setAltura(4);

        pentagonito.calcularArea(2);
        pentagonito.calcularPerimetro(13);
        
    }
}



    
    

