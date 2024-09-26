package com.devduck.duckmovie.service;

import com.devduck.duckmovie.dao.MemberDAO;
import com.devduck.duckmovie.domain.MemberVO;
import com.devduck.duckmovie.dto.MemberDTO;
import com.devduck.duckmovie.util.MapperUtil;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;

@Log4j2
public enum MemberService {
    INSTANCE;

    private MemberDAO dao;
    private ModelMapper modelMapper;

    MemberService(){
        dao = new MemberDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    public MemberDTO login(String mid, String mpw) throws Exception{
        MemberVO vo = dao.getWithPasssword(mid,mpw);
        MemberDTO memberDTO = modelMapper.map(vo, MemberDTO.class);
        return memberDTO;
    }
}
