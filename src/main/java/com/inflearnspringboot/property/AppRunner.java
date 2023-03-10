package com.inflearnspringboot.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext context;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = context.getEnvironment();
        //ApplicationContext가 environment를 상속받아 사용 가능
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
    }
}
