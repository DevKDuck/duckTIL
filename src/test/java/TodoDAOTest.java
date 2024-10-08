import com.devduck.duckmovie.dao.TodoDAO;
import com.devduck.duckmovie.domain.TodoVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class TodoDAOTest {
    private TodoDAO todoDAO;

    @BeforeEach
    public void ready(){
        todoDAO = new TodoDAO();
    }

    @Test
    public void testTime() throws Exception{
        System.out.println(todoDAO.getTime());
    }

    @Test
    public void testInsert() throws Exception{
        TodoVO todoVO = TodoVO.builder().title("Sample Title...").dueDate(LocalDate.of(2021,12,31)).build();

        todoDAO.insert(todoVO);
    }

    @Test
    public void testList() throws Exception{
        List<TodoVO> list = todoDAO.selectAll();
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectOne() throws Exception{
        Long tno = 1L;
        TodoVO vo = todoDAO.selectOne(tno);
        System.out.println(vo);
    }

    @Test
    public void testUpdateOne() throws Exception{
        TodoVO todoVO = TodoVO.builder()
                .tno(1L)
                .title("샘플...")
                .dueDate(LocalDate.of(2024,9,24))
                .finished(true)
                .build();

        todoDAO.updateOne(todoVO);
    }
}
