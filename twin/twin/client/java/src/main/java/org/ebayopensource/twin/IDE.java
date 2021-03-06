// [Twin] Copyright eBay Inc., Twin authors, and other contributors.
// This file is provided to you under the terms of the Apache License, Version 2.0.
// See LICENSE.txt and NOTICE.txt for license and copyright information.

package org.ebayopensource.twin;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
/**
 * Indicates that this method should be exposed in the IDE
 */
public @interface IDE {
	String name() default "";
	boolean attribute() default false;
}
