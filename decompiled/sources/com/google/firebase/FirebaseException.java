package com.google.firebase;

import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th) {
        super(str, th);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str, "Detail message must not be empty");
    }
}
