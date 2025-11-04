package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The value represents a bit pattern and is not to be interpreted numerically. Bit patterns are
 * used to store and manipulate binary data without numerical semantics.
 *
 * <p>This annotation is appropriate for values that are:
 *
 * <ul>
 *   <li>Results of bit-twiddling operations on floating-point values, such as {@code
 *       Double.doubleToLongBits} and {@code Float.floatToIntBits}
 *   <li>Intermediate values in bit manipulation algorithms
 *   <li>Masks and bit patterns used for bitwise operations
 * </ul>
 *
 * <p>Values annotated with {@code @BitPattern} support:
 *
 * <ul>
 *   <li>Bitwise operations: {@code &}, {@code |}, {@code ~}, {@code ^}
 *   <li>Shift operations: {@code <<}, {@code >>}, {@code >>>}
 *   <li>Conversion to/from floating-point bit representations
 * </ul>
 *
 * <p>Values annotated with {@code @BitPattern} do not support:
 *
 * <ul>
 *   <li>Arithmetic operations: {@code +}, {@code -}, {@code *}, {@code /}, {@code %}
 *   <li>Comparison operations: {@code <}, {@code <=}, {@code >}, {@code >=}
 *   <li>Unary operations: {@code ++}, {@code --}, unary {@code +}, unary {@code -}
 *   <li>Compound assignments: {@code +=}, {@code -=}, {@code *=}, {@code /=}, {@code %=}
 *   <li>String concatenation with {@code +}
 * </ul>
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownSignedness.class})
public @interface BitPattern {}
