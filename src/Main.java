import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość studentów:");
        int n = scanner.nextInt();
        int suma = 0, i=0;
        while(i < n) {
            System.out.println("Podaj ilość punktów studenta" + (i + 1) + ":");
            suma += scanner.nextInt();
            i++;
        }
        System.out.println("Średnia punktów studentów to:" + (double) suma / n);
        scanner.close();

    }
}