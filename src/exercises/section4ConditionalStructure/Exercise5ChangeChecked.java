package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
// O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente. S
// eu programa deve mostrar o valor do troco a ser devolvido ao cliente.
// Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o valor restante.

public class Exercise5ChangeChecked {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the unit price of the product: ");
        double priceProduct = sc.nextDouble();

        System.out.print("Enter the quantity purchased: ");
        int quantity = sc.nextInt();

        System.out.print("Enter the money received: ");
        double money = sc.nextDouble();

        double buy = (priceProduct * quantity);
        double change = buy - money;

        if(buy > money){
            System.out.println("Insufficient money");
            System.out.printf("You need %.2f more dollars", change);
        }else{
            System.out.printf("Change %.2f", change);
        }
    }
}
