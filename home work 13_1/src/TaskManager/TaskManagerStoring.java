package TaskManager;

public interface TaskManagerStoring {

    void saveTaskManager(TaskManager taskManager);

    TaskManager readTaskManager();
}
