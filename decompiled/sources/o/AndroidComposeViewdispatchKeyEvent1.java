package o;

/* JADX INFO: loaded from: classes2.dex */
public enum AndroidComposeViewdispatchKeyEvent1 implements structuralUpdate {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final int number;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    @Override // o.structuralUpdate
    public int getNumber() {
        return this.number;
    }

    AndroidComposeViewdispatchKeyEvent1(int i) {
        this.number = i;
    }
}
