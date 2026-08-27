package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AdjustBridgeUtil implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write = 0;

    public /* synthetic */ AdjustBridgeUtil(int i, androidx.compose.foundation.pager.PagerState pagerState, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        this.serializer = pagerState;
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ AdjustBridgeUtil(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i, setConnectionOptions setconnectionoptions) {
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = i;
        this.serializer = setconnectionoptions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer((o.getContentViewGroupParentLayout) r5, null, null, new com.roadrunner.rrds.compose.component.navigations.TabsKt$ScrollableTabRow$3$1$1$1$1(r4, (androidx.compose.foundation.pager.PagerState) r3, null), 3);
        r1 = o.AdjustBridgeUtil.read + 109;
        o.AdjustBridgeUtil.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        ((o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) r5).invoke(java.lang.Integer.valueOf(r4), ((o.setConnectionOptions) r3).MediaSessionCompatQueueItem);
     */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.AdjustBridgeUtil.MediaDescriptionCompat
            int r1 = r1 + 5
            int r2 = r1 % 128
            o.AdjustBridgeUtil.read = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1f
            int r1 = r7.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            java.lang.Object r3 = r7.serializer
            int r4 = r7.IconCompatParcelizer
            java.lang.Object r5 = r7.RemoteActionCompatParcelizer
            r6 = 26
            int r6 = r6 / 0
            if (r1 == 0) goto L39
            goto L2b
        L1f:
            int r1 = r7.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            java.lang.Object r3 = r7.serializer
            int r4 = r7.IconCompatParcelizer
            java.lang.Object r5 = r7.RemoteActionCompatParcelizer
            if (r1 == 0) goto L39
        L2b:
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r5 = (o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) r5
            o.setConnectionOptions r3 = (o.setConnectionOptions) r3
            java.lang.String r0 = r3.MediaSessionCompatQueueItem
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r5.invoke(r1, r0)
            return r2
        L39:
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            androidx.compose.foundation.pager.PagerState r3 = (androidx.compose.foundation.pager.PagerState) r3
            com.roadrunner.rrds.compose.component.navigations.TabsKt$ScrollableTabRow$3$1$1$1$1 r1 = new com.roadrunner.rrds.compose.component.navigations.TabsKt$ScrollableTabRow$3$1$1$1$1
            r6 = 0
            r1.<init>(r4, r3, r6)
            r3 = 3
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r5, r6, r6, r1, r3)
            int r1 = o.AdjustBridgeUtil.read
            int r1 = r1 + 109
            int r3 = r1 % 128
            o.AdjustBridgeUtil.MediaDescriptionCompat = r3
            int r1 = r1 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AdjustBridgeUtil.invoke():java.lang.Object");
    }
}
