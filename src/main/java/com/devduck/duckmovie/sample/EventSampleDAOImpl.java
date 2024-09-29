package com.devduck.duckmovie.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Primary
@Repository
@Qualifier("event")
public class EventSampleDAOImpl implements SampleDAO{
}
