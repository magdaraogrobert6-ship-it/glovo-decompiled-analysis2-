package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public enum isSemanticsInvalidatedui implements getDoubleTapMinTimeMillis {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final getTouchSlop internalValueMap = new io.sentry.hints.PlaybackStateCompatCustomAction(25);
    private final int value;

    public static getTouchSlop internalGetValueMap() {
        return internalValueMap;
    }

    public static getDoubleTapTimeoutMillis internalGetVerifier() {
        return getSubcompositionsStateui.write;
    }

    isSemanticsInvalidatedui(int i) {
        this.value = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static isSemanticsInvalidatedui valueOf(int i) {
        return forNumber(i);
    }

    public static isSemanticsInvalidatedui forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }
}
