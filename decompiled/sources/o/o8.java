package o;

/* JADX INFO: loaded from: classes3.dex */
public final class o8 implements getColorIntegerOrNulllambda0 {
    public static final o8 IconCompatParcelizer = new o8();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 21;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        o6ExternalSyntheticLambda4 o6externalsyntheticlambda4 = new o6ExternalSyntheticLambda4();
        int i2 = RemoteActionCompatParcelizer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return o6externalsyntheticlambda4;
    }
}
