package com.roadrunner.secure.preferences;

/* JADX INFO: loaded from: classes3.dex */
public final class SecureSharedPreferencesException extends RuntimeException {
    public SecureSharedPreferencesException(Exception exc) {
        super("Failed to create shared preferences", exc);
    }
}
