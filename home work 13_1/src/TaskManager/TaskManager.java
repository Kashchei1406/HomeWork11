package TaskManager;

import java.io.Serializable;
import java.util.List;

public class TaskManager implements Serializable {

    private static final long serializableVersion = 1;

    private List<Task> tasks;
    private int HowMuchYuoHaveTasks;


    public void addTask(Task task){
        tasks.add(task);

    }


    public List<Task> getTasks() {
        return tasks;
    }



    public int getHowMuchYuoHaveTasks() {
        return HowMuchYuoHaveTasks;
    }

    public void setHowMuchYuoHaveTasks(int howMuchYuoHaveTasks) {
        HowMuchYuoHaveTasks = howMuchYuoHaveTasks;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "tasks=" + tasks ;
    }
}
