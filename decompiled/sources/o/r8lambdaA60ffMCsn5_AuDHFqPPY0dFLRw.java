package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw extends InspectableKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final InfiniteTransitionSearchInfo write;

    static {
        AcknowledgmentTaskUiItem$Companion acknowledgmentTaskUiItem$Companion = InfiniteTransitionSearchInfo.Companion;
        int i = IconCompatParcelizer + 57;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
        infiniteTransitionSearchInfo.getClass();
        this.write = infiniteTransitionSearchInfo;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = read + 21;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AcknowledgementTask(acknowledgmentTaskUiItem=" + this.write + ")";
        int i2 = RemoteActionCompatParcelizer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r13 instanceof o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 17;
        o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw.RemoteActionCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r10 = new java.lang.Object[]{r12.write, ((o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw) r13).write};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r13 = o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw.RemoteActionCompatParcelizer + 73;
        o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw.read = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if ((r13 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r13 = 33 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw.RemoteActionCompatParcelizer
            int r1 = r1 + 53
            int r2 = r1 % 128
            o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw.read = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 67
            int r1 = r1 / r4
            if (r12 != r13) goto L19
            goto L18
        L16:
            if (r12 != r13) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r13 instanceof o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw
            if (r1 != 0) goto L29
            int r2 = r2 + 17
            int r13 = r2 % 128
            o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw.RemoteActionCompatParcelizer = r13
            int r2 = r2 % r0
            if (r2 == 0) goto L27
            goto L28
        L27:
            r3 = r4
        L28:
            return r3
        L29:
            o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw r13 = (o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw) r13
            o.InfiniteTransitionSearchInfo r1 = r12.write
            o.InfiniteTransitionSearchInfo r13 = r13.write
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r13}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r13 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L56
            return r4
        L56:
            int r13 = o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw.RemoteActionCompatParcelizer
            int r13 = r13 + 73
            int r1 = r13 % 128
            o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw.read = r1
            int r13 = r13 % r0
            if (r13 != 0) goto L64
            r13 = 33
            int r13 = r13 / r4
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw.equals(java.lang.Object):boolean");
    }
}
