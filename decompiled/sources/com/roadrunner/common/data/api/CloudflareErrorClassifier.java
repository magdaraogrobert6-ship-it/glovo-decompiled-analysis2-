package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.onViewAttachedToWindowlambda0;
import o.q6;

/* JADX INFO: loaded from: classes3.dex */
public final class CloudflareErrorClassifier {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final ensureSubscribedToInAppMessageEventslambda7 serializer = new ensureSubscribedToInAppMessageEventslambda7(520, 527, 1);
    private static int write;

    static {
        int i = IconCompatParcelizer + 103;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static onViewAttachedToWindowlambda0 read(Throwable th) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        q6 q6VarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(th);
        if (q6VarRemoteActionCompatParcelizer == null) {
            int i4 = RemoteActionCompatParcelizer + 61;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                q6 q6Var = q6.UNKNOWN;
                throw null;
            }
            q6VarRemoteActionCompatParcelizer = q6.UNKNOWN;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("error_origin", q6VarRemoteActionCompatParcelizer.getValue());
        int i5 = read + 45;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onviewattachedtowindowlambda0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (o._get_messageWebView_lambda1.RemoteActionCompatParcelizer(r4, "cf-mitigated") != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r4 = o.q6.CLOUDFLARE;
        r1 = com.roadrunner.common.data.api.CloudflareErrorClassifier.RemoteActionCompatParcelizer + 29;
        com.roadrunner.common.data.api.CloudflareErrorClassifier.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r0 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (o._get_messageWebView_lambda1.RemoteActionCompatParcelizer(r4, "cf-error-type") == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        return o.q6.CLOUDFLARE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r1 = com.roadrunner.common.data.api.CloudflareErrorClassifier.serializer;
        r2 = r1.write;
        r1 = r1.read;
        r3 = r4.code;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r2 > r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r3 > r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r3 != 530) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        return o.q6.CLOUDFLARE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (o._get_messageWebView_lambda1.RemoteActionCompatParcelizer(r4, "x-request-id") == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        r4 = com.roadrunner.common.data.api.CloudflareErrorClassifier.read + 21;
        com.roadrunner.common.data.api.CloudflareErrorClassifier.RemoteActionCompatParcelizer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if ((r4 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        r4 = o.q6.BACKEND;
        r2 = com.roadrunner.common.data.api.CloudflareErrorClassifier.RemoteActionCompatParcelizer + 19;
        com.roadrunner.common.data.api.CloudflareErrorClassifier.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if ((r2 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r4 = o.q6.BACKEND;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        return o.q6.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (o._get_messageWebView_lambda1.RemoteActionCompatParcelizer(r4, "cf-mitigated") != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.q6 RemoteActionCompatParcelizer(java.lang.Throwable r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r4.getClass()
            o.withTopLeftBottomRight r4 = kotlin.ranges.RangesKt.IconCompatParcelizer(r4)
            if (r4 == 0) goto L9b
            int r1 = com.roadrunner.common.data.api.CloudflareErrorClassifier.read
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.roadrunner.common.data.api.CloudflareErrorClassifier.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            retrofit2.HttpException r4 = r4.read
            o.getHoldoutVariationName r4 = r4.write
            if (r4 == 0) goto L98
            int r1 = com.roadrunner.common.data.api.CloudflareErrorClassifier.read
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.roadrunner.common.data.api.CloudflareErrorClassifier.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            java.lang.String r2 = "cf-mitigated"
            r3 = 0
            if (r1 != 0) goto L34
            o._get_messageWebView_lambda1 r4 = r4.rawResponse
            java.lang.String r1 = o._get_messageWebView_lambda1.RemoteActionCompatParcelizer(r4, r2)
            int r2 = r3 / r3
            if (r1 == 0) goto L4d
            goto L3c
        L34:
            o._get_messageWebView_lambda1 r4 = r4.rawResponse
            java.lang.String r1 = o._get_messageWebView_lambda1.RemoteActionCompatParcelizer(r4, r2)
            if (r1 == 0) goto L4d
        L3c:
            o.q6 r4 = o.q6.CLOUDFLARE
            int r1 = com.roadrunner.common.data.api.CloudflareErrorClassifier.RemoteActionCompatParcelizer
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.roadrunner.common.data.api.CloudflareErrorClassifier.read = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L4c
            r0 = 92
            int r0 = r0 / r3
        L4c:
            return r4
        L4d:
            java.lang.String r1 = "cf-error-type"
            java.lang.String r1 = o._get_messageWebView_lambda1.RemoteActionCompatParcelizer(r4, r1)
            if (r1 == 0) goto L58
            o.q6 r4 = o.q6.CLOUDFLARE
            return r4
        L58:
            o.ensureSubscribedToInAppMessageEventslambda7 r1 = com.roadrunner.common.data.api.CloudflareErrorClassifier.serializer
            int r2 = r1.write
            int r1 = r1.read
            int r3 = r4.code
            if (r2 > r3) goto L65
            if (r3 > r1) goto L65
            goto L69
        L65:
            r1 = 530(0x212, float:7.43E-43)
            if (r3 != r1) goto L6c
        L69:
            o.q6 r4 = o.q6.CLOUDFLARE
            return r4
        L6c:
            java.lang.String r1 = "x-request-id"
            java.lang.String r4 = o._get_messageWebView_lambda1.RemoteActionCompatParcelizer(r4, r1)
            if (r4 == 0) goto L95
            int r4 = com.roadrunner.common.data.api.CloudflareErrorClassifier.read
            int r4 = r4 + 21
            int r1 = r4 % 128
            com.roadrunner.common.data.api.CloudflareErrorClassifier.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r0
            r1 = 0
            if (r4 == 0) goto L8f
            o.q6 r4 = o.q6.BACKEND
            int r2 = com.roadrunner.common.data.api.CloudflareErrorClassifier.RemoteActionCompatParcelizer
            int r2 = r2 + 19
            int r3 = r2 % 128
            com.roadrunner.common.data.api.CloudflareErrorClassifier.read = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L8e
            return r4
        L8e:
            throw r1
        L8f:
            o.q6 r4 = o.q6.BACKEND
            r1.hashCode()
            throw r1
        L95:
            o.q6 r4 = o.q6.UNKNOWN
            return r4
        L98:
            o.q6 r4 = o.q6.UNKNOWN
            return r4
        L9b:
            o.q6 r4 = o.q6.UNKNOWN
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.common.data.api.CloudflareErrorClassifier.RemoteActionCompatParcelizer(java.lang.Throwable):o.q6");
    }
}
