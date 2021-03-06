# List of Supported Exasol Functions

Here you can find a list of supported(or partly supported) functions for the Exasol database.

- [Scalar Functions](#scalar-functions)
- [Aggregate Functions](#aggregate-functions)
- [Analytic Functions](#analytic-functions)

## Scalar Functions
     
#### Numeric Functions

- ABS
- ACOS
- ASIN
- ATAN
- ATAN2
- CEIL
- COS
- COSH
- COT
- DEGREES
- DIV
- EXP
- FLOOR
- LN
- LOG
- LOG10
- LOG2
- MOD
- PI
- POWER
- RADIANS
- RANDOM
- ROUND
- SIGN
- SIN
- SINH
- SQRT
- TAN
- TANH
- TRUNC
 
#### String Functions
    
- ASCII
- BIT_LENGTH
- CHARACTER_LENGTH
- CHAR
- COLOGNE_PHONETIC
- CONCAT
- DUMP
- EDIT_DISTANCE
- INITCAP
- INSERT
- INSTR
- LCASE
- LEFT
- LENGTH
- LOCATE
- LOWER
- LPAD
- LTRIM
- MID
- OCTET_LENGTH
- REGEXP_INSTR
- REGEXP_REPLACE
- REGEXP_SUBSTR
- REPEAT
- REPLACE
- REVERSE
- RIGHT
- RPAD
- RTRIM
- SOUNDEX
- SUBSTR
- TRANSLATE
- TRIM
- UCASE
- UNICODE
- UNICODECHR
- UPPER

#### Date/Time Functions

- ADD_DAYS
- ADD_HOURS
- ADD_MINUTES
- ADD_MONTHS
- ADD_SECONDS
- ADD_WEEKS
- ADD_YEARS
- CONVERT_TZ
- CURRENT_DATE
- CURRENT_TIMESTAMP
- DAY
- DAYS_BETWEEN
- DBTIMEZONE
- FROM_POSIX_TIME
- HOUR
- HOURS_BETWEEN
- LOCALTIMESTAMP
- MINUTE
- MINUTES_BETWEEN
- MONTH
- MONTHS_BETWEEN
- NOW
- NUMTODSINTERVAL
- NUMTOYMINTERVAL
- POSIX_TIME
- SECOND
- SECONDS_BETWEEN
- SESSIONTIMEZONE
- SYSDATE
- SYSTIMESTAMP
- WEEK
- YEAR
- YEARS_BETWEEN

#### Geospatial Functions

- ST_AREA
- ST_BOUNDARY
- ST_BUFFER
- ST_CENTROID
- ST_CONTAINS
- ST_CONVEXHULL
- ST_CROSSES
- ST_DIFFERENCE
- ST_DIMENSION
- ST_DISJOINT
- ST_DISTANCE
- ST_ENDPOINT
- ST_ENVELOPE
- ST_EQUALS
- ST_EXTERIORRING
- ST_FORCE2D
- ST_GEOMETRYN
- ST_GEOMETRYTYPE
- ST_INTERIORRINGN
- ST_INTERSECTION
- ST_INTERSECTS
- ST_ISCLOSED
- ST_ISEMPTY
- ST_ISRING
- ST_ISSIMPLE
- ST_LENGTH
- ST_NUMGEOMETRIES
- ST_NUMINTERIORRINGS
- ST_NUMPOINTS
- ST_OVERLAPS
- ST_SETSRID
- ST_POINTN
- ST_STARTPOINT
- ST_SYMDIFFERENCE
- ST_TOUCHES
- ST_TRANSFORM
- ST_UNION
- ST_WITHIN
- ST_X
- ST_Y

#### Bitwise Function

- BIT_AND
- BIT_CHECK
- BIT_LROTATE
- BIT_LSHIFT
- BIT_NOT
- BIT_OR
- BIT_RROTATE
- BIT_RSHIFT
- BIT_SET
- BIT_TO_NUM
- BIT_XOR

#### Conversion Functions

- IS_NUMBER
- IS_DATE
- IS_TIMESTAMP
- IS_BOOLEAN
- IS_DSINTERVAL
- IS_YMINTERVAL
- TO_CHAR
- TO_DATE
- TO_DSINTERVAL
- TO_NUMBER
- TO_TIMESTAMP
- TO_YMINTERVAL

#### Other Scalar Functions

- COALESCE
- CURRENT_SCHEMA
- CURRENT_SESSION
- CURRENT_STATEMENT
- CURRENT_USER
- DECODE
- GREATEST
- HASH_MD5
- HASH_SHA
- HASH_SHA256
- HASH_SHA512
- HASH_TIGER
- IPROC
- LEAST
- NULLIF
- NULLIFZERO
- NPROC
- NVL
- NVL2
- ROWNUM
- ROWID
- SCOPE_USER
- SYS_GUID
- USER
- VALUE2PROC
- ZEROIFNULL

## Aggregate Functions

- APPROXIMATE_COUNT_DISTINCT
- AVG
- CORR
- COUNT
- COVAR_POP
- COVAR_SAMP
- FIRST_VALUE
- GROUP_CONCAT
- LAST_VALUE
- MAX
- MEDIAN
- MIN
- REGR_SLOPE
- REGR_INTERCEPT
- REGR_COUNT
- REGR_R2
- REGR_AVGX
- REGR_AVGY
- REGR_SXX
- REGR_SXY
- REGR_SYY
- STDDEV
- STDDEV_POP
- STDDEV_SAMP
- SUM
- VAR_POP
- VAR_SAMP
- VARIANCE

## Analytic Functions

- ANY
- EVERY
- LISTAGG