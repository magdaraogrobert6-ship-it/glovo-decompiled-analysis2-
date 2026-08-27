package androidx.compose.runtime.tooling;

/* JADX INFO: loaded from: classes.dex */
public final class ParseException extends Exception {
    public final String read;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.read;
    }

    public ParseException(String str) {
        super(str);
        this.read = str;
    }
}
