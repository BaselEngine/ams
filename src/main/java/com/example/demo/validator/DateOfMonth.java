package com.example.demo.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateOfMonthValidator.class)
public @interface DateOfMonth {
    String message() default "開始日と終了日の月が異なっています";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default{};
	String[] fields();

	  public @interface List {
	    DateOfMonth[] value();
	  }

}
