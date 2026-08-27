package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public enum observeLayoutSnapshotReadsui implements ifDebug {
    UNKNOWN_TRIGGER(0),
    APP_LAUNCH(1),
    ON_FOREGROUND(2),
    UNRECOGNIZED(-1);

    public static final int APP_LAUNCH_VALUE = 1;
    public static final int ON_FOREGROUND_VALUE = 2;
    public static final int UNKNOWN_TRIGGER_VALUE = 0;
    private static final dataAvailable internalValueMap = new startObservingui(1);
    private final int value;

    public static dataAvailable internalGetValueMap() {
        return internalValueMap;
    }

    public static decodeByte internalGetVerifier() {
        return observeMeasureSnapshotReadsAffectingLookaheadui.read;
    }

    observeLayoutSnapshotReadsui(int i) {
        this.value = i;
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
    public static observeLayoutSnapshotReadsui valueOf(int i) {
        return forNumber(i);
    }

    public static observeLayoutSnapshotReadsui forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_TRIGGER;
        }
        if (i == 1) {
            return APP_LAUNCH;
        }
        if (i != 2) {
            return null;
        }
        return ON_FOREGROUND;
    }
}
