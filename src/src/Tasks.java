import java.util.Scanner;

public class Tasks {
    public void task01(){
        System.out.println("Jan, 21");
    }
    public void task02(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public boolean task03(int num){
        return num % 2 == 0;
    }
    public boolean task04(int num){
        return num % 3 == 0 || num % 5 == 0;
    }
    public double task05(int num){
        return Math.pow(num, 5);
    }
    public double task06(int num){
        return Math.sqrt(num);
    }
    public boolean task07(int a, int b, int c){
        return a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a;
    }
}
