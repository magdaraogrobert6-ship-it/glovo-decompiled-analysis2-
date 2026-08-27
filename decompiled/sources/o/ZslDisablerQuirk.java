package o;

/* JADX INFO: loaded from: classes.dex */
public enum ZslDisablerQuirk {
    UNKNOWN,
    NONE,
    READY,
    FIRED;

    public int toFlashState() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 1;
        }
        return 3;
    }
}
