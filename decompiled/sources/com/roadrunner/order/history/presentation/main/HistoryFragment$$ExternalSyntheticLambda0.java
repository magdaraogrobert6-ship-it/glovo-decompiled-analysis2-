package com.roadrunner.order.history.presentation.main;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class HistoryFragment$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ HistoryFragment RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ HistoryFragment$$ExternalSyntheticLambda0(HistoryFragment historyFragment, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = historyFragment;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r4.write().IconCompatParcelizer(((com.ui.common.widget.calendar.DefaultCalendarManager) r4.write.MediaSessionCompatResultReceiverWrapper()).MediaMetadataCompat);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return o.createFromParcel.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r0 = r4.getParentFragmentManager();
        r0.getClass();
        r1 = r4.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r2 = r4.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        return new com.ui.common.widget.calendar.DefaultCalendarManager(r0, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        o.removeNodeAtDepth.serializer("getCalendarWeeks");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        o.removeNodeAtDepth.serializer("historyCalendarResourceProvider");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda0.read
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda0.serializer = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1d
            int r1 = r6.write
            com.roadrunner.order.history.presentation.main.HistoryFragment r4 = r6.RemoteActionCompatParcelizer
            r5 = 23
            int r5 = r5 / 0
            if (r1 == 0) goto L5a
            if (r1 == r2) goto L39
            goto L25
        L1d:
            int r1 = r6.write
            com.roadrunner.order.history.presentation.main.HistoryFragment r4 = r6.RemoteActionCompatParcelizer
            if (r1 == 0) goto L5a
            if (r1 == r2) goto L39
        L25:
            o.ExtrasKt r0 = r4.write()
            o.isAdapterPositionOnScreen r1 = r4.write
            java.lang.Object r1 = r1.MediaSessionCompatResultReceiverWrapper()
            com.ui.common.widget.calendar.DefaultCalendarManager r1 = (com.ui.common.widget.calendar.DefaultCalendarManager) r1
            org.joda.time.LocalDate r1 = r1.MediaMetadataCompat
            r0.IconCompatParcelizer(r1)
            o.createFromParcel r0 = o.createFromParcel.INSTANCE
            return r0
        L39:
            o.div7Ah8Wj8 r0 = r4.getParentFragmentManager()
            r0.getClass()
            o.BrazeExternalSyntheticLambda28 r1 = r4.read
            if (r1 == 0) goto L54
            o.jsonStringToList r2 = r4.RemoteActionCompatParcelizer
            if (r2 == 0) goto L4e
            com.ui.common.widget.calendar.DefaultCalendarManager r3 = new com.ui.common.widget.calendar.DefaultCalendarManager
            r3.<init>(r0, r1, r2)
            return r3
        L4e:
            java.lang.String r0 = "getCalendarWeeks"
            o.removeNodeAtDepth.serializer(r0)
            throw r3
        L54:
            java.lang.String r0 = "historyCalendarResourceProvider"
            o.removeNodeAtDepth.serializer(r0)
            throw r3
        L5a:
            o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r1 = r4.MediaBrowserCompatMediaItem
            if (r1 == 0) goto L68
            int r2 = com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda0.serializer
            int r2 = r2 + 61
            int r3 = r2 % 128
            com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda0.read = r3
            int r2 = r2 % r0
            return r1
        L68:
            java.lang.String r0 = "viewModelFactory"
            o.removeNodeAtDepth.serializer(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda0.invoke():java.lang.Object");
    }
}
