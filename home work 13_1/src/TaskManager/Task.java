package TaskManager;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Task implements Serializable {
    private static final long serializableVersion = 1;

    private String name;
    private String priority;
    private String category;
    private long dateOfCompletion;

    public Task(String name, String priority, String category, long dateOfCompletion) {
        this.name = name;
        this.priority = priority;
        this.category = category;
        this.dateOfCompletion = dateOfCompletion;
    }
//    public Task setTask() throws IOException {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Task");
//        System.out.println();
//        System.out.println("Name Task:");
//        String scanerName = scanner.nextLine();
//        System.out.println("Category Task:");
//        String scanerCategory = scanner.nextLine();
//        System.out.println("Priority Task:");
//        String scanPriority = scanner.nextLine();
//        System.out.println("Day of completion task");
//        long dateScan = Long.parseLong(scanner.nextLine());
//        Task task = new Task(scanerName, scanerCategory, scanPriority, dateScan);
//        return task;
//    }

        ///regiongetters\setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getDateOfCompletion() {
        return dateOfCompletion;
    }

    public void setDateOfCompletion(long dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }
    ///endregion


    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                ", category='" + category + '\'' +
                ", dateOfCompletion=" + dateOfCompletion +
                '}';
    }
}
