/*
 * This file is generated by jOOQ.
 */
package io.dsub.opendiscogs.jooq.routines;


import io.dsub.opendiscogs.jooq.Public;
import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * @deprecated Unknown data type. If this is a qualified, user-defined type, it may have been
 * excluded from code generation. If this is a built-in type, you can define an explicit
 * {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned
 * off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@Deprecated
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class GtrgmDecompress extends AbstractRoutine<Object> {

  /**
   * @deprecated Unknown data type. If this is a qualified, user-defined type, it may have been
   * excluded from code generation. If this is a built-in type, you can define an explicit
   * {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned
   * off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
   */
  @Deprecated
  public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE",
      org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false,
      false);
  /**
   * @deprecated Unknown data type. If this is a qualified, user-defined type, it may have been
   * excluded from code generation. If this is a built-in type, you can define an explicit
   * {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned
   * off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
   */
  @Deprecated
  public static final Parameter<Object> _1 = Internal.createParameter("_1",
      org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);
  private static final long serialVersionUID = 1L;

  /**
   * Create a new routine call instance
   */
  public GtrgmDecompress() {
    super("gtrgm_decompress", Public.PUBLIC,
        org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""));

    setReturnParameter(RETURN_VALUE);
    addInParameter(_1);
  }

  /**
   * Set the <code>_1</code> parameter IN value to the routine
   */
  public void set__1(Object value) {
    setValue(_1, value);
  }

  /**
   * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select}
   * statement
   */
  public GtrgmDecompress set__1(Field<Object> field) {
    setField(_1, field);
    return this;
  }
}
