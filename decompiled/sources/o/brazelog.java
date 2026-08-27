package o;

/* JADX INFO: loaded from: classes4.dex */
public enum brazelog {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int value;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    public static final wlambda0 Companion = new wlambda0();

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    brazelog(int i) {
        this.value = i;
    }
}
