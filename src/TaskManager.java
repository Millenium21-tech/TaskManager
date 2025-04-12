import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TaskManager {
    private ArrayList<String> arrayListTasks;
    private LinkedList<String> linkedListTasks;

    public TaskManager() {
        arrayListTasks = new ArrayList<>();
        linkedListTasks = new LinkedList<>();
    }

    // Add a task to both lists
    public void addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Task cannot be empty or null.");
        }

        arrayListTasks.add(task);
        linkedListTasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Sort tasks in ArrayList alphabetically
    public void sortTasks() {
        Collections.sort(arrayListTasks);
        Collections.sort(linkedListTasks);
        System.out.println("Tasks sorted alphabetically.");
    }

    // Search for a specific task
    public int searchTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Search task cannot be empty or null.");
        }

        int index = arrayListTasks.indexOf(task);
        if (index != -1) {
            System.out.println("Task found at index: " + index);
        } else {
            System.out.println("Task not found.");
        }
        return index;
    }

    // Remove a task from both lists
    public void removeTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new IllegalArgumentException("Task to remove cannot be empty or null.");
        }

        boolean removedFromArrayList = arrayListTasks.remove(task);
        boolean removedFromLinkedList = linkedListTasks.remove(task);

        if (removedFromArrayList || removedFromLinkedList) {
            System.out.println("Task removed: " + task);
        } else {
            throw new IllegalArgumentException("Task not found: " + task);
        }
    }

    // Find the longest task in ArrayList
    public String findLongestTask() {
        if (arrayListTasks.isEmpty()) {
            return null;
        }

        String longest = arrayListTasks.get(0);
        for (String task : arrayListTasks) {
            if (task.length() > longest.length()) {
                longest = task;
            }
        }

        System.out.println("Longest task: " + longest);
        return longest;
    }

    // Retrieve a task by index from ArrayList with exception handling
    public String getTaskByIndex(int index) {
        try {
            String task = arrayListTasks.get(index);
            System.out.println("Task at index " + index + ": " + task);
            return task;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index " + index);
            return null;
        }
    }

    // Display all tasks
    public void displayAllTasks() {
        System.out.println("\nAll tasks in ArrayList:");
        for (String task : arrayListTasks) {
            System.out.println("- " + task);
        }

        System.out.println("\nAll tasks in LinkedList:");
        for (String task : linkedListTasks) {
            System.out.println("- " + task);
        }
    }
}
