package com.exasol.sql.ddl;

import com.exasol.datatype.Boolean;
import com.exasol.datatype.Char;
import com.exasol.datatype.Date;
import com.exasol.sql.Column;
import com.exasol.sql.FragmentVisitor;

public interface CreateTableVisitor extends FragmentVisitor {
    public void visit(final CreateTable createTable);

    public void visit(final Column column);

    public void visit(final CreateTableColumns createTableColumns);

    public void leave(final CreateTableColumns createTableColumns);

    public void visit(final Char charColumn);

    public void visit(final Boolean booleanColumn);

    public void visit(final Date dateColumn);
}
