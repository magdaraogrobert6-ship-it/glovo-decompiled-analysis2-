package o;

/* JADX INFO: loaded from: classes4.dex */
public final class handleUrlOverridelambda1 implements Runnable {
    public static int RemoteActionCompatParcelizer;
    public static int read;
    public final /* synthetic */ handleUrlOverridelambda00 IconCompatParcelizer;
    public final /* synthetic */ logPurchaseWithJSONlambda0 serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ handleUrlOverridelambda1(logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0, handleUrlOverridelambda00 handleurloverridelambda00, int i) {
        this.write = i;
        this.serializer = logpurchasewithjsonlambda0;
        this.IconCompatParcelizer = handleurloverridelambda00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        logPurchaseWithJSONlambda0 logpurchasewithjsonlambda0 = this.serializer;
        if (i != 0) {
            ((replacePrefetchedUrlsWithLocalAssetslambda1) logpurchasewithjsonlambda0.write).IconCompatParcelizer.execute(new isAutomaticGeofenceRequestsEnabled(16, this));
            return;
        }
        replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1 = (replacePrefetchedUrlsWithLocalAssetslambda1) logpurchasewithjsonlambda0.write;
        ReflectionUtils reflectionUtils = replacePrefetchedUrlsWithLocalAssetslambda1.write;
        replaceprefetchedurlswithlocalassetslambda1.serializer(this.IconCompatParcelizer);
    }

    public static int RemoteActionCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 6455149;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        read = i3;
        return i3;
    }
}
