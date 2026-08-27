package com.deliveryhero.customerchat.commons;

/* JADX INFO: loaded from: classes2.dex */
public final class UserNotRegisteredException extends IllegalStateException {
    public UserNotRegisteredException() {
        super("Call setConfiguration before accessing SDK methods.");
    }
}
