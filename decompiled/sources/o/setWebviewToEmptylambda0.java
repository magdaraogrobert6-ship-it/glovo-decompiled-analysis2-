package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setWebviewToEmptylambda0 {
    public static final setWebviewToEmptylambda0 RemoteActionCompatParcelizer = new setWebviewToEmptylambda0();
    public final io.sentry.util.RemoteActionCompatParcelizer read = new io.sentry.util.RemoteActionCompatParcelizer();
    public boolean serializer;

    public final void IconCompatParcelizer() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            if (!this.serializer) {
                this.serializer = true;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
