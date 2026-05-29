
public class TaskManager {

    @ImportantTask(priority = "High")
    public void completeProject() {
        System.out.println("Complete Java Project");
    }

    @ImportantTask(priority = "Low")
    public void attendMeeting() {
        System.out.println("Attend Team Meeting");
    }

    public void normalTask() {   
        System.out.println("Normal Task");
    }
}
