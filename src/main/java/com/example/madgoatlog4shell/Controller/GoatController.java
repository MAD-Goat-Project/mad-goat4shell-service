package com.example.madgoatlog4shell.Controller;

import com.example.madgoatlog4shell.Model.GoatShell;
import com.example.madgoatlog4shell.Utils.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoatController {

    private final GoatShell goatShell = new GoatShell("Goat Shell", Strings.GOAT_SHELL_DESCRIPTION);

    @GetMapping("/goatShell/safe")
    public GoatShell goat() {
        return goatShell;
    }
}
