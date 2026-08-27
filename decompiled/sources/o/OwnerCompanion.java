package o;

/* JADX INFO: loaded from: classes2.dex */
public enum OwnerCompanion {
    NONE(0),
    SDK(1),
    GLOBAL(2),
    COMBINED(3);

    private final int code;

    public int getCode() {
        return this.code;
    }

    OwnerCompanion(int i) {
        this.code = i;
    }
}
