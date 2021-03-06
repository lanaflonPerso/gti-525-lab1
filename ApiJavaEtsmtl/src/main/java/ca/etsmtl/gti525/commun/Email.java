package ca.etsmtl.gti525.commun;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author REDOUANE
 */
@Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {})
public @interface Email {
    
  @Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(value = RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {

        public Email[] value();
    }

    public String message() default "{javax.validation.constraints.NotNull.message}";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};    
    
    
}
