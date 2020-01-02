## Java environment variable handler

### Library to use in junit tests

```java
    @Test
    void whenInjectEnvironmentVariableThenCheckValue() throws Exception {
        assertThat(System.getenv("FOOBAR_ENV")).isNull();

        injectEnvironmentVariable("FOOBAR_ENV", "Foo");

        assertThat(System.getenv("FOOBAR_ENV")).isEqualTo("Foo");
    }
```