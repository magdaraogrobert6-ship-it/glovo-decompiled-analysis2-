package o;

/* JADX INFO: loaded from: classes2.dex */
public enum getColumnCount {
    HIANALYTICS_OPERATION(0),
    HIANALYTICS_MAINTENANCE(1),
    HIANALYTICS_DIFF(3);

    private final int type;

    public int getCode() {
        return this.type;
    }

    getColumnCount(int i) {
        this.type = i;
    }
}
