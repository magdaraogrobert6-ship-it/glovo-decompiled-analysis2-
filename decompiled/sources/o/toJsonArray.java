package o;

import com.sentiance.protobuf.WireFormat$JavaType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class toJsonArray {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

    static {
        int[] iArr = new int[WireFormat$JavaType.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[WireFormat$JavaType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[WireFormat$JavaType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
