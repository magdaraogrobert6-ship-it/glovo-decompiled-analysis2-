package com.roadrunner.customerchat.selfservice.domain.logging;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceChatLoggerImpl$CustomerChatInternalError extends Exception {
    public SelfServiceChatLoggerImpl$CustomerChatInternalError(String str, Throwable th) {
        super("Internal error in customer chat. Event: ".concat(str), th);
    }
}
