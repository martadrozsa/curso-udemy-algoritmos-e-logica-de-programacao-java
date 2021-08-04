package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// Uma lanchonete possui vários produtos. Cada produto possui um código e um preço.
// Você deve fazer um programa para ler o código e a quantidade comprada de um produto (suponha um código válido),
// e daí informar qual o valor a ser pago, com duas casas decimais, conforme tabela de produtos.

/*  Código do produto    Preço do produto
        1                   R$ 5.00
        2                   R$ 3.50
        3                   R$ 4.80
        4                   R$ 8.90
        5                   R$ 7.32
*/

public class Exercise9Cafeteria {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Purchased product code: ");
        int code = sc.nextInt();

        System.out.print("Quantity purchased: ");
        int quantity = sc.nextInt();

        double payValue = 0;
        if(code == 1){
            payValue = quantity * 5.00;
        }else if(code == 2){
            payValue = quantity * 3.50;
        }else if(code == 3){
            payValue = quantity * 4.80;
        }else if(code == 4){
            payValue = quantity * 8.90;
        }else if(code == 5){
            payValue = quantity * 7.32;
        }
        System.out.printf("\nAmount payable: R$ %.2f", payValue);
        sc.close();
    }
}
