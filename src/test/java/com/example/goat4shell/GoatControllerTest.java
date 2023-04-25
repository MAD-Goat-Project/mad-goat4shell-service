package com.example.goat4shell;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class GoatControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGoatShell() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }

    @Test
    public void testGoatShellUnsafe() throws Exception {
        this.mockMvc.perform(get("/goatShell/unsafe")
                        .header("X-API-Version", "test"))
                .andExpect(status().isOk());
    }
}
