package io.sentry.util.network;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class write {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[io.sentry.vendor.gson.stream.IconCompatParcelizer.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[io.sentry.vendor.gson.stream.IconCompatParcelizer.BEGIN_OBJECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[io.sentry.vendor.gson.stream.IconCompatParcelizer.BEGIN_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            RemoteActionCompatParcelizer[io.sentry.vendor.gson.stream.IconCompatParcelizer.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            RemoteActionCompatParcelizer[io.sentry.vendor.gson.stream.IconCompatParcelizer.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            RemoteActionCompatParcelizer[io.sentry.vendor.gson.stream.IconCompatParcelizer.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            RemoteActionCompatParcelizer[io.sentry.vendor.gson.stream.IconCompatParcelizer.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
