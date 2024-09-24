package service;

import com.devduck.duckmovie.dto.TodoDTO;
import com.devduck.duckmovie.service.TodoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TodoServiceTest {
    private TodoService todoService;

    @BeforeEach
    public void ready(){
        todoService = TodoService.INSTANCE;
    }

    @Test
    public void testRegister() throws Exception{
        TodoDTO todoDTO = TodoDTO.builder()
                .title("JDBC TEST TITLE")
                .dueDate(LocalDate.now())
                .build();

        todoService.register(todoDTO);
    }

}
