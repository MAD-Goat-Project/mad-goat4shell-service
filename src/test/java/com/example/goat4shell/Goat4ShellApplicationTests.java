package com.example.goat4shell;

import com.example.goat4shell.Controller.GoatController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class Goat4ShellApplicationTests {

    @Autowired
    private GoatController goatController;

    @Test
    void contextLoads() {
        assertThat(goatController).isNotNull();
    }

}
