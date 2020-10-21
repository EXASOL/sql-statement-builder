package com.exasol.sql.expression.function.exasol;

import java.util.List;

import com.exasol.datatype.type.DataType;
import com.exasol.sql.expression.ValueExpression;
import com.exasol.sql.expression.ValueExpressionVisitor;
import com.exasol.sql.expression.function.AbstractFunction;

/**
 * This class represents the Exasol CAST function.
 */
public class ExasolCastFunction extends AbstractFunction {
    private static final String CAST_FUNCTION_NAME = "CAST";
    private final DataType type;

    private ExasolCastFunction(final ValueExpression value, final DataType type) {
        super(CAST_FUNCTION_NAME, List.of(value));
        this.type = type;
    }

    /**
     * Create a new {@link ExasolCastFunction} instance.
     *
     * @param valueExpression value to cast
     * @param type            type to cast the value to
     * @return new {@link ExasolCastFunction}
     */
    public static ExasolCastFunction of(final ValueExpression valueExpression, final DataType type) {
        return new ExasolCastFunction(valueExpression, type);
    }

    /**
     * Get the value to cast.
     * 
     * @return value to cast
     */
    public ValueExpression getValue() {
        return this.valueExpressions.get(0);
    }

    /**
     * Get the type to cast the value to.
     * 
     * @return type to cast the value to
     */
    public DataType getType() {
        return this.type;
    }

    @Override
    public boolean hasParenthesis() {
        return true;
    }

    @Override
    public void accept(final ValueExpressionVisitor visitor) {
        visitor.visit(this);
    }
}