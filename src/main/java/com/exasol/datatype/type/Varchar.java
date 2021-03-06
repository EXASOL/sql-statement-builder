package com.exasol.datatype.type;

import com.exasol.sql.ColumnDefinitionVisitor;

/**
 * This class implements the Exasol-proprietary data type varchar
 */
@java.lang.SuppressWarnings("common-java:DuplicatedBlocks")
public class Varchar extends AbstractStringDataType<Varchar> {
    private static final String NAME = "VARCHAR";
    private static final int MAX_LENGTH = 2000000;

    /**
     * Create a new instance of an {@link Varchar} data type
     *
     * @param length pre-defined length for stored strings
     */
    public Varchar(final int length) {
        super(length, MAX_LENGTH, NAME);
    }

    @Override
    public void accept(final ColumnDefinitionVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    protected Varchar self() {
        return this;
    }
}
