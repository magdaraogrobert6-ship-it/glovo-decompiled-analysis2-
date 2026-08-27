package com.roadrunner.logger.logger.sentry;

import androidx.compose.ui.graphics.Fields;
import o.SuspendingTransactionWithReturn;
import o.getColorIntegerOrNulllambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryEventLogger_Factory implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final SentryEventLogger_Factory write = new SentryEventLogger_Factory(0);
    public final /* synthetic */ int serializer;

    public /* synthetic */ SentryEventLogger_Factory(int i) {
        this.serializer = i;
    }

    static {
        int i = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 41;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.serializer == 0) {
            return new SuspendingTransactionWithReturn();
        }
        SentryAppInfoChangedListener sentryAppInfoChangedListener = new SentryAppInfoChangedListener();
        int i3 = MediaMetadataCompat + 19;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return sentryAppInfoChangedListener;
        }
        obj.hashCode();
        throw null;
    }
}
