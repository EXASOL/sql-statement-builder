package com.exasol.sql.expression.literal;

/**
 * This class represents integer literals.
 */
// [impl->dsn~literal-values~2]
public final class IntegerLiteral extends AbstractLiteral {
    private final int value;

    private IntegerLiteral(final int value) {
        this.value = value;
    }

    /**
     * Create a new {@link IntegerLiteral} from an integer.
     *
     * @param value content
     * @return new {@link IntegerLiteral}
     */
    public static IntegerLiteral of(final int value) {
        return new IntegerLiteral(value);
    }

    /**
     * Get the value of the {@link IntegerLiteral}.
     *
     * @return integer value
     */
    public int getValue() {
        return this.value;
    }

    @Override
    public void accept(final LiteralVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }
}