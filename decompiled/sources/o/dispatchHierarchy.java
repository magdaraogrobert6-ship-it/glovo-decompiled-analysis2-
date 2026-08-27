package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class dispatchHierarchy {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[Value.RemoteActionCompatParcelizer.values().length];
        try {
            iArr[Value.RemoteActionCompatParcelizer.NULL_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Value.RemoteActionCompatParcelizer.BOOLEAN_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
