package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class textValue {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[setText.values().length];
        try {
            iArr[setText.Filled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setText.Outlined.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int[] iArr2 = new int[newChild.values().length];
        try {
            iArr2[newChild.Focused.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[newChild.UnfocusedEmpty.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[newChild.UnfocusedNotEmpty.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        RemoteActionCompatParcelizer = iArr2;
    }
}
