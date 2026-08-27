package o;

/* JADX INFO: loaded from: classes2.dex */
public enum AndroidComposeViewRootModifierNodeonKeyEvent1 implements structuralUpdate {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final int number;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    @Override // o.structuralUpdate
    public int getNumber() {
        return this.number;
    }

    AndroidComposeViewRootModifierNodeonKeyEvent1(int i) {
        this.number = i;
    }
}
