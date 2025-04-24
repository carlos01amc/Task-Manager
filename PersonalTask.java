public class PersonalTask extends Task{


    PersonalTask(int id,String title, String description){
        super(id,title,description);

    }

    @Override
    public void displayInfo() {
        System.out.printf("""
            [Personal Task]
            Task id: %d
            Title: %s
            Description: %s
            Status: %s

            """, id, title, description, isCompleted);
    }

}
