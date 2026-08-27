package o;

/* JADX INFO: loaded from: classes2.dex */
public enum rebuildOutline {
    STAGING("staging"),
    PRODUCTION("prod"),
    TESTING("testing");

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final String backendName;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getBackendName$customerchat_release() {
        return this.backendName;
    }

    rebuildOutline(String str) {
        this.backendName = str;
    }
}
