/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.routines;


import io.dsub.opendiscogs.jooq.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StrictWordSimilarity extends AbstractRoutine<Float> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>public.strict_word_similarity.RETURN_VALUE</code>.
     */
    public static final Parameter<Float> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.REAL, false, false);

    /**
     * The parameter <code>public.strict_word_similarity._1</code>.
     */
    public static final Parameter<String> _1 = Internal.createParameter("_1", SQLDataType.CLOB, false, true);

    /**
     * The parameter <code>public.strict_word_similarity._2</code>.
     */
    public static final Parameter<String> _2 = Internal.createParameter("_2", SQLDataType.CLOB, false, true);

    /**
     * Create a new routine call instance
     */
    public StrictWordSimilarity() {
        super("strict_word_similarity", Public.PUBLIC, SQLDataType.REAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public StrictWordSimilarity set__1(Field<String> field) {
        setField(_1, field);
        return this;
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(String value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public StrictWordSimilarity set__2(Field<String> field) {
        setField(_2, field);
        return this;
    }
}
