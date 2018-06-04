package com.gupao.validation.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *前缀必须以 "GUPAO-"  开头，后缀必须是数字，需要通过 BeanValidator 来校验


 */
//校验卡号
@Target(FIELD)
@Retention(RUNTIME)
@Documented
@Constraint( validatedBy = {ValidCardNumberConstraintValidator.class  } )
public @interface ValidCardNumber {

    String message() default "{com.gupao.springboot.bean.validation.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
