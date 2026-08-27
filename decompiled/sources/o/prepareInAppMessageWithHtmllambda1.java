package o;

/* JADX INFO: loaded from: classes4.dex */
public enum prepareInAppMessageWithHtmllambda1 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    public final char begin;
    public final char end;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    prepareInAppMessageWithHtmllambda1(char c, char c2) {
        this.begin = c;
        this.end = c2;
    }
}
