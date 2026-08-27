package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class updateLayerBlockdefault {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[Value.RemoteActionCompatParcelizer.values().length];
        read = iArr;
        try {
            iArr[Value.RemoteActionCompatParcelizer.NULL_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.BOOLEAN_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.DOUBLE_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.INTEGER_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.TIMESTAMP_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.STRING_VALUE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.BYTES_VALUE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.REFERENCE_VALUE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.GEO_POINT_VALUE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.MAP_VALUE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            read[Value.RemoteActionCompatParcelizer.ARRAY_VALUE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
