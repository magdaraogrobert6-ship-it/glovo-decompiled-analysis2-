package com.data.util.exception;

/* JADX INFO: loaded from: classes2.dex */
public final class FoodoraNullException extends Exception {
    public FoodoraNullException() {
        super("CONFIG_SHARED_PREFS_LAST_LOGIN_EMAIL".concat(" == null"));
    }
}
