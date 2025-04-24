import java.util.ArrayList;

public class TaskManager {

    ArrayList<Task> taskList = new ArrayList<>();

    public void addTask(Task task){
        taskList.add(task);
    }

    public void removeTask(int id){
        Task taskToRemove = null;

        for(Task t : taskList){
            if(t.id == id){
                taskToRemove = t;
            }
        }

        if (taskToRemove != null) {
            taskList.remove(taskToRemove);
            System.out.printf("Task with id %d removed\n\n", id);
        } else {
            System.out.println("Task not found.");
        }
    }

    public void listTasks(){
        for(Task task : taskList){
            task.displayInfo();
        }
    }

    public void completeTaskById(int id){
        for (Task task : taskList) {
            if (task.id == id) {
                task.markAsCompleted();
                return;
            }
        }
        System.out.println("Task not found.");
    }

}
