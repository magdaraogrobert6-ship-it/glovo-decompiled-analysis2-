package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class markAsAttachedui {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[AlignmentCompanion.values().length];
        try {
            iArr[AlignmentCompanion.Cursor.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AlignmentCompanion.SelectionStart.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AlignmentCompanion.SelectionEnd.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
