package com.devduck.duckmovie.mapper;

import com.devduck.duckmovie.domain.TodoVO;

import java.util.List;

public interface TodoMapper {
    String getTime();
    void insert(TodoVO todoVO);
    List<TodoVO> selectAll();
}
