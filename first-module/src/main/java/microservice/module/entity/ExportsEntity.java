package microservice.module.entity;
import lombok.*;
import java.util.List;

@Data
public class ExportsEntity {
    private Long id;
    private String username;
    private String password;
    private List<String> todos;
}
