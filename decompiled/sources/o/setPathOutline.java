package o;

/* JADX INFO: loaded from: classes2.dex */
public enum setPathOutline {
    CUSTOMER("customer"),
    DISPATCHER("dispatcher");

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final String rawValue;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    setPathOutline(String str) {
        this.rawValue = str;
    }
}
