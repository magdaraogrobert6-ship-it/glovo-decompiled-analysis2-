package o;

/* JADX INFO: loaded from: classes2.dex */
public enum PointerInputModifierNodeKt implements ifDebug {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);

    public static final int IMAGE_DISPLAY_ERROR_VALUE = 2;
    public static final int IMAGE_FETCH_ERROR_VALUE = 1;
    public static final int IMAGE_UNSUPPORTED_FORMAT_VALUE = 3;
    public static final int UNSPECIFIED_RENDER_ERROR_VALUE = 0;
    private static final dataAvailable internalValueMap = new speculativeHit(28);
    private final int value;

    public static dataAvailable internalGetValueMap() {
        return internalValueMap;
    }

    public static decodeByte internalGetVerifier() {
        return observeMeasureSnapshotReadsAffectingLookaheadui.IconCompatParcelizer;
    }

    @Override // o.ifDebug
    public final int getNumber() {
        return this.value;
    }

    PointerInputModifierNodeKt(int i) {
        this.value = i;
    }

    @Deprecated
    public static PointerInputModifierNodeKt valueOf(int i) {
        return forNumber(i);
    }

    public static PointerInputModifierNodeKt forNumber(int i) {
        if (i == 0) {
            return UNSPECIFIED_RENDER_ERROR;
        }
        if (i == 1) {
            return IMAGE_FETCH_ERROR;
        }
        if (i == 2) {
            return IMAGE_DISPLAY_ERROR;
        }
        if (i != 3) {
            return null;
        }
        return IMAGE_UNSUPPORTED_FORMAT;
    }
}
