package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {

    public enum serializer {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException() {
    }

    public FirebaseInstallationsException(String str) {
        super(str);
    }
}
