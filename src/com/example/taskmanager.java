public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Add valid tasks
        manager.addTask("Submit assignment");
        manager.addTask("Attend meeting");
        manager.addTask("Buy groceries");

        // Try adding invalid task
        try {
            manager.addTask(""); // should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // Sort tasks
        manager.sortTasks();

        // Search for tasks
        manager.searchTask("Attend meeting");
        manager.searchTask("Nonexistent task");

        // Remove a task
        manager.removeTask("Buy groceries");

        // Try removing invalid
        try {
            manager.removeTask("Unknown");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // Get task by index
        manager.getTaskByIndex(1);
        manager.getTaskByIndex(10); // invalid index

        // Find longest task
        manager.findLongestTask();

        // Display all tasks
        manager.displayAllTasks();
    }
}
