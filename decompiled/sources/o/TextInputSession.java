package o;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInputSession implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    private static int serializer;
    public final /* synthetic */ int read;
    public static final TextInputSession RemoteActionCompatParcelizer = new TextInputSession(1);
    public static final TextInputSession IconCompatParcelizer = new TextInputSession(0);
    public static final TextInputSession write = new TextInputSession(2);

    public /* synthetic */ TextInputSession(int i) {
        this.read = i;
    }

    static {
        int i = serializer + 45;
        MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = new com.huawei.wisesecurity.ucs_credential.g0();
        r2 = o.TextInputSession.MediaSessionCompatQueueItem + 95;
        o.TextInputSession.RatingCompat = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return new com.huawei.wisesecurity.ucs_credential.p0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1 != 1) goto L11;
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
            int r1 = o.TextInputSession.RatingCompat
            int r1 = r1 + 97
            int r2 = r1 % 128
            o.TextInputSession.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L1a
            int r1 = r4.read
            r3 = 17
            int r3 = r3 / 0
            if (r1 == 0) goto L39
            if (r1 == r2) goto L33
            goto L20
        L1a:
            int r1 = r4.read
            if (r1 == 0) goto L39
            if (r1 == r2) goto L33
        L20:
            com.huawei.wisesecurity.ucs_credential.g0 r1 = new com.huawei.wisesecurity.ucs_credential.g0
            r1.<init>()
            int r2 = o.TextInputSession.MediaSessionCompatQueueItem
            int r2 = r2 + 95
            int r3 = r2 % 128
            o.TextInputSession.RatingCompat = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L31
            return r1
        L31:
            r0 = 0
            throw r0
        L33:
            com.huawei.wisesecurity.ucs_credential.p0 r0 = new com.huawei.wisesecurity.ucs_credential.p0
            r0.<init>()
            return r0
        L39:
            com.roadrunner.domain.util.IsFixableByRetry r0 = new com.roadrunner.domain.util.IsFixableByRetry
            r1 = 19
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TextInputSession.write():java.lang.Object");
    }
}
