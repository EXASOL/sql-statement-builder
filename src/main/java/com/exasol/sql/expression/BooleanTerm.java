package com.exasol.sql.expression;

// [impl->dsn~boolean-operators~1]
public abstract class BooleanTerm extends AbstractBooleanExpression {
    private BooleanTerm() {
        super();
    }

    public static BooleanExpression not(final String string) {
        return new Not(string);
    }

    public static BooleanExpression not(final BooleanExpression expression) {
        return new Not(expression);
    }

    public static BooleanExpression and(final String... strings) {
        return new And(strings);
    }

    public static BooleanExpression and(final BooleanExpression expression, final String string) {
        return new And(expression, Literal.of(string));
    }

    public static BooleanExpression and(final String literal, final BooleanExpression expression) {
        return new And(Literal.of(literal), expression);
    }

    public static BooleanExpression and(final BooleanExpression... expressions) {
        return new And(expressions);
    }

    public static BooleanExpression or(final String... strings) {
        return new Or(strings);
    }

    public static BooleanExpression or(final BooleanExpression expression, final String string) {
        return new Or(expression, Literal.of(string));
    }

    public static BooleanExpression or(final String literal, final BooleanExpression expression) {
        return new Or(Literal.of(literal), expression);
    }

    public static BooleanExpression or(final BooleanExpression... expressions) {
        return new Or(expressions);
    }

    // [impl->dsn~boolean-operation.comparison.constructing-from-strings~1]
    public static BooleanExpression compare(final String left, final String operatorSymbol, final String right) {
        return new Comparison(ComparisonOperator.ofSymbol(operatorSymbol), Literal.of(left), Literal.of(right));
    }

    // [impl->dsn~boolean-operation.comparison.constructing-from-enum~1]
    public static BooleanExpression compare(final String left, final ComparisonOperator operator, final String right) {
        return new Comparison(operator, Literal.of(left), Literal.of(right));
    }

    // [impl->dsn~comparison-operations~1]
    public static BooleanExpression eq(final String left, final String right) {
        return new Comparison(ComparisonOperator.EQUAL, Literal.of(left), Literal.of(right));
    }

    // [impl->dsn~comparison-operations~1]
    public static BooleanExpression ne(final String left, final String right) {
        return new Comparison(ComparisonOperator.NOT_EQUAL, Literal.of(left), Literal.of(right));
    }

    // [impl->dsn~comparison-operations~1]
    public static BooleanExpression lt(final String left, final String right) {
        return new Comparison(ComparisonOperator.LESS_THAN, Literal.of(left), Literal.of(right));
    }

    // [impl->dsn~comparison-operations~1]
    public static BooleanExpression gt(final String left, final String right) {
        return new Comparison(ComparisonOperator.GREATER_THAN, Literal.of(left), Literal.of(right));
    }

    // [impl->dsn~comparison-operations~1]
    public static BooleanExpression le(final String left, final String right) {
        return new Comparison(ComparisonOperator.LESS_THAN_OR_EQUAL, Literal.of(left), Literal.of(right));
    }

    // [impl->dsn~comparison-operations~1]
    public static BooleanExpression ge(final String left, final String right) {
        return new Comparison(ComparisonOperator.GREATER_THAN_OR_EQUAL, Literal.of(left), Literal.of(right));
    }

    /**
     * Create a logical operation from an operator name and a list of operands
     *
     * @param operator name of the operator
     * @param expressions operands
     * @return instance of either {@link And}, {@link Or} or {@link Not}
     * @throws IllegalArgumentException if the operator is unknown or null
     */
    public static BooleanExpression operation(final String operator, final BooleanExpression... expressions)
            throws IllegalArgumentException {
        switch (operator.toLowerCase()) {
        case "and":
            return new And(expressions);
        case "or":
            return new Or(expressions);
        case "not":
            if (expressions.length == 1) {
                return new Not(expressions[0]);
            } else {
                throw new IllegalArgumentException(
                        "Logical \"not\" must have exactly one operand. Got " + expressions.length + ".");
            }
        default:
            throw new IllegalArgumentException(
                    "Unknown boolean connector \"" + operator + "\". Must be one of \"and\" or \"or\".");
        }
    }
}