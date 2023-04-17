package com.example.madgoatlog4shell;

import com.example.madgoatlog4shell.Controller.GoatController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class MadGoatLog4shellApplicationTests {

    @Autowired
    private GoatController goatController;

    @Test
    void contextLoads() {
        assertThat(goatController).isNotNull();
    }

}
