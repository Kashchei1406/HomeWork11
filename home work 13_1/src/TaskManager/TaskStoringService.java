package TaskManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskStoringService implements TaskStoring {

    private static final String FILENAME = "StorageTask.txt";

    @Override
    public void saveTask(Task task) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(FILENAME);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(task);
            System.out.println("Task saved " + task);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void saveTasks(List<Task> tasks) throws IOException {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(FILENAME);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Task task : tasks) {
            try {
                objectOutputStream.writeObject(tasks);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fileOutputStream != null)
                    fileOutputStream.close();
            }
            if (objectOutputStream != null) {

                objectOutputStream.close();
            }
        }

    }

    @Override
    public Task readTask() throws IOException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Task task = null;

        try {
            fileInputStream = new FileInputStream(FILENAME);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            if (object instanceof Task) {
                task = (Task) object;
                System.out.println("task is read" + task);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception reading TaskManager");
            e.printStackTrace();

        } finally {
            if (fileInputStream != null){
                fileInputStream.close();
            }

            if (objectInputStream != null){
                objectInputStream.close();
            }
        }

        return task;

    }

    @Override
    public List<Task> readTasks() throws IOException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Task task = null;
        List<Task> taskList = new ArrayList<>();

        try {
            fileInputStream = new FileInputStream(FILENAME);
            objectInputStream = new ObjectInputStream(fileInputStream);
            while (fileInputStream.available() > 0){
                Object object = objectInputStream.readObject();
                if (object instanceof Task){
                    task = (Task) object;
                    taskList.add(task);
                    System.out.println("task is read" + task);
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null ){
                fileInputStream.close();
            }
            if (objectInputStream != null){
                objectInputStream.close();
            }
        }


        return taskList;

    }
}
