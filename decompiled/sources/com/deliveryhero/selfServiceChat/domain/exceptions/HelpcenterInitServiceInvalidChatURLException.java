package com.deliveryhero.selfServiceChat.domain.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public final class HelpcenterInitServiceInvalidChatURLException extends IllegalStateException {
    public static final HelpcenterInitServiceInvalidChatURLException IconCompatParcelizer = new HelpcenterInitServiceInvalidChatURLException("Helpcenter Init endpoint returned invalid Chat URL. Please try again.");

    public HelpcenterInitServiceInvalidChatURLException(String str) {
        super(str);
    }
}
