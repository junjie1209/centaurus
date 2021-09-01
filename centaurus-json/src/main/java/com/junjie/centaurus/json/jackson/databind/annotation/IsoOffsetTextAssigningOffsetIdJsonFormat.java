package com.junjie.centaurus.json.jackson.databind.annotation;

import java.lang.annotation.*;

@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IsoOffsetTextAssigningOffsetIdJsonFormat {

	public static final String DEFAULT_OFFSET_ID = "UTC";

	public static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

	String offsetId() default DEFAULT_OFFSET_ID;

	String pattern() default DEFAULT_PATTERN;

}
