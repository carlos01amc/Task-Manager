public abstract class Task {

    int id;
    String title;
    String description;
    boolean isCompleted = false;

    Task(int id,String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public void markAsCompleted(){
        this.isCompleted = true;
        System.out.println("Task is now completed");
    }

    public void displayInfo(){
        System.out.printf("""
                Task id: %d
                ** Displaying Task Info **\s
                Title: %s
                Description: %s
                Status: %s
           
                """,id,title,description,isCompleted);
    }

}
