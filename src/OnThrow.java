/*
 * Copyright (c) 2008, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the Classpath exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
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

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class OnThrow {

    @TLS
    static Throwable currentException;

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow(@Self Throwable self) {
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow1(@Self Throwable self, String s) {
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow1(@Self Throwable self, String s, Throwable cause) {
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow2(@Self Throwable self, Throwable cause) {
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>",
            location = @Location(Kind.RETURN)
    )
    public static void onThrownReturn() {
        if (currentException != null) {
            Threads.jstack(currentException);
            println("<--------------->");
            currentException = null;
        }
    }
}
