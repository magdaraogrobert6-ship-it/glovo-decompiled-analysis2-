package com.sentiance.sdk.util;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes3.dex */
final class Absent<T> extends Optional<T> {
    private static final Absent<Object> IconCompatParcelizer = new Absent<>();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return IconCompatParcelizer;
    }

    public static <T> Optional<T> serializer() {
        return IconCompatParcelizer;
    }

    @Override // com.sentiance.sdk.util.Optional
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // com.sentiance.sdk.util.Optional
    public final T RemoteActionCompatParcelizer() {
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 1502476572;
    }

    @Override // com.sentiance.sdk.util.Optional
    public final boolean read() {
        return true;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.sentiance.sdk.util.Optional
    @SuppressLint
    public final T write() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
