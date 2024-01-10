// Task Entity Class
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate dueDate;
    private Priority priority;
    private boolean completed;

    // Getters and setters
}

// Enum for Priority Levels
public enum Priority {
    LOW,
    MEDIUM,
    HIGH
}

// TaskRepository Interface
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Custom repository methods if needed
}

// TaskService Class
@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    // Task-related business logic
}

// TaskController Class
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    // REST endpoints for task management
}
