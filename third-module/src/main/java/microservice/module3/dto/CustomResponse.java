package microservice.module3.dto;

import lombok.Data;
import microservice.module1.entity.User;
import microservice.module2.entity.Todo;

import java.util.List;

@Data
public class CustomResponse {
    User user;
    List<Todo> todos;
}
