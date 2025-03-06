//zadanie 1


import java.util.Random;
import java.util.Scanner;
public class Task {
    public void task1(){

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
    public void task2(){
        System.out.println("Podaj 10 liczb");
        Scanner scanner = new Scanner(System.in);
        int liczba_dodatnich = 0, liczba_ujemnych =0;
        int suma_dodatnich =0, suma_ujemnych =0;
        int licznik_liczb = 0;
        int i = 0;


        while(i<10) {
            System.out.println("Podaj liczbe " + (i + 1) + ":");
            int liczba = scanner.nextInt();

            if (liczba < 0) {
                liczba_ujemnych += 1;
                suma_ujemnych += liczba;
            } else {
                liczba_dodatnich += 1;
                suma_dodatnich += liczba;
            }
            i++;

        }
        System.out.println("Liczba liczb ujemnych wynosi " + liczba_ujemnych + "a ich suma wynosi " + suma_ujemnych + "Natomiast liczba liczb dodatnich wynosi " + liczba_dodatnich + "a ich suma wynosi " + suma_dodatnich);





    }

    public void task3(){
        System.out.println("Podaj ilość wyrazów ciągu an");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int suma_parzystych = 0;
        for(i=0; i<n; i++){
            if(i%2==0){
                suma_parzystych += i;

            }
        }
    System.out.println("Suma elementów parzystych ciągu " + n + " wyrazowego wynosi " + suma_parzystych);
    }
    public void task4(){
        System.out.println("Wybierz liczbe elementów do wylosowania z przedziału (-10, 45)");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int Dolna_Granica_Przedziału = -10;
        int Gorna_Granica_Przedziału = 45;
        int Suma_Parzystych = 0;

        int i = 0;
        while(i < n) {
            int losowa_liczba = random.nextInt(Gorna_Granica_Przedziału -Dolna_Granica_Przedziału + 1) + Dolna_Granica_Przedziału;
            System.out.println(losowa_liczba);
            if(losowa_liczba%2 ==0) {
                Suma_Parzystych += n;
            }
            i++;

        }
    System.out.println("Suma liczb parzystych w wylosowanym przedziale to " + Suma_Parzystych);
    }
}