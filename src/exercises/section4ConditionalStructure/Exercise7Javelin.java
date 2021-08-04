package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
// Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual foi a maior.

public class Exercise7Javelin {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three distances:");
        double distance1 = sc.nextDouble();
        double distance2 = sc.nextDouble();
        double distance3 = sc.nextDouble();

        double greater;
        if(distance1 > distance2 && distance1 > distance3){
            greater = distance1;
        }else if(distance2 > distance1 && distance2 > distance3){
            greater = distance2;
        }else{
            greater = distance3;
        }
        System.out.printf("Greater distance = %.2f", greater);
        sc.close();
    }
}
