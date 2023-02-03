package com.Incubyte.bean.Interface;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class InterfaceApplicationTest {

    @Inject
    private InterfaceApplication myApplication;

    @Test
    void process() {
        myApplication.process();
    }
}