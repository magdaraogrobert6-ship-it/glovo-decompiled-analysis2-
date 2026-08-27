package o;

/* JADX INFO: loaded from: classes4.dex */
public final class migrateBannerStorageToJsonlambda20 implements Runnable {
    final /* synthetic */ long read;
    final /* synthetic */ com.sentiance.sdk.status.a serializer;

    @Override // java.lang.Runnable
    public final void run() {
        com.sentiance.sdk.status.a.read(this.serializer, this.read);
    }

    public migrateBannerStorageToJsonlambda20(com.sentiance.sdk.status.a aVar, long j) {
        this.serializer = aVar;
        this.read = j;
    }
}
