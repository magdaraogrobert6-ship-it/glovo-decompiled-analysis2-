package com.google.re2j;

import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public class PatternSyntaxException extends RuntimeException {
    public PatternSyntaxException(String str, String str2) {
        super(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("error parsing regexp: ", str, ": `", str2, "`"));
    }

    public PatternSyntaxException(String str) {
        super(str);
    }
}
