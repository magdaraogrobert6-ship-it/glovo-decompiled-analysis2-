package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public enum component21 implements ifDebug {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final dataAvailable internalValueMap = new encode4Dl_Bck(2);
    private final int value;

    public static dataAvailable internalGetValueMap() {
        return internalValueMap;
    }

    public static decodeByte internalGetVerifier() {
        return encode6p3vJLY.IconCompatParcelizer;
    }

    component21(int i) {
        this.value = i;
    }

    public static component21 forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    @Override // o.ifDebug
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static component21 valueOf(int i) {
        return forNumber(i);
    }
}
