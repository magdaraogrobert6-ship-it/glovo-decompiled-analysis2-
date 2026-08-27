package o;

/* JADX INFO: loaded from: classes3.dex */
public final class me implements getColorIntegerOrNulllambda0 {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;
    public static final me IconCompatParcelizer = new me(1);
    public static final me write = new me(0);

    public /* synthetic */ me(int i) {
        this.read = i;
    }

    static {
        int i = RemoteActionCompatParcelizer + 17;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return new o.mg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.read != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.read != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = new o.m9();
        r2 = o.me.MediaMetadataCompat + 101;
        o.me.MediaSessionCompatQueueItem = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object write() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.me.MediaMetadataCompat
            int r1 = r1 + 37
            int r2 = r1 % 128
            o.me.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            int r1 = r4.read
            r2 = 80
            int r2 = r2 / 0
            if (r1 == 0) goto L2a
            goto L1b
        L17:
            int r1 = r4.read
            if (r1 == 0) goto L2a
        L1b:
            o.m9 r1 = new o.m9
            r1.<init>()
            int r2 = o.me.MediaMetadataCompat
            int r2 = r2 + 101
            int r3 = r2 % 128
            o.me.MediaSessionCompatQueueItem = r3
            int r2 = r2 % r0
            return r1
        L2a:
            o.mg r0 = new o.mg
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.me.write():java.lang.Object");
    }
}
