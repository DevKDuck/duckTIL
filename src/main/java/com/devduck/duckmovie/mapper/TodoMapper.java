package com.devduck.duckmovie.mapper;

import com.devduck.duckmovie.domain.TodoVO;

public interface TodoMapper {
    String getTime();
    void insert(TodoVO todoVO);
}
