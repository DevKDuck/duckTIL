package com.devduck.duckmovie.todo.service;

import com.devduck.duckmovie.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE;

    public void register(TodoDTO todoDTO) {
        System.out.println("DEBUG..........." + todoDTO);
    }

    public List<TodoDTO> getList() {
        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i -> {
            TodoDTO todoDTO = new TodoDTO();
            todoDTO.setTno((long) i);
            todoDTO.setTitle("Todo..." + i );
            todoDTO.setDueDate(LocalDate.now());
            return todoDTO;
        }).collect(Collectors.toList());
        return todoDTOS;
    }

    public TodoDTO get(Long tno) {
        TodoDTO todoDTO = new TodoDTO();
        todoDTO.setTno(tno);
        todoDTO.setTitle("Sample Todo");
        todoDTO.setDueDate(LocalDate.now());
        todoDTO.setFinished(true);
        return todoDTO;
    }
}
