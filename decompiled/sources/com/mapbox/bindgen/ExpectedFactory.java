package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpectedFactory {
    private ExpectedFactory() {
    }

    public static <E, V> Expected<E, V> createError(E e) {
        return new Expected<>(e, null);
    }

    public static <E> Expected<E, None> createNone() {
        return new Expected<>(null, None.getInstance());
    }

    public static <E, V> Expected<E, V> createValue(V v) {
        return new Expected<>(null, v);
    }
}
