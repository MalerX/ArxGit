package org.john.arxgit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConfig {

    @Test
    void load() {
        Assertions.assertDoesNotThrow(() -> {
            Config cfg = new Config();
        });


        Assertions.assertThrows(Exception.class, () -> {
                Config cfg = new Config();
                cfg.load("");
        });
    }

    // TODO: make another tests
}
