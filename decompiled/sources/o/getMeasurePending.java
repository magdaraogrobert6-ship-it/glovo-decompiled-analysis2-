package o;

/* JADX INFO: loaded from: classes2.dex */
public enum getMeasurePending {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    private final int id;

    public int getId() {
        return this.id;
    }

    public static getMeasurePending determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.id);
    }

    getMeasurePending(int i) {
        this.id = i;
    }
}
