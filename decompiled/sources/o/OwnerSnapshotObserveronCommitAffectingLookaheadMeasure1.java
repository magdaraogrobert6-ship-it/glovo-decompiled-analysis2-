package o;

/* JADX INFO: loaded from: classes2.dex */
public enum OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1 implements ifDebug {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);

    public static final int CLIENT_ERROR_VALUE = 2;
    public static final int NETWORK_ERROR_VALUE = 3;
    public static final int SERVER_ERROR_VALUE = 1;
    public static final int UNSPECIFIED_FETCH_ERROR_VALUE = 0;
    private static final dataAvailable internalValueMap = new startObservingui(2);
    private final int value;

    public static dataAvailable internalGetValueMap() {
        return internalValueMap;
    }

    public static decodeByte internalGetVerifier() {
        return observeMeasureSnapshotReadsAffectingLookaheadui.RemoteActionCompatParcelizer;
    }

    @Override // o.ifDebug
    public final int getNumber() {
        return this.value;
    }

    OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1(int i) {
        this.value = i;
    }

    @Deprecated
    public static OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1 valueOf(int i) {
        return forNumber(i);
    }

    public static OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1 forNumber(int i) {
        if (i == 0) {
            return UNSPECIFIED_FETCH_ERROR;
        }
        if (i == 1) {
            return SERVER_ERROR;
        }
        if (i == 2) {
            return CLIENT_ERROR;
        }
        if (i != 3) {
            return null;
        }
        return NETWORK_ERROR;
    }
}
