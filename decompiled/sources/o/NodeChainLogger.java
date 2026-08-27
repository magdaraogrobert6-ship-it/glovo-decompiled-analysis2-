package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class NodeChainLogger {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[NodeChainsentinelHead1.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[NodeChainsentinelHead1.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[NodeChainsentinelHead1.TERMINATE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[NodeChainsentinelHead1.REQUIRE_WATCH_DISCONNECTION_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[NodeChainKt.values().length];
        serializer = iArr2;
        try {
            iArr2[NodeChainKt.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            serializer[NodeChainKt.INITIALIZE_LOCAL_LISTEN_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            serializer[NodeChainKt.REQUIRE_WATCH_CONNECTION_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
