package o;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class SegmentFinder_androidKt implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ SegmentFinder read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SegmentFinder_androidKt(SegmentFinder segmentFinder, int i) {
        this.serializer = i;
        this.read = segmentFinder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r5 = (o.nextStartBoundary) r5;
        r0 = r2.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r5 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r5 = o.Api34SegmentFinder.write;
        r2 = o.SegmentFinder_androidKt.IconCompatParcelizer + 85;
        o.SegmentFinder_androidKt.RemoteActionCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r0.IconCompatParcelizer(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r5 = (java.lang.Boolean) r5;
        r5.getClass();
        r2.RemoteActionCompatParcelizer.IconCompatParcelizer(r5);
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, o.ShortNewsContentCardView r6) {
        /*
            r4 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = o.SegmentFinder_androidKt.RemoteActionCompatParcelizer
            int r0 = r0 + 125
            int r1 = r0 % 128
            o.SegmentFinder_androidKt.IconCompatParcelizer = r1
            int r0 = r0 % r6
            if (r0 != 0) goto L1b
            int r0 = r4.serializer
            o.createFromParcel r1 = o.createFromParcel.INSTANCE
            o.SegmentFinder r2 = r4.read
            r3 = 89
            int r3 = r3 / 0
            if (r0 == 0) goto L2e
            goto L23
        L1b:
            int r0 = r4.serializer
            o.createFromParcel r1 = o.createFromParcel.INSTANCE
            o.SegmentFinder r2 = r4.read
            if (r0 == 0) goto L2e
        L23:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            kotlinx.coroutines.flow.MutableStateFlow r6 = r2.RemoteActionCompatParcelizer
            r6.IconCompatParcelizer(r5)
            return r1
        L2e:
            o.nextStartBoundary r5 = (o.nextStartBoundary) r5
            kotlinx.coroutines.flow.MutableStateFlow r0 = r2.IconCompatParcelizer
            if (r5 != 0) goto L3f
            o.Api34SegmentFinder r5 = o.Api34SegmentFinder.write
            int r2 = o.SegmentFinder_androidKt.IconCompatParcelizer
            int r2 = r2 + 85
            int r3 = r2 % 128
            o.SegmentFinder_androidKt.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r6
        L3f:
            r0.IconCompatParcelizer(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SegmentFinder_androidKt.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
    }
}
