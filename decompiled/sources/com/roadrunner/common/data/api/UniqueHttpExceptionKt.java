package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import o.getCieXyz;
import o.getHoldoutVariationName;
import o.getInAppMessageEventMap;
import o.removeNodeAtDepth;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UniqueHttpExceptionKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    public static final getInAppMessageEventMap serializer = new getInAppMessageEventMap("/([^v])\\w*\\d+\\w*(-*\\w)*\\b");
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final UniqueHttpException write(HttpException httpException) {
        int i = 2 % 2;
        httpException.getClass();
        getHoldoutVariationName getholdoutvariationname = httpException.write;
        getholdoutvariationname.getClass();
        int i2 = httpException.read;
        StackTraceElement[] stackTrace = httpException.getStackTrace();
        stackTrace.getClass();
        UniqueHttpException uniqueHttpException = new UniqueHttpException(getholdoutvariationname, i2, stackTrace);
        int i3 = read + 121;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return uniqueHttpException;
    }

    public static final HttpException RemoteActionCompatParcelizer(Throwable th) {
        Throwable cause;
        int i = 2 % 2;
        th.getClass();
        if (th instanceof HttpException) {
            int i2 = write;
            int i3 = i2 + 35;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            HttpException httpException = (HttpException) th;
            int i5 = i2 + 29;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return httpException;
        }
        while (true) {
            if ((th != null ? th.getCause() : null) == null) {
                break;
            }
            int i7 = write + 73;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{th.getCause(), th}, getCieXyz.write())).booleanValue();
                throw null;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{th.getCause(), th}, getCieXyz.write())).booleanValue() || (th.getCause() instanceof HttpException)) {
                break;
            }
            int i8 = write + 65;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            th = th.getCause();
        }
        if (th != null) {
            cause = th.getCause();
        } else {
            int i10 = write + 13;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            cause = null;
        }
        if (!(cause instanceof HttpException)) {
            return null;
        }
        int i12 = read + 47;
        write = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return (HttpException) cause;
    }
}
