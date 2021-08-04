package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// Leia os valores das coordenadas X e Y de um ponto no plano cartesiano.
// A seguir, determine qual o quadrante ao qual pertence o ponto (Q1, Q2, Q3 ou Q4).
// Se o ponto estiver na origem, escreva a mensagem “Origem”.
// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

public class Exercise13Coordinates {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        double x = sc.nextDouble();

        System.out.print("Enter the value of Y: ");
        double y = sc.nextDouble();


        if(x > 0 && y > 0){
            System.out.println("Quadrant = Q1");
        }else if(x < 0 && y > 0){
            System.out.println("Quadrant = Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Quadrant = Q3");
        }else if(x > 0 && y < 0){
            System.out.println("Quadrant = Q4");
        }else if(x == 0){
            System.out.println("Axis Y");
        }else if(y == 0){
            System.out.println("Axis X");
        }else if(x == 0 && y == 0) {
            System.out.println("Origen");
        }
        sc.close();
    }
}
