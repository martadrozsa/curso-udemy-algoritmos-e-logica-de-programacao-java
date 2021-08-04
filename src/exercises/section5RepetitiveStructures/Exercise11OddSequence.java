package exercises.section5RepetitiveStructures;

import java.util.Scanner;

// Leia um valor inteiro X.
//E m seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

public class Exercise11OddSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of X: ");
        int x = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
