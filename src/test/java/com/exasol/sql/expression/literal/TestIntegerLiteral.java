package com.exasol.sql.expression.literal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

// [utest->dsn~literal-values~2]
class TestIntegerLiteral {
    @Test
    void testGetValue() {
        assertThat(IntegerLiteral.of(10).getValue(), equalTo(10));
    }

    @Test
    void testGetToString() {
        assertThat(IntegerLiteral.of(10).toString(), equalTo("10"));
    }
}