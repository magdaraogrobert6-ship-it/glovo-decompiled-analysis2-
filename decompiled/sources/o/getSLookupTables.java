package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getSLookupTables implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RatingCompat = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ WrapPreview RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;

    public /* synthetic */ getSLookupTables(WrapPreview wrapPreview, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = wrapPreview;
        this.serializer = modifier;
        this.read = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        o.putInto.RemoteActionCompatParcelizer(r5, r4, r7, o.ContentType_androidKt.RemoteActionCompatParcelizer(r3 | 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        o.toViewInfo.IconCompatParcelizer(r5, r4, r7, o.ContentType_androidKt.RemoteActionCompatParcelizer(r3 | 1));
        r7 = o.getSLookupTables.RatingCompat + 125;
        o.getSLookupTables.write = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getSLookupTables.RatingCompat
            int r1 = r1 + 111
            int r2 = r1 % 128
            o.getSLookupTables.write = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            int r1 = r6.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            int r3 = r6.read
            androidx.compose.ui.Modifier r4 = r6.serializer
            o.WrapPreview r5 = r6.RemoteActionCompatParcelizer
            o.getBirthDateFull r7 = (o.getBirthDateFull) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            r8.getClass()
            r8 = 15
            int r8 = r8 / 0
            if (r1 == 0) goto L4c
            goto L39
        L26:
            int r1 = r6.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            int r3 = r6.read
            androidx.compose.ui.Modifier r4 = r6.serializer
            o.WrapPreview r5 = r6.RemoteActionCompatParcelizer
            o.getBirthDateFull r7 = (o.getBirthDateFull) r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            r8.getClass()
            if (r1 == 0) goto L4c
        L39:
            r8 = r3 | 1
            int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
            o.toViewInfo.IconCompatParcelizer(r5, r4, r7, r8)
            int r7 = o.getSLookupTables.RatingCompat
            int r7 = r7 + 125
            int r8 = r7 % 128
            o.getSLookupTables.write = r8
            int r7 = r7 % r0
            return r2
        L4c:
            r8 = r3 | 1
            int r8 = o.ContentType_androidKt.RemoteActionCompatParcelizer(r8)
            o.putInto.RemoteActionCompatParcelizer(r5, r4, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSLookupTables.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
