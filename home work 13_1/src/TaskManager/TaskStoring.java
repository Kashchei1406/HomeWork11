package TaskManager;

import java.io.IOException;
import java.util.List;

public interface TaskStoring {

    void saveTask(Task task);

    void saveTasks(List<Task> tasks) throws IOException;

    Task readTask() throws IOException;

    List<Task> readTasks() throws IOException;
}
