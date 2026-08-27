package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ic implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int write = 1;
    public final /* synthetic */ int serializer;
    public static final ic read = new ic(0);
    public static final ic RemoteActionCompatParcelizer = new ic(1);

    public /* synthetic */ ic(int i) {
        this.serializer = i;
    }

    static {
        int i = IconCompatParcelizer + 93;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return new o.i8();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = new o.ib();
        r2 = o.ic.MediaSessionCompatQueueItem + 103;
        o.ic.MediaDescriptionCompat = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.serializer != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.serializer != 0) goto L9;
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
            int r1 = o.ic.MediaDescriptionCompat
            int r1 = r1 + 35
            int r2 = r1 % 128
            o.ic.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            int r1 = r4.serializer
            r2 = 75
            int r2 = r2 / 0
            if (r1 == 0) goto L21
            goto L1b
        L17:
            int r1 = r4.serializer
            if (r1 == 0) goto L21
        L1b:
            o.i8 r0 = new o.i8
            r0.<init>()
            return r0
        L21:
            o.ib r1 = new o.ib
            r1.<init>()
            int r2 = o.ic.MediaSessionCompatQueueItem
            int r2 = r2 + 103
            int r3 = r2 % 128
            o.ic.MediaDescriptionCompat = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ic.write():java.lang.Object");
    }
}
