package poligono;

import java.util.Scanner;
import static poligono.Triangulo.getInstance;

public abstract class Poligono {

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int opcao;
        
        System.out.println("### Digite  a opção desejada ###");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Triângulo");
        opcao = ler.nextInt();
        
        switch(opcao){
                case 1:
                    System.out.println("Digita o lado do quadrado");
                    Quadrado q = new Quadrado(ler.nextDouble());
                    System.out.println("Area do Quadrado: " + q.calcularArea());
                    System.out.println("Perímetro do Quadrado: " + q.calcularPerimetro());
                    break;
                case 2:
                    System.out.println("Digita os lados do triângulo");
                    Triangulo t = getInstance(ler.nextDouble(),ler.nextDouble(),ler.nextDouble());
                    if(t!= null){
                        System.out.println("Area do Triângulo: " + t.calcularArea());
                        System.out.println("Perímetro do Triângulo: " + t.calcularPerimetro());
                        if(t.ehEquilatero()) System.out.println("Equilátero");
                        else if(t.ehRetangulo()) System.out.println("Retângulo");
                        else if(t.ehIsoceles()) System.out.println("Isóceles");
                        else System.out.println("Escaleno");
                    }
                    else System.out.println("Valores inválidos");
                    break;
                default:
                    System.out.println("Opção inválida");
        }
    }
}
