package com.Incubyte.user;


import com.Incubyte.Application;


import io.micronaut.runtime.Micronaut;


public class UserApplication {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
