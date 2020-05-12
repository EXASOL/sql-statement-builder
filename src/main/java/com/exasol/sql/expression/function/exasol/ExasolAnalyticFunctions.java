package com.exasol.sql.expression.function.exasol;

import com.exasol.sql.expression.function.FunctionName;

/**
 * This class is a list of Analytic Functions that Exasol database supports. This class covers functions that are not in
 * the {@link ExasolAggregateFunction} list.
 *
 * Currently unsupported functions: CUME_DIST, DENSE_RANK, LEAD, NTH_VALUE, NTILE, NAMED WINDOW CLAUSE, PERCENT_RANK,
 * PERCENTILE_CONT, PERCENTILE_DISC, RANK, RATIO_TO_REPORT, ROW_NUMBER, OVER clause for all analytic functions,
 * functions' prefixes that goes after parenthesis.
 */
public enum ExasolAnalyticFunctions implements FunctionName {
    ANY, EVERY, LAG, LISTAGG
}