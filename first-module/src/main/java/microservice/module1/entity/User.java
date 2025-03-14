package microservice.module1.entity;
import lombok.*;
import java.util.List;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private List<String> todos;
}
