package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class OnPositionedDispatcher {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[Value.RemoteActionCompatParcelizer.values().length];
        try {
            iArr[Value.RemoteActionCompatParcelizer.NULL_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Value.RemoteActionCompatParcelizer.ARRAY_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Value.RemoteActionCompatParcelizer.TIMESTAMP_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Value.RemoteActionCompatParcelizer.STRING_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Value.RemoteActionCompatParcelizer.INTEGER_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Value.RemoteActionCompatParcelizer.DOUBLE_VALUE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        IconCompatParcelizer = iArr;
    }
}
