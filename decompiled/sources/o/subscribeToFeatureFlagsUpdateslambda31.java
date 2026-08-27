package o;

import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToFeatureFlagsUpdateslambda31 implements subscribeToPushNotificationEventslambda1 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final mergeJsonObjects write;

    public subscribeToFeatureFlagsUpdateslambda31(transferSessionPackageI transfersessionpackagei, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, mergeJsonObjects mergejsonobjects) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = mergejsonobjects;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new RealWebSocket$$ExternalSyntheticLambda0(13, transfersessionpackagei));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        ((o.subscribeToFeatureFlagsUpdateslambda2) r3.write.write()).read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (((java.lang.Boolean) r3.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (((java.lang.Boolean) r3.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue() != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        ((o.subscribeToContentCardsUpdateslambda2) r3.serializer.write()).read();
        r1 = o.subscribeToFeatureFlagsUpdateslambda31.read + 47;
        o.subscribeToFeatureFlagsUpdateslambda31.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    @Override // o.subscribeToPushNotificationEventslambda1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void read() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.subscribeToFeatureFlagsUpdateslambda31.read
            int r1 = r1 + 47
            int r2 = r1 % 128
            o.subscribeToFeatureFlagsUpdateslambda31.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L20
            o.isAdapterPositionOnScreen r1 = r3.RemoteActionCompatParcelizer
            java.lang.Object r1 = r1.MediaSessionCompatResultReceiverWrapper()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 3
            int r2 = r2 / 0
            if (r1 == 0) goto L2f
            goto L44
        L20:
            o.isAdapterPositionOnScreen r1 = r3.RemoteActionCompatParcelizer
            java.lang.Object r1 = r1.MediaSessionCompatResultReceiverWrapper()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 == r2) goto L44
        L2f:
            o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r1 = r3.serializer
            java.lang.Object r1 = r1.write()
            o.subscribeToContentCardsUpdateslambda2 r1 = (o.subscribeToContentCardsUpdateslambda2) r1
            r1.read()
            int r1 = o.subscribeToFeatureFlagsUpdateslambda31.read
            int r1 = r1 + 47
            int r2 = r1 % 128
            o.subscribeToFeatureFlagsUpdateslambda31.IconCompatParcelizer = r2
            int r1 = r1 % r0
            return
        L44:
            o.mergeJsonObjects r0 = r3.write
            java.lang.Object r0 = r0.write()
            o.subscribeToFeatureFlagsUpdateslambda2 r0 = (o.subscribeToFeatureFlagsUpdateslambda2) r0
            r0.read()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.subscribeToFeatureFlagsUpdateslambda31.read():void");
    }

    @Override // o.subscribeToPushNotificationEventslambda1
    public final void read(int i) {
        int i2 = 2 % 2;
        if (((Boolean) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
            int i3 = read + 49;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            ((subscribeToFeatureFlagsUpdateslambda2) this.write.write()).read(i);
            return;
        }
        ((subscribeToContentCardsUpdateslambda2) this.serializer.write()).read(i);
        int i5 = IconCompatParcelizer + 83;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
