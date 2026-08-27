package o;

/* JADX INFO: renamed from: o.autofill, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0151autofill implements ifDebug {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final dataAvailable internalValueMap = new invalidateDescendants(1);
    private final int value;

    public static dataAvailable internalGetValueMap() {
        return internalValueMap;
    }

    public static decodeByte internalGetVerifier() {
        return notifyLayerIsDirtyui.serializer;
    }

    @Override // o.ifDebug
    public final int getNumber() {
        return this.value;
    }

    EnumC0151autofill(int i) {
        this.value = i;
    }

    @Deprecated
    public static EnumC0151autofill valueOf(int i) {
        return forNumber(i);
    }

    public static EnumC0151autofill forNumber(int i) {
        if (i == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }
}
