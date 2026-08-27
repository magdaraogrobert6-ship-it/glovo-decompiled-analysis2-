package o;

/* JADX INFO: loaded from: classes2.dex */
public enum linearDiffAborted {
    AND("and"),
    OR("or");

    private final String text;

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }

    linearDiffAborted(String str) {
        this.text = str;
    }
}
