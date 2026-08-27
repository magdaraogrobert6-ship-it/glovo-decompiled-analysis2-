package com.sentiance.sdk.util;

/* JADX INFO: loaded from: classes4.dex */
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    @Override // com.sentiance.sdk.util.Optional
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // com.sentiance.sdk.util.Optional
    public final T RemoteActionCompatParcelizer() {
        return this.reference;
    }

    @Override // com.sentiance.sdk.util.Optional
    public final boolean read() {
        return false;
    }

    @Override // com.sentiance.sdk.util.Optional
    public final T write() {
        return this.reference;
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public Present(T t) {
        this.reference = t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    public final String toString() {
        return "Optional.of(" + this.reference + ")";
    }
}
