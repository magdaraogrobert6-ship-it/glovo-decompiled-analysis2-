package o;

/* JADX INFO: loaded from: classes2.dex */
public enum addGroupdefault {
    HIGHEST(Integer.MIN_VALUE),
    CRITICAL(0),
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    LOWEST(Integer.MAX_VALUE);

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final int value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    addGroupdefault(int i) {
        this.value = i;
    }
}
