package com.devduck.duckmovie.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@Service
public class SampleService {

    private final SampleDAO sampleDAO;

    public SampleService(@Qualifier("sampleDAOImpl") SampleDAO sampleDAO) {
        this.sampleDAO = sampleDAO;
    }

}
