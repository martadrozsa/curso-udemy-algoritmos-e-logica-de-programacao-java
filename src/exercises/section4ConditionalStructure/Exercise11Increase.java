package exercises.section4ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

// Uma empresa vai conceder um aumento percentual de salário aos seus funcionários dependendo de quanto cada pessoa ganha, conforme tabela ao lado.
// Fazer um programa para ler o salário de uma pessoa, daí mostrar qual o novo salário desta pessoa depois do aumento, quanto foi o aumento e qual foi a porcentagem de aumento.

public class Exercise11Increase {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        double increase = 0;
        double newSalary = 0;
        int percentage = 0;

        if(salary <= 1000.00){
            percentage = 20;
            increase = (salary * 20) / 100;
            newSalary = salary + increase;
        }else if(salary <= 3000.00){
            percentage = 15;
            increase = (salary * 15) / 100;
            newSalary = salary + increase;
        }else if(salary <= 8000.00){
            percentage = 10;
            increase = (salary * 10) / 100;
            newSalary = salary + increase;
        }else if(salary > 8000.00){
            percentage = 5;
            increase = (salary * 5) / 100;
            newSalary = salary + increase;
        }

        System.out.printf("New salary = R$ %.2f\n", newSalary);
        System.out.printf("Increase = R$ %.2f\n", increase);
        System.out.println("Percentage = " + percentage + "%");
        sc.close();
    }
}
