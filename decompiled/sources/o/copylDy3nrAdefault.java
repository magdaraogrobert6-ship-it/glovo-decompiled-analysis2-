package o;

/* JADX INFO: loaded from: classes2.dex */
public final class copylDy3nrAdefault {
    public static final copylDy3nrAdefault serializer;
    public static final copylDy3nrAdefault write;
    public final Throwable IconCompatParcelizer;

    public copylDy3nrAdefault(boolean z, RuntimeException runtimeException) {
        this.IconCompatParcelizer = runtimeException;
    }

    static {
        if (component2D9Ej5fM.IconCompatParcelizer) {
            serializer = null;
            write = null;
        } else {
            serializer = new copylDy3nrAdefault(false, null);
            write = new copylDy3nrAdefault(true, null);
        }
    }
}
