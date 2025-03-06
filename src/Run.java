
public class Run {
    public void executeTask(int wybor) {
        Task task = new Task();


        switch (wybor) {
            case 1:
                System.out.println("Wykonuje zadanie numer 1");
                task.task1();

                break;

            case 2:
                System.out.println("Wykonuje zadanie numer 2");
                task.task2();
                break;
            case 3:
                System.out.println("Wykonuje zadanie numer 3 ");
                task.task3();
                break;
            case 4:
                System.out.println("Wykonuje zadanie numer 4 ");
                task.task4();
        }
    }
}



