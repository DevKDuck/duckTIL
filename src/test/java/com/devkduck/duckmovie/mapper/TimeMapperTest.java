package com.devkduck.duckmovie.mapper;

import com.devduck.duckmovie.mapper.TimeMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TimeMapperTest {
    @Autowired(required = false)
    private TimeMapper timeMapper2;

    @Test
    public void testGetTime() {
        log.info(timeMapper2.getTime());
    }
}
