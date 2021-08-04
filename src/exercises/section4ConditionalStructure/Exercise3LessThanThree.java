package exercises.section4ConditionalStructure;

import java.util.Scanner;

// Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três números lidos.
// Em caso de empate, mostrar apenas uma vez.

public class Exercise3LessThanThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int value1 = sc.nextInt();

        System.out.print("Enter second value: ");
        int value2 = sc.nextInt();

        System.out.print("Enter third value: ");
        int value3 = sc.nextInt();

        int less;
        if(value1 < value2 && value1 < value3){
            less = value1;
        }else if(value2 < value1 && value2 < value3){
            less = value2;
        }else{
            less = value3;
        }
        System.out.println("\nLess = " + less);
    }
}
