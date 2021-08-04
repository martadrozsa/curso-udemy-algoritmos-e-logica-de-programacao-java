package exercises.section3SequentialStructure;

import java.util.Scanner;

// Fazer um programa para ler o nome e idade de duas pessoas.
// Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa decimal.

public class Exercise3Age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data of the first person");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Age: ");
        int age1 = sc.nextInt();

        System.out.println("Enter the data of the second person");
        System.out.print("Name: ");
        sc.nextLine();
        String name2 = sc.nextLine();
        System.out.print("Age: ");
        int age2 = sc.nextInt();

        double average = (age1 + age2) / 2.0;

        System.out.println("The average age of " + name1 + " and " + name2 + " is " + average + " years");
        sc.close();
    }
}
