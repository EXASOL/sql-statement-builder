package com.exasol.sql.ddl;

import com.exasol.datatype.Boolean;
import com.exasol.datatype.Char;
import com.exasol.datatype.Date;
import com.exasol.datatype.Varchar;
import com.exasol.sql.AbstractFragment;
import com.exasol.sql.SqlStatement;
import com.exasol.sql.Table;

public class CreateTable extends AbstractFragment implements SqlStatement, CreateTableFragment {
    private ColumnsDefinition columnsDefinition;
    private final Table table;

    public CreateTable(final String tableName) {
        super(null);
        this.table = new Table(this, tableName);
    }

    public String getTableName() {
        return this.table.getName();
    }

    public CreateTable booleanColumn(final String columnName) {
        checkIfCreateTableColumnsExists();
        this.columnsDefinition.add(columnName, Boolean.bool());
        return this;
    }

    public CreateTable charColumn(final String columnName, final int size) {
        checkIfCreateTableColumnsExists();
        this.columnsDefinition.add(columnName, new Char(this, size));
        return this;
    }

    public CreateTable varcharColumn(final String columnName, final int size) {
        checkIfCreateTableColumnsExists();
        this.columnsDefinition.add(columnName, new Varchar(this, size));
        return this;
    }

    public CreateTable dateColumn(final String columnName) {
        checkIfCreateTableColumnsExists();
        this.columnsDefinition.add(columnName, Date.date());
        return this;
    }

    public ColumnsDefinition getColumns() {
        return this.columnsDefinition;
    }

    @Override
    public void accept(final CreateTableVisitor visitor) {
        visitor.visit(this);
        this.table.accept(visitor);
        if (this.columnsDefinition != null) {
            this.columnsDefinition.accept(visitor);
        }
    }

    private void checkIfCreateTableColumnsExists() {
        if (this.columnsDefinition == null) {
            this.columnsDefinition = new ColumnsDefinition(this);
        }
    }
}
