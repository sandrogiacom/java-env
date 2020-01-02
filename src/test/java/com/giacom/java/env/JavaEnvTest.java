package com.giacom.java.env;

import static com.giacom.java.env.JavaEnv.injectEnvironmentVariable;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class JavaEnvTest {

    @Test
    void whenInjectEnvironmentVariableThenCheckValue() throws Exception {
        assertThat(System.getenv("FOOBAR_ENV")).isNull();

        injectEnvironmentVariable("FOOBAR_ENV", "Foo");

        assertThat(System.getenv("FOOBAR_ENV")).isEqualTo("Foo");
    }
}