package Annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD,ElementType.LOCAL_VARIABLE})
public @interface MyAnnotation {
    String name = "";
    int age() default -1;
    String[] value() default "";
}
