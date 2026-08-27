package o;

/* JADX INFO: loaded from: classes2.dex */
public enum recalculateWindowPosition {
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");

    private String mName;

    @Override // java.lang.Enum
    public String toString() {
        return this.mName;
    }

    recalculateWindowPosition(String str) {
        this.mName = str;
    }
}
