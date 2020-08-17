package TaskManager;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Task task;
    private static List<Task> tasks;
    private static TaskManager taskManager;
    private static TaskStoring taskStoringService = new TaskStoringService();
    private static TaskManagerStoring taskManagerStoring = new TaskManagerStoringImpl();

    public static void main(String[] args) throws IOException {

        load();


        Scanner scanerIn = new Scanner(System.in);
        String userchoice;
        while (true){
            System.out.println("Do you want to add a task?");
            userchoice = scanerIn.nextLine();
            if(userchoice.equals("yes")){

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Task:");
                System.out.println();
                System.out.println("Name Task:");
                String scanerName = scanner.nextLine();
                System.out.println("Category Task:");
                String scanerCategory = scanner.nextLine();
                System.out.println("Priority Task:");
                String scanPriority = scanner.nextLine();
                System.out.println("Day of completion task");
                long dateScan = Long.parseLong(scanner.nextLine());
                task = new Task(scanerName,scanerCategory,scanPriority, dateScan);
                taskStoringService.saveTask(task);
                print(tasks);
                tasks.add(task);
            }else {
                break;
            }


        }

        taskManager.addTask(task);
        taskManagerStoring.saveTaskManager(taskManager);
    }

    private static void print(List<Task> tasks) {
        tasks.forEach(System.out::println);
    }

//    private static void setTask() throws IOException {
//
//        Task task1 = null;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Task:");
//        System.out.println();
//        System.out.println("Name Task:");
//        String scanerName = scanner.nextLine();
//        System.out.println("Category Task:");
//        String scanerCategory = scanner.nextLine();
//        System.out.println("Priority Task:");
//        String scanPriority = scanner.nextLine();
//        System.out.println("Day of completion task");
//        long dateScan = Long.parseLong(scanner.nextLine());
//        task1 = new Task(scanerName,scanerCategory,scanPriority, dateScan);
//
//        taskStoringService.saveTask(task1);
//
//        print(tasks);
//
//        taskManagerStoring.saveTaskManager(taskManager);
//
//
//    }
    private static void load() throws IOException {
        tasks = taskStoringService.readTasks();
        taskManager = taskManagerStoring.readTaskManager();


    }
}
