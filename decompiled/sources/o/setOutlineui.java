package o;

/* JADX INFO: loaded from: classes.dex */
public enum setOutlineui {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final boolean readEnabled;
    private final boolean writeEnabled;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }

    setOutlineui(boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }
}
