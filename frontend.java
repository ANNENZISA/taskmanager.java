// TaskManagerApplication Class
public class TaskManagerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskService taskService = new TaskService();

        while (true) {
            System.out.println("Task Manager Menu:");
            System.out.println("1. View Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Implement view tasks functionality
                    break;
                case 2:
                    // Implement add task functionality
                    break;
                case 3:
                    // Implement update task functionality
                    break;
                case 4:
                    // Implement delete task functionality
                    break;
                case 5:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
