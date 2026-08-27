package com.deliveryhero.customerchat.commons;

/* JADX INFO: loaded from: classes2.dex */
public final class UserChangedDuringChatOpenException extends IllegalStateException {
    public UserChangedDuringChatOpenException() {
        super("Cannot register the user when the chat is open");
    }
}
