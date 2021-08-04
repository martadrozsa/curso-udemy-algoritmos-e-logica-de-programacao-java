package exercises.section4ConditionalStructure;

import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo.
// A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class Exercise12PlayingTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Start time: ");
        int startTime = sc.nextInt();

        System.out.print("Final time: ");
        int finalTime = sc.nextInt();

        int duration;
        if(startTime < finalTime){
            duration = finalTime - startTime;
        }else{
            duration = 24 - (startTime - finalTime);
        }
        System.out.println("The game has last " + duration + " hours");
        sc.close();
    }
}
