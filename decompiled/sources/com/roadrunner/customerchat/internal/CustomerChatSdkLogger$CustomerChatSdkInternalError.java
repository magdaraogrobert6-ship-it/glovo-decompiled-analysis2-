package com.roadrunner.customerchat.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatSdkLogger$CustomerChatSdkInternalError extends Exception {
    public CustomerChatSdkLogger$CustomerChatSdkInternalError(String str, Throwable th) {
        super("Internal error in customer chat. Event: ".concat(str), th);
    }
}
