package com.sentiance.sdk.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract boolean IconCompatParcelizer();

    public abstract T RemoteActionCompatParcelizer();

    public abstract boolean read();

    public abstract T write();

    public static <T> Optional<T> RemoteActionCompatParcelizer(T t) {
        return new Present(t);
    }

    public static <T> Optional<T> write(T t) {
        return t == null ? Absent.serializer() : new Present(t);
    }

    public static <T> Optional<T> MediaSessionCompatQueueItem() {
        return Absent.serializer();
    }
}
