package com.roadrunner.customerchat.selfservice.domain.asset;

import androidx.compose.ui.graphics.Fields;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatAssetDownloadNonRecoverableException extends Exception {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChatAssetDownloadNonRecoverableException(String str, HttpException httpException, int i) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = serializer + 67;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = serializer + 19;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            httpException = null;
        }
        super(str, httpException);
    }

    public ChatAssetDownloadNonRecoverableException(String str, Throwable th) {
        super(str, th);
    }
}
