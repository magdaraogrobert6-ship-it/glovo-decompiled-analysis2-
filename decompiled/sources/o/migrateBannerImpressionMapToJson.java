package o;

/* JADX INFO: loaded from: classes3.dex */
public final class migrateBannerImpressionMapToJson implements Runnable {
    final /* synthetic */ long IconCompatParcelizer;
    final /* synthetic */ long RemoteActionCompatParcelizer;
    final /* synthetic */ com.sentiance.sdk.status.a read;

    @Override // java.lang.Runnable
    public final void run() {
        com.sentiance.sdk.status.a aVar = this.read;
        if (com.sentiance.sdk.status.a.read(aVar, aVar.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer())) {
            aVar.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            return;
        }
        aVar.MediaBrowserCompatMediaItem.getClass();
        if (System.currentTimeMillis() - this.IconCompatParcelizer < 1000) {
            aVar.MediaMetadataCompat.serializer(this, 10L);
        }
    }

    public migrateBannerImpressionMapToJson(com.sentiance.sdk.status.a aVar, long j, long j2) {
        this.read = aVar;
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
    }
}
