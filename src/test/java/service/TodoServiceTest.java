//package service;
//
//import com.devduck.duckmovie.dto.TodoDTO;
//import com.devduck.duckmovie.service.TodoService;
//import lombok.extern.log4j.Log4j2;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDate;
//
//@Log4j2
//public class TodoServiceTest {
//    private TodoService todoService;
//
//    @BeforeEach
//    public void ready(){
//        todoService = TodoService.INSTANCE;
//    }
//
//    @Test
//    public void testRegister() throws Exception{
//        TodoDTO todoDTO = TodoDTO.builder()
//                .title("JDBC TEST TITLE")
//                .dueDate(LocalDate.now())
//                .build();
//
//        log.info("===========================");
//        log.info(todoDTO);
//        todoService.register(todoDTO);
//    }
//
//}
