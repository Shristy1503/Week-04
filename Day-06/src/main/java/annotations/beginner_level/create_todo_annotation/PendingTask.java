package annotations.beginner_level.create_todo_annotation;

public class PendingTask {
    //add connections
    @Todo(task = "Add connections", assignedTo = "Shristy", priority = "HIGH")
    public void addConnection(){
        System.out.println("Add one person at time..");
    }
    //assign project
    @Todo(task = "New project ", assignedTo = "Arjun")
    public void project(){
        System.out.println("New project given..");
    }
    //normal feature
    public void normalProject(){
        System.out.println("This is normal project..");
    }
}
