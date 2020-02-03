package com.tdevilleduc.urthehero.core.service;

import com.tdevilleduc.urthehero.core.AbstractTest;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@QuarkusTest
public class HelloServiceTest extends AbstractTest {

    @Autowired
    HelloService helloService;

    private static final String name = "toto";

    @Test
    public void hello_thenSuccess() {
        String result = helloService.hello(name);
        Assertions.assertNotNull(result);
        Assertions.assertEquals("Hello " + name, result);
    }

    @Test
    public void politeHello_thenSuccess() {
        String result = helloService.politeHello(name);
        Assertions.assertNotNull(result);
        Assertions.assertEquals("Good afternoon " + name, result);
    }
}
