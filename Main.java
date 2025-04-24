import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        boolean run = true;
        TaskManager list = new TaskManager();
        int taskCounter = 0;

        while(run){

            Scanner scanner = new Scanner(System.in);
            System.out.println("** Task Manager **");
            System.out.print("""
                    Options: \s
                    1 -> List tasks\s
                    2 -> Add work task\s
                    3 -> Add personal task\s
                    4 -> Mark task as complete\s
                    5 -> Remove task\s
                    0 -> Exit
                    
                    """);
            System.out.print("Select option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    list.listTasks();
                    break;

                case 2:
                    taskCounter ++;
                    System.out.println("Title: ");
                    String title1 = scanner.nextLine();
                    System.out.println("Description: ");
                    String description1 = scanner.nextLine();

                    WorkTask workTask = new WorkTask(taskCounter,title1,description1);

                    list.addTask(workTask);
                    break;

                case 3:
                    taskCounter ++;
                    System.out.println("Title: ");
                    String title2 = scanner.nextLine();
                    System.out.println("Description: ");
                    String description2 = scanner.nextLine();

                    PersonalTask personalTask = new PersonalTask(taskCounter,title2,description2);

                    list.addTask(personalTask);
                    break;

                case 4:
                    System.out.println("Give id: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    list.completeTaskById(id1);
                    break;

                case 5:
                    System.out.println("Give id: ");
                    int id2 = Integer.parseInt(scanner.nextLine());
                    list.removeTask(id2);
                    break;

                case 0:
                    run = false;
                    break;
            }
        }
    }
}
