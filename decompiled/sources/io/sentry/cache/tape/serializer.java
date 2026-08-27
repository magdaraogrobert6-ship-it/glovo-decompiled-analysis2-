package io.sentry.cache.tape;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer extends ByteArrayOutputStream {
    public final byte[] read() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
