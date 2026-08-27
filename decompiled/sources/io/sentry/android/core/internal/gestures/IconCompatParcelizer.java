package io.sentry.android.core.internal.gestures;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class IconCompatParcelizer {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[RemoteActionCompatParcelizer.values().length];
        write = iArr;
        try {
            iArr[RemoteActionCompatParcelizer.Click.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[RemoteActionCompatParcelizer.Scroll.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[RemoteActionCompatParcelizer.Swipe.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[RemoteActionCompatParcelizer.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
