package com.exasol.sql.expression;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class ColumnReferenceTest {
    @Test
    void getColumnName() {
        assertThat(ColumnReference.column("table", "column").getColumnName(), equalTo("column"));
    }

    @Test
    void getTableName() {
        assertThat(ColumnReference.column("table", "column").getTableName(), equalTo("table"));
    }
}