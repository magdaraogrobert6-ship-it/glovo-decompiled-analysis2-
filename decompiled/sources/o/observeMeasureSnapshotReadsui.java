package o;

/* JADX INFO: loaded from: classes2.dex */
public enum observeMeasureSnapshotReadsui implements ifDebug {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);

    public static final int AUTO_VALUE = 1;
    public static final int CLICK_VALUE = 2;
    public static final int SWIPE_VALUE = 3;
    public static final int UNKNOWN_DISMISS_TYPE_VALUE = 0;
    private static final dataAvailable internalValueMap = new accessgetVcp(28);
    private final int value;

    public static dataAvailable internalGetValueMap() {
        return internalValueMap;
    }

    public static decodeByte internalGetVerifier() {
        return observeMeasureSnapshotReadsAffectingLookaheadui.write;
    }

    @Override // o.ifDebug
    public final int getNumber() {
        return this.value;
    }

    observeMeasureSnapshotReadsui(int i) {
        this.value = i;
    }

    @Deprecated
    public static observeMeasureSnapshotReadsui valueOf(int i) {
        return forNumber(i);
    }

    public static observeMeasureSnapshotReadsui forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_DISMISS_TYPE;
        }
        if (i == 1) {
            return AUTO;
        }
        if (i == 2) {
            return CLICK;
        }
        if (i != 3) {
            return null;
        }
        return SWIPE;
    }
}
