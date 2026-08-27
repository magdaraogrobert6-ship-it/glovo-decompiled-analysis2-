package com.deliveryhero.selfServiceChat.data.chat.url.datastore;

/* JADX INFO: loaded from: classes2.dex */
public final class LocaleChangedException extends UnsupportedOperationException {
    public static final LocaleChangedException write = new LocaleChangedException("Locale value changed. The cached Chat URL is invalid");

    public LocaleChangedException(String str) {
        super(str);
    }
}
