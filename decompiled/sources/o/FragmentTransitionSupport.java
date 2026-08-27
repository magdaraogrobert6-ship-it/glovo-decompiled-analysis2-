package o;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentTransitionSupport implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ StretchedVideoResolutionQuirk IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ FragmentTransitionSupport(StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = stretchedVideoResolutionQuirk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r7 = (java.lang.Throwable) r7;
        r4.cancel(true);
        r7 = o.FragmentTransitionSupport.read + 113;
        o.FragmentTransitionSupport.serializer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if ((r7 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r7 = 14 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r7 = (java.lang.Throwable) r7;
        r4.cancel(true);
     */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.FragmentTransitionSupport.serializer
            int r1 = r1 + 35
            int r2 = r1 % 128
            o.FragmentTransitionSupport.read = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L1b
            int r1 = r6.RemoteActionCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.StretchedVideoResolutionQuirk r4 = r6.IconCompatParcelizer
            r5 = 2
            int r5 = r5 / 0
            if (r1 == 0) goto L29
            goto L23
        L1b:
            int r1 = r6.RemoteActionCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.StretchedVideoResolutionQuirk r4 = r6.IconCompatParcelizer
            if (r1 == 0) goto L29
        L23:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r4.cancel(r2)
            return r3
        L29:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r4.cancel(r2)
            int r7 = o.FragmentTransitionSupport.read
            int r7 = r7 + 113
            int r1 = r7 % 128
            o.FragmentTransitionSupport.serializer = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L3d
            r7 = 14
            int r7 = r7 / 0
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FragmentTransitionSupport.invoke(java.lang.Object):java.lang.Object");
    }
}
