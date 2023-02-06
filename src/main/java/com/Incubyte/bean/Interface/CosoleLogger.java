package com.Incubyte.bean.Interface;

import io.micronaut.context.annotation.Secondary;
import jakarta.inject.Singleton;

@Singleton
@Secondary
public class CosoleLogger implements Logger {
    @Override
    public void log() {
        System.out.println("Logging to Console");
    }
}
