package exercises.section3SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
// O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente).
// Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.

public class Exercise5Change {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Unit price of the product: ");
        double priceUnit = sc.nextDouble();

        System.out.print("Quantity purchased: ");
        int quantityBuy = sc.nextInt();

        System.out.print("Money received: ");
        double money = sc.nextDouble();

        double change = money - (priceUnit * quantityBuy) ;

        System.out.printf("\nChange = %.2f", change);
        sc.close();
    }
}
