package org.pentaho.di.core.annotations;

import java.lang.annotation.*;

@Documented
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.TYPE )
public @interface OverrideStep {
  String id();

  String name();

  String description() default "";
}
