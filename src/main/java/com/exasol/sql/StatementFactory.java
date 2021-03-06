package com.exasol.sql;

import com.exasol.sql.ddl.create.CreateSchema;
import com.exasol.sql.ddl.create.CreateTable;
import com.exasol.sql.ddl.drop.DropSchema;
import com.exasol.sql.ddl.drop.DropTable;
import com.exasol.sql.dml.insert.Insert;
import com.exasol.sql.dml.merge.Merge;
import com.exasol.sql.dql.select.Select;

/**
 * The {@link StatementFactory} implements an factory for SQL statements.
 */
public final class StatementFactory {
    private static StatementFactory instance;

    /**
     * Get an instance of a {@link StatementFactory}.
     *
     * @return the existing instance otherwise creates one.
     */
    public static synchronized StatementFactory getInstance() {
        if (instance == null) {
            instance = new StatementFactory();
        }
        return instance;
    }

    private StatementFactory() {
        // prevent instantiation outside singleton
    }

    /**
     * Create a {@link Select} statement.
     *
     * @return a new instance of a {@link Select} statement
     */
    public Select select() {
        return new Select();
    }

    /**
     * Create an {@link Insert} statement.
     *
     * @param tableName name of the table into which to insert the data
     * @return a new instance of a {@link Insert} statement
     */
    public Insert insertInto(final String tableName) {
        return new Insert(tableName);
    }

    /**
     * Create a {@link Merge} statement.
     *
     * @param destinationTable table into which data is merged
     * @return a new instance of a {@link Merge} statement
     */
    public Merge mergeInto(final String destinationTable) {
        return new Merge(destinationTable);
    }

    /**
     * Create a {@link Merge} statement.
     *
     * @param destinationTable table into which data is merged
     * @param as table alias
     * @return a new instance of a {@link Merge} statement
     */
    public Merge mergeInto(final String destinationTable, final String as) {
        return new Merge(destinationTable, as);
    }

    /**
     * Create a {@link CreateTable} statement.
     *
     * @param tableName name of the table to create
     * @return a new instance of a {@link CreateTable} statement
     */
    public CreateTable createTable(final String tableName) {
        return new CreateTable(tableName);
    }

    /**
     * Create a {@link CreateSchema} statement.
     *
     * @param schemaName name of the schema to create
     * @return a new instance of a {@link CreateSchema} statement
     */
    public CreateSchema createSchema(final String schemaName) {
        return new CreateSchema(schemaName);
    }

    /**
     * Create a {@link DropTable} statement.
     *
     * @param tableName name of the table to drop
     * @return a new instance of a {@link DropTable} statement
     */
    public DropTable dropTable(final String tableName) {
        return new DropTable(tableName);
    }

    /**
     * Create a {@link DropSchema} statement.
     *
     * @param schemaName name of the schema to drop
     * @return a new instance of a {@link DropSchema} statement
     */
    public DropSchema dropSchema(final String schemaName) {
        return new DropSchema(schemaName);
    }
}