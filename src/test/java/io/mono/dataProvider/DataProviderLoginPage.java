package io.mono.dataProvider;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static io.mono.mono_e2e_tests.BaseTest.env;

public class DataProviderLoginPage {
    static Stream<Arguments> incorrectUserLogin(){
        return Stream.of(
                Arguments.of(env.get("USERNAME"),"!23eWQasdcxzzxcdsaQWE",
                        "The email and password you entered didn’t match our records. Please double check and try again"),
                Arguments.of(env.get("USERNAME"), "!23EWQasdcxzzxcdsaQW",
                        "The email and password you entered didn’t match our records. Please double check and try again"),
                Arguments.of("momo@momo.comd", env.get("PASSWORD"),
                        "The email and password you entered didn’t match our records. Please double check and try again"),
                Arguments.of("dsdsdc@sdcc.sd", env.get("PASSWORD"),
                        "The email and password you entered didn’t match our records. Please double check and try again")
        );
    }
}
