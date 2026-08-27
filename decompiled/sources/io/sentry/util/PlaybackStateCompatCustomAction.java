package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PlaybackStateCompatCustomAction {
    public static final boolean read;
    public static final boolean serializer;

    static {
        try {
            serializer = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            serializer = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                read = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                read = false;
            }
        } catch (Throwable unused2) {
            read = false;
        }
    }
}
