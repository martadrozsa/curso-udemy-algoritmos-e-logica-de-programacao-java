package exercises.section5RepetitiveStructures;

import java.util.Scanner;

// Leia um valor inteiro N.
// Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo.

public class Exercise12InsideOutside {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of X: ");
        int x = sc.nextInt();

        int inside = 0;
        int outside = 0;
        for (int i = 0; i < x; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num >= 10 && num <= 20) {
                inside++;
            }
            else{
                outside++;
            }
        }
        System.out.println(inside + " Inside");
        System.out.println(outside + " Outside");
        sc.close();
    }
}
