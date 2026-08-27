package com.deliveryhero.selfServiceChat.data.chat.url.datastore;

/* JADX INFO: loaded from: classes2.dex */
public final class VerificationTokenChangedException extends UnsupportedOperationException {
    public static final VerificationTokenChangedException IconCompatParcelizer = new VerificationTokenChangedException("Verification token changed. The cached Chat URL is invalid");

    public VerificationTokenChangedException(String str) {
        super(str);
    }
}
