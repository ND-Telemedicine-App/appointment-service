package com.team4.appointment_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
class AppointmentServiceApplicationTests {

    @Autowired
    private AppointmentService service;

    @Test
    public void whenContextLoads_thenServiceISNotNull() {

        Assertions.assertNotNull(service);


    }

}
