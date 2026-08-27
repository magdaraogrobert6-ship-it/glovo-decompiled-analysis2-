package o;

/* JADX INFO: loaded from: classes2.dex */
public enum setFontFamily {
    SMALL("version 1-9"),
    MEDIUM("version 10-26"),
    LARGE("version 27-40");

    private final String description;

    @Override // java.lang.Enum
    public String toString() {
        return this.description;
    }

    setFontFamily(String str) {
        this.description = str;
    }
}
