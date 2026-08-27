package io.sentry.android.replay;

import o.dismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[dismisslambda0.values().length];
        try {
            iArr[dismisslambda0.CANVAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dismisslambda0.PIXEL_COPY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
