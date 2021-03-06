package com.exasol.sql.dml.insert.rendering;

import com.exasol.sql.*;
import com.exasol.sql.dml.insert.InsertFields;
import com.exasol.sql.dml.insert.InsertVisitor;
import com.exasol.sql.rendering.AbstractFragmentRenderer;
import com.exasol.sql.rendering.StringRendererConfig;

/**
 * The {@link InsertRenderer} turns SQL statement structures in to SQL strings.
 */
// [impl->dsn~rendering.sql.insert~1]
public class InsertRenderer extends AbstractFragmentRenderer implements InsertVisitor {
    /**
     * Create a new {@link InsertRenderer} with custom render settings.
     *
     * @param config render configuration settings
     */
    public InsertRenderer(final StringRendererConfig config) {
        super(config);
    }

    @Override
    public void visit(final SqlStatement insert) {
        appendKeyWord("INSERT INTO ");
        setLastVisited(insert);
    }

    @Override
    public void visit(final Table table) {
        appendAutoQuoted(table.getName());
        setLastVisited(table);
    }

    @Override
    public void visit(final DerivedColumn derivedColumn){
        appendCommaWhenNeeded(derivedColumn);
        appendRenderedValueExpression(derivedColumn.getValueExpression());
        setLastVisited(derivedColumn);
    }

    @Override
    public void visit(final InsertFields insertFields) {
        append(" (");
        setLastVisited(insertFields);
    }

    @Override
    public void leave(final InsertFields insertFields) {
        append(")");
    }

    @Override
    public void visit(final ValueTable valueTable) {
        appendKeyWord(" VALUES ");
        setLastVisited(valueTable);
    }

    @Override
    public void leave(final ValueTable valueTable) {
        setLastVisited(valueTable);
    }

    @Override
    public void visit(final ValueTableRow valueTableRow) {
        appendCommaWhenNeeded(valueTableRow);
        append("(");
        appendValueTableRow(valueTableRow);
        setLastVisited(valueTableRow);
    }

    @Override
    public void leave(final ValueTableRow valueTableRow) {
        append(")");
        setLastVisited(valueTableRow);
    }

    /**
     * Create an {@link InsertRenderer} using the default renderer configuration
     *
     * @return insert renderer
     */
    public static InsertRenderer create() {
        return create(StringRendererConfig.createDefault());
    }

    /**
     * Create an {@link InsertRenderer}
     *
     * @param config renderer configuration
     * @return insert renderer
     */
    public static InsertRenderer create(final StringRendererConfig config) {
        return new InsertRenderer(config);
    }
}