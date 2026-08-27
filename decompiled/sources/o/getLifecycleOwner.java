package o;

/* JADX INFO: loaded from: classes2.dex */
public enum getLifecycleOwner implements structuralUpdate {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final int number;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    @Override // o.structuralUpdate
    public int getNumber() {
        return this.number;
    }

    getLifecycleOwner(int i) {
        this.number = i;
    }
}
