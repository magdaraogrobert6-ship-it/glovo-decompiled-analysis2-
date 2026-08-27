package o;

/* JADX INFO: loaded from: classes4.dex */
public final class UriActionExternalSyntheticLambda4 implements BaseBrazeActionStepCompanionrunOnUser1 {
    public final /* synthetic */ int serializer;
    public final Object write;

    public /* synthetic */ UriActionExternalSyntheticLambda4(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.serializer;
        Object obj = this.write;
        if (i != 0) {
            ((io.sentry.util.RemoteActionCompatParcelizer) obj).unlock();
        } else {
            openUriWithWebViewActivityFromPush.RemoteActionCompatParcelizer.set((AddToCustomAttributeArrayStep) obj);
        }
    }
}
