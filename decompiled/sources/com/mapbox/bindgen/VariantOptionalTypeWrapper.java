package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes5.dex */
public class VariantOptionalTypeWrapper {
    private final Object value;

    public Object getValue() {
        return this.value;
    }

    public static VariantOptionalTypeWrapper valueOf(Object obj) {
        return new VariantOptionalTypeWrapper(obj);
    }

    public VariantOptionalTypeWrapper(Object obj) {
        this.value = obj;
    }
}
