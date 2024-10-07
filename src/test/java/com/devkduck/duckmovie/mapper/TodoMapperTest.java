package com.devkduck.duckmovie.mapper;

import com.devduck.duckmovie.domain.TodoVO;
import com.devduck.duckmovie.dto.PageRequestDTO;
import com.devduck.duckmovie.dto.PageResponseDTO;
import com.devduck.duckmovie.dto.TodoDTO;
import com.devduck.duckmovie.mapper.TodoMapper;
import com.devduck.duckmovie.service.TodoServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTest {
    @Autowired(required = false)
    private TodoMapper todoMapper;
    @Autowired(required = false)
    private TodoServiceImpl todoServiceImpl;

    @Test
    public void testGetTime(){
        log.info(todoMapper.getTime());
    }

    @Test
    public void testInsert(){
        TodoVO todoVO = TodoVO.builder()
                .title("Spring test code 작성")
                .dueDate(LocalDate.of(2024,10,02))
                .writer("user00")
                .build();
        todoMapper.insert(todoVO);
    }

    @Test
    public void testSelectAll(){
        List<TodoVO> todoVOS = todoMapper.selectAll();
        todoVOS.forEach(System.out::println);
    }

    @Test
    public void testSelectById(){
        TodoVO todoVO = todoMapper.selectById(3L);
        log.info(todoVO);
    }

    @Test
    public void testSelectList(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(1)
                .size(10)
                .build();
        List<TodoVO> voList = todoMapper.selectList(pageRequestDTO);
        voList.forEach(vo -> log.info(vo));
    }
    @Test
    public void testPaging(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(1)
                .size(10)
                .build();
        PageResponseDTO<TodoDTO> responseDTO = todoServiceImpl.getList(pageRequestDTO);
        log.info(responseDTO);
        responseDTO.getDtoList().stream().forEach(todoDTO -> log.info(todoDTO));
    }
}

