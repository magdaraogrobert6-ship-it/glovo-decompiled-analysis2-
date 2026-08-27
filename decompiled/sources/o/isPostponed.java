package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isPostponed implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public static final isPostponed write = new isPostponed(1);
    public static final isPostponed serializer = new isPostponed(0);

    public /* synthetic */ isPostponed(int i) {
        this.read = i;
    }

    static {
        int i = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return new o.isStateSaved();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4.read != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.read != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = new o.isResumed();
        r2 = o.isPostponed.MediaMetadataCompat + 11;
        o.isPostponed.MediaDescriptionCompat = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = o.isPostponed.MediaMetadataCompat
            int r1 = r1 + 119
            int r2 = r1 % 128
            o.isPostponed.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L15
            int r1 = r4.read
            int r2 = r0 / 0
            if (r1 == 0) goto L28
            goto L19
        L15:
            int r1 = r4.read
            if (r1 == 0) goto L28
        L19:
            o.isResumed r1 = new o.isResumed
            r1.<init>()
            int r2 = o.isPostponed.MediaMetadataCompat
            int r2 = r2 + 11
            int r3 = r2 % 128
            o.isPostponed.MediaDescriptionCompat = r3
            int r2 = r2 % r0
            return r1
        L28:
            o.isStateSaved r0 = new o.isStateSaved
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isPostponed.write():java.lang.Object");
    }
}
