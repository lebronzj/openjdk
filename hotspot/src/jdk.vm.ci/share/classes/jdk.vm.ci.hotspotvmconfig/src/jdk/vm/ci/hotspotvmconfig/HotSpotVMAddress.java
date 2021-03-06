/*
 * Copyright (c) 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package jdk.vm.ci.hotspotvmconfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Refers to a C++ address in the VM.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface HotSpotVMAddress {

    /**
     * Returns the name of the symbol this address is referring to.
     *
     * @return name of symbol of this address
     */
    String name();

    /**
     * List of architectures where this constant is required. Names are derived from
     * {@link HotSpotVMConfig#getHostArchitectureName()}. An empty list implies that the constant is
     * required on all architectures.
     */
    @SuppressWarnings("javadoc")
    String[] archs() default {};

    /**
     * List of operating systems where this constant is required. Names are derived from
     * {@link HotSpotVMConfig#getHostOSName()}. An empty list implies that the constant is required
     * on all operating systems.
     */
    @SuppressWarnings("javadoc")
    String[] os() default {};

}
