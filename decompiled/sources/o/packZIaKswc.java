package o;

/* JADX INFO: loaded from: classes2.dex */
public enum packZIaKswc {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");

    private String mName;

    @Override // java.lang.Enum
    public String toString() {
        return this.mName;
    }

    packZIaKswc(String str) {
        this.mName = str;
    }
}
