package o;

/* JADX INFO: loaded from: classes.dex */
public enum toColorLong8_81llA {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final boolean isAtLeast(toColorLong8_81llA tocolorlong8_81lla) {
        tocolorlong8_81lla.getClass();
        return compareTo(tocolorlong8_81lla) >= 0;
    }
}
