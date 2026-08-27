package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r7 implements getShortEdge {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final DraggableNode serializer;

    public r7(DraggableNode draggableNode) {
        this.serializer = draggableNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        if (r12 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r12 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        return r3.IconCompatParcelizer(r12.serializer());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(bo.app.ff$$ExternalSyntheticOutline0.m("Request ", r2, " is not blocked"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        return null;
     */
    @Override // o.getShortEdge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o._get_messageWebView_lambda1 intercept(o.getMessageHeaderTextView r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.r7.IconCompatParcelizer
            int r1 = r1 + 11
            int r2 = r1 % 128
            o.r7.write = r2
            int r1 = r1 % r0
            o.InAppMessageModalView r12 = (o.InAppMessageModalView) r12
            o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r1 = r12.MediaDescriptionCompat
            o.setInAppMessageImageViewAttributes r2 = r1.url
            java.util.ArrayList r3 = r2.pathSegments
            java.lang.String r4 = "/"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            java.lang.String r2 = o.onContentCardDismissed.IconCompatParcelizer(r3, r4, r5, r6, r7, r8)
            o.DraggableNode r3 = r11.serializer
            java.util.LinkedHashMap r4 = r3.serializer
            boolean r5 = r4.containsKey(r2)
            if (r5 == 0) goto L8c
            java.lang.Object r5 = o.onMove.read(r4, r2)
            o.qc r5 = (o.qc) r5
            long r5 = r5.write()
            org.joda.time.DateTime r7 = new org.joda.time.DateTime
            r7.<init>()
            long r7 = r7.getMillis()
            r9 = 10000(0x2710, double:4.9407E-320)
            long r5 = r5 + r9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 0
            if (r5 <= 0) goto L46
            r5 = 1
            goto L50
        L46:
            int r5 = o.r7.write
            int r5 = r5 + 73
            int r7 = r5 % 128
            o.r7.IconCompatParcelizer = r7
            int r5 = r5 % r0
            r5 = r6
        L50:
            if (r5 != 0) goto L55
            r4.remove(r2)
        L55:
            if (r5 == 0) goto L8c
            int r12 = o.r7.IconCompatParcelizer
            int r12 = r12 + 71
            int r1 = r12 % 128
            o.r7.write = r1
            int r12 = r12 % r0
            if (r12 == 0) goto L6e
            java.lang.Object r12 = r4.get(r2)
            o.qc r12 = (o.qc) r12
            r0 = 62
            int r0 = r0 / r6
            if (r12 == 0) goto L7f
            goto L76
        L6e:
            java.lang.Object r12 = r4.get(r2)
            o.qc r12 = (o.qc) r12
            if (r12 == 0) goto L7f
        L76:
            o._get_messageWebView_lambda1 r12 = r12.serializer()
            o._get_messageWebView_lambda1 r12 = r3.IconCompatParcelizer(r12)
            return r12
        L7f:
            java.lang.String r12 = "Request "
            java.lang.String r0 = " is not blocked"
            java.lang.String r12 = bo.app.ff$$ExternalSyntheticOutline0.m(r12, r2, r0)
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r12)
            r12 = 0
            return r12
        L8c:
            o._get_messageWebView_lambda1 r12 = r12.write(r1)
            int r0 = r12.code
            r1 = 503(0x1f7, float:7.05E-43)
            if (r0 != r1) goto Lab
            org.joda.time.DateTime r0 = new org.joda.time.DateTime
            r0.<init>()
            long r0 = r0.getMillis()
            o._get_messageWebView_lambda1 r3 = r3.IconCompatParcelizer(r12)
            o.qc r5 = new o.qc
            r5.<init>(r0, r3)
            r4.put(r2, r5)
        Lab:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r7.intercept(o.getMessageHeaderTextView):o._get_messageWebView_lambda1");
    }
}
