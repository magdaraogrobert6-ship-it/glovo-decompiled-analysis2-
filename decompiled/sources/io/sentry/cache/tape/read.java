package io.sentry.cache.tape;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class read implements Iterable, Closeable {
    public abstract void IconCompatParcelizer(Object obj);

    public abstract int read();

    public abstract void write(int i);

    public void write() {
        write(read());
    }
}
