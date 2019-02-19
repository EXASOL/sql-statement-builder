package com.exasol.sql.expression;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class TestStringLiteral {
    @Test
    void testGetToString() {
        assertThat(StringLiteral.of("foo").toString(), equalTo("foo"));
    }
}