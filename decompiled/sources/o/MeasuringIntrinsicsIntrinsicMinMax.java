package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class MeasuringIntrinsicsIntrinsicMinMax implements Runnable {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ boolean MediaBrowserCompatMediaItem;
    public final /* synthetic */ NoWindowInsetsAnimation MediaMetadataCompat;
    public final /* synthetic */ boolean MediaSessionCompatQueueItem;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ Bundle write;

    @Override // java.lang.Runnable
    public final void run() {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(this.serializer, this.IconCompatParcelizer, this.read, this.write, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem);
    }

    public MeasuringIntrinsicsIntrinsicMinMax(NoWindowInsetsAnimation noWindowInsetsAnimation, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.read = j;
        this.write = bundle;
        this.RemoteActionCompatParcelizer = z;
        this.MediaBrowserCompatMediaItem = z2;
        this.MediaSessionCompatQueueItem = z3;
        this.MediaMetadataCompat = noWindowInsetsAnimation;
    }
}
