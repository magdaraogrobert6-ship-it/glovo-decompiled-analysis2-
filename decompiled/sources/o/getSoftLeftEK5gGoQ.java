package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class getSoftLeftEK5gGoQ extends getSleepEK5gGoQ {
    public final /* synthetic */ Bundle IconCompatParcelizer;
    public final /* synthetic */ getSoftRightEK5gGoQ MediaBrowserCompatMediaItem;
    public final /* synthetic */ boolean RatingCompat;
    public final /* synthetic */ Long RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSoftLeftEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(getsoftrightek5ggoq, true);
        this.RemoteActionCompatParcelizer = l;
        this.read = str;
        this.serializer = str2;
        this.IconCompatParcelizer = bundle;
        this.write = z;
        this.RatingCompat = z2;
        this.MediaBrowserCompatMediaItem = getsoftrightek5ggoq;
    }

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        Long l = this.RemoteActionCompatParcelizer;
        long jLongValue = l == null ? this.MediaSessionCompatQueueItem : l.longValue();
        getProgramRedEK5gGoQ getprogramredek5ggoq = this.MediaBrowserCompatMediaItem.MediaDescriptionCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
        getprogramredek5ggoq.logEvent(this.read, this.serializer, this.IconCompatParcelizer, this.write, this.RatingCompat, jLongValue);
    }
}
