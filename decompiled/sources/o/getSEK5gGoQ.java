package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getSEK5gGoQ extends getSleepEK5gGoQ {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getSoftRightEK5gGoQ RemoteActionCompatParcelizer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getSEK5gGoQ(getSoftRightEK5gGoQ getsoftrightek5ggoq, String str, int i) {
        super(getsoftrightek5ggoq, true);
        this.IconCompatParcelizer = i;
        this.write = str;
        this.RemoteActionCompatParcelizer = getsoftrightek5ggoq;
    }

    @Override // o.getSleepEK5gGoQ
    public final void zza() {
        if (this.IconCompatParcelizer != 0) {
            getProgramRedEK5gGoQ getprogramredek5ggoq = this.RemoteActionCompatParcelizer.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq);
            getprogramredek5ggoq.endAdUnitExposure(this.write, this.MediaMetadataCompat);
        } else {
            getProgramRedEK5gGoQ getprogramredek5ggoq2 = this.RemoteActionCompatParcelizer.MediaDescriptionCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getprogramredek5ggoq2);
            getprogramredek5ggoq2.beginAdUnitExposure(this.write, this.MediaMetadataCompat);
        }
    }
}
