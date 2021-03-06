package com.exasol.datatype.type;

import com.exasol.sql.ColumnDefinitionVisitor;

/**
 * This class implements the SQL data type char
 */
@java.lang.SuppressWarnings("common-java:DuplicatedBlocks")
public class Char extends AbstractStringDataType<Char> {
    private static final String NAME = "CHAR";
    private static final int MAX_LENGTH = 2000;

    /**
     * Create a new instance of an {@link Char} data type
     *
     * @param length pre-defined length for stored strings
     */
    public Char(final int length) {
        super(length, MAX_LENGTH, NAME);
    }

    @Override
    public void accept(final ColumnDefinitionVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    protected Char self() {
        return this;
    }
}