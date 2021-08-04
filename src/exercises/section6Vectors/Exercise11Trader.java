package exercises.section6Vectors;

import java.util.Locale;
import java.util.Scanner;

// Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa.
// Para isto, mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de venda das mesmas.
// Fazer um programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram:
// - lucro < 10%
// - 10% ≤ lucro ≤ 20%
// - lucro > 20%
// Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.

public class Exercise11Trader {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How much product data will be entered: ");
        int n = sc.nextInt();

        String[] name = new String[n];
        double[] buy = new double[n];
        double[] sale = new double[n];
        double[] percentageProfit = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Product %d:\n", i + 1);
            System.out.print("Product's name: ");
            name[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("Purchase price: ");
            buy[i] = sc.nextDouble();
            System.out.print("Sale price: ");
            sale[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            percentageProfit[i] = (sale[i] - buy[i]) / buy[i] * 100;
        }
        int profitBelow10 = 0;
        int profitBetween = 0;
        int profitAbove20 = 0;

        for (int i = 0; i < n; i++) {
            if (percentageProfit[i] < 10.0) {
                profitBelow10++;
            }
            else if (percentageProfit[i] < 20.0) {
                profitBetween++;
            }
            else {
                profitAbove20++;
            }
        }

        double totalBuy = 0;
        double totalSale = 0;
        for (int i = 0; i < n; i++) {
            totalBuy = totalBuy + buy[i];
            totalSale = totalSale + sale[i];
        }

        double totalProfit = totalSale - totalBuy;

        System.out.println();
        System.out.println("REPORT");
        System.out.println();
        System.out.printf("Profit below 10%%: %d\n", profitBelow10);
        System.out.printf("Profit between 10%% and 20%%: %d\n", profitBetween);
        System.out.printf("Profit above 20%%: %d\n", profitAbove20);
        System.out.printf("Total purchase amount: %.2f\n", totalBuy);
        System.out.printf("Total sales value: %.2f\n", totalSale);
        System.out.printf("Total profit: %.2f\n", totalProfit);

    }
}
