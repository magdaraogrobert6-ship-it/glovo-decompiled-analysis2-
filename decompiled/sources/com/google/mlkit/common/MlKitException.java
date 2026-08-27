package com.google.mlkit.common;

import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public class MlKitException extends Exception {
    public final int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i) {
        super(str);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str, "Provided message must not be empty.");
        this.read = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i, Exception exc) {
        super(str, exc);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str, "Provided message must not be empty.");
        this.read = i;
    }
}
