package microservice.module2.entity;

import lombok.Data;

@Data
public class Todo {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
    private Long userId;
}
