package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes2.dex */
public final class RecordUtils {
    private RecordUtils() {
    }

    public static String fieldToString(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof byte[]) {
            return new String((byte[]) obj);
        }
        return obj.toString();
    }
}
