package com.devduck.duckmovie.service;

import com.devduck.duckmovie.dao.TodoDAO;
import com.devduck.duckmovie.domain.TodoVO;
import com.devduck.duckmovie.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import com.devduck.duckmovie.util.MapperUtil;

import java.util.List;
import java.util.stream.Collectors;



public interface TodoService {
    void register(TodoDTO todoDTO);
    List<TodoDTO> findAll();
    TodoDTO getById(Long id);
    void remove(Long tno);
    void modify(TodoDTO todoDTO);
//    INSTANCE;
//    private TodoDAO dao;
//    private ModelMapper modelMapper;
//
//    TodoService() {
//        dao = new TodoDAO();
//        modelMapper = MapperUtil.INSTANCE.get();
//    }
//
//    //dao.insert(VO) -> DTO 를 VO로 매핑 시켜서 등록하는 메서드
//    public void register(TodoDTO todoDTO) throws Exception {
//        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
////        System.out.println("todoBO: " + todoVO);
//        log.info(todoVO);
//        dao.insert(todoVO);
//    }
//
//    public List<TodoDTO> listAll() throws Exception {
//        List<TodoVO> voList = dao.selectAll();
//        log.info("voList....");
//        log.info(voList);
//
//        //DAO 로 가져온 VO 목록들을 모두 DTO 로 변환해서 반환
//        List<TodoDTO> dtoList = voList.stream()
//                .map(vo -> modelMapper.map(vo, TodoDTO.class))
//                .collect(Collectors.toList());
//        return dtoList;
//    }
//
//    //selectOne을 통해서 가져온 TodoVO 객체 를 Model Mapper를 이용해 TodoDto로 매핑
//    public TodoDTO get(Long tno) throws Exception{
//        log.info("tno...." + tno);
//        TodoVO todoVO = dao.selectOne(tno);
//        TodoDTO todoDTO = modelMapper.map(todoVO, TodoDTO.class);
//        return todoDTO;
//    }
//
//    public void remove(Long tno) throws Exception {
//        log.info("tno...." + tno);
//        dao.deleteOne(tno);
//    }
//
//    public void modify(TodoDTO todoDTO) throws Exception {
//        log.info("todoDTO...." + todoDTO);
//        TodoVO todoVO =modelMapper.map(todoDTO, TodoVO.class);
//        dao.updateOne(todoVO);
//    }
}

