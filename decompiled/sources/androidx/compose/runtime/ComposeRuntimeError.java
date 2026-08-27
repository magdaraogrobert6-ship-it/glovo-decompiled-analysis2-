package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {
    public final String IconCompatParcelizer;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.IconCompatParcelizer;
    }

    public ComposeRuntimeError(String str) {
        this.IconCompatParcelizer = str;
    }
}
