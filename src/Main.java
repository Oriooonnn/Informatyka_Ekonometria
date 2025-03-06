import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz zadanie od 1 do 5");
        System.out.println("Zadanie numer 1");
        System.out.println("Zadanie numer 2");
        System.out.println("Zadanie numer 3");
        System.out.println("Zadanie numer 4");
        System.out.println("Zadanie numer 5");
        int wybor = scanner.nextInt();
        Run runProgram =new Run();
        runProgram.executeTask(wybor);

        scanner.close();
    }
}

