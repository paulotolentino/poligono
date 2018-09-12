package poligono;

public class Triangulo extends Poligono{
    double lado1, lado2, lado3;
    
    private Triangulo(double a, double b, double c){
        lado1 = a;
        lado2 = b;
        lado3 = c;
    }
    
    @Override
    public double calcularArea(){
        double p = (lado1 + lado2 + lado3)/2;
        double a = Math.sqrt(p * (p-lado1) * (p-lado2) * (p-lado3));
        return a;        
    }
    
    @Override
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    
    public static Triangulo getInstance(double a, double b, double c){
        if(ehTriangulo(a, b, c)){
            Triangulo t = new Triangulo(a, b, c);
            return t;
        }
        return null;
    }
    
    private static boolean ehTriangulo(double a, double b, double c){
        if (( a < b + c ) && ( b < a + c ) && ( c < a + b )) return true;
        return false;
    }
    
    public boolean ehEquilatero(){
        if(lado1 == lado2 && lado2 == lado3) return true;
        return false;
    }
    
    public boolean ehIsoceles(){
        if(lado1 == lado2 ^ lado2 == lado3 ^ lado1 == lado3) return true;
        return false;
    }
    
    public boolean ehEscaleno(){
        if(lado1 != lado2 & lado2 != lado3 & lado1 != lado3) return true;
        return false;
    }
    
    public boolean ehRetangulo(){
        if(Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)
                || Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2)
                || Math.pow(lado3, 2) + Math.pow(lado1, 2) == Math.pow(lado2, 2)) return true;
        return false;
    }
}
