package o;

/* JADX INFO: loaded from: classes4.dex */
public enum BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 {
    DEFAULT(0),
    SIGNED(8589934592L),
    FIXED(17179869184L);

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final long signature;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final long getSignature$kotlinx_serialization_protobuf() {
        return this.signature;
    }

    BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2(long j) {
        this.signature = j;
    }
}
