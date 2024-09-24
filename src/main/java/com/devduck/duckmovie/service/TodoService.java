package com.devduck.duckmovie.service;

import com.devduck.duckmovie.dao.TodoDAO;
import com.devduck.duckmovie.domain.TodoVO;
import com.devduck.duckmovie.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import com.devduck.duckmovie.util.MapperUtil;


@Log4j2
public enum TodoService {
    INSTANCE;
    private TodoDAO dao;
    private ModelMapper modelMapper;

    TodoService() {
        dao = new TodoDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    //dao.insert(VO) -> DTO 를 VO로 매핑 시켜서 등록하는 메서드
    public void register(TodoDTO todoDTO) throws Exception {
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
//        System.out.println("todoBO: " + todoVO);
        log.info(todoVO);
        dao.insert(todoVO);
    }
}

