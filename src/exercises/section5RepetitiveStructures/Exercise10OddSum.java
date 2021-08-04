package exercises.section5RepetitiveStructures;

import java.util.Scanner;

// Leia 2 valores inteiros X e Y (em qualquer ordem).
// A seguir, calcule e mostre a soma dos números impares entre eles.

public class Exercise10OddSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of X: ");
        int x = sc.nextInt();

        System.out.print("Enter the number of Y: ");
        int y = sc.nextInt();

        if(x > y){
            int aux = x;
            x = y;
            y = aux;
        }

        int sum = 0;
        for(int i = x+1; i < y; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }

        }
        System.out.println(sum);
        sc.close();
    }
}
