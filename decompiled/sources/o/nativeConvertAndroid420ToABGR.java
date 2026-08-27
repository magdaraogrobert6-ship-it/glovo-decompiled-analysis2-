package o;

/* JADX INFO: loaded from: classes.dex */
public enum nativeConvertAndroid420ToABGR {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);

    private final boolean mHoldsCameraSlot;

    public boolean holdsCameraSlot() {
        return this.mHoldsCameraSlot;
    }

    nativeConvertAndroid420ToABGR(boolean z) {
        this.mHoldsCameraSlot = z;
    }
}
