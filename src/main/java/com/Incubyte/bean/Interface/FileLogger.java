package com.Incubyte.bean.Interface;

import io.micronaut.context.annotation.Primary;
import jakarta.inject.Singleton;

@Singleton
@Primary
public class FileLogger implements Logger {
    @Override
    public void log(){
        System.out.println("Logging to File");
    }
}
