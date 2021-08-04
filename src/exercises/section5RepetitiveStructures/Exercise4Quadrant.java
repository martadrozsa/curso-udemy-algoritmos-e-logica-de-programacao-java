package exercises.section5RepetitiveStructures;

import java.util.Scanner;

// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
// Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4).
// O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

public class Exercise4Quadrant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of the X and Y coordinates: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Quadrant Q1");
            }else if(x < 0 && y > 0){
                System.out.println("Quadrant Q2");
            }else if(x < 0 && y < 0){
                System.out.println("Quadrant Q3");
            }else if(x > 0 && y < 0){
                System.out.println("Quadrant Q4");

            }
            System.out.println("Enter the values of the X and Y coordinates: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
