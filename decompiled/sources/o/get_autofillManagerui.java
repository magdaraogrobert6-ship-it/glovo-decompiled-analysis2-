package o;

/* JADX INFO: loaded from: classes2.dex */
public enum get_autofillManagerui implements ifDebug {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final dataAvailable internalValueMap = new invalidateDescendants(2);
    private final int value;

    public static dataAvailable internalGetValueMap() {
        return internalValueMap;
    }

    public static decodeByte internalGetVerifier() {
        return notifyLayerIsDirtyui.RemoteActionCompatParcelizer;
    }

    @Override // o.ifDebug
    public final int getNumber() {
        return this.value;
    }

    get_autofillManagerui(int i) {
        this.value = i;
    }

    public static get_autofillManagerui forNumber(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    @Deprecated
    public static get_autofillManagerui valueOf(int i) {
        return forNumber(i);
    }
}
