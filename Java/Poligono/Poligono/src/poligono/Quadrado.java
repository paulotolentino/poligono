package poligono;

public class Quadrado extends Poligono{
    double tamanhoLados;
    public Quadrado(double tamLados){
        tamanhoLados = tamLados;
    }

    @Override
    public double calcularArea(){
        return tamanhoLados * tamanhoLados;
    }
    
    @Override
    public double calcularPerimetro(){
        return tamanhoLados * 4;
    }
}
