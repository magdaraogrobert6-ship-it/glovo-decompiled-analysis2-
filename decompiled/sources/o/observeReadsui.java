package o;

/* JADX INFO: loaded from: classes2.dex */
public enum observeReadsui implements ifDebug {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);

    public static final int CLICK_EVENT_TYPE_VALUE = 2;
    public static final int IMPRESSION_EVENT_TYPE_VALUE = 1;
    public static final int UNKNOWN_EVENT_TYPE_VALUE = 0;
    private static final dataAvailable internalValueMap = new startObservingui(0);
    private final int value;

    public static dataAvailable internalGetValueMap() {
        return internalValueMap;
    }

    public static decodeByte internalGetVerifier() {
        return observeMeasureSnapshotReadsAffectingLookaheadui.serializer;
    }

    @Override // o.ifDebug
    public final int getNumber() {
        return this.value;
    }

    observeReadsui(int i) {
        this.value = i;
    }

    @Deprecated
    public static observeReadsui valueOf(int i) {
        return forNumber(i);
    }

    public static observeReadsui forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_EVENT_TYPE;
        }
        if (i == 1) {
            return IMPRESSION_EVENT_TYPE;
        }
        if (i != 2) {
            return null;
        }
        return CLICK_EVENT_TYPE;
    }
}
