package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setTitleMarginTop implements getTitleMarginEnd {
    public final /* synthetic */ getInflatedId IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ setTitleMarginTop(getInflatedId getinflatedid, getInflatedId getinflatedid2, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = getinflatedid2;
    }

    @Override // o.getTitleMarginEnd
    public final void serializer(getTitleTextView gettitletextview) throws Exception {
        int i = this.serializer;
        getInflatedId getinflatedid = this.IconCompatParcelizer;
        if (i != 0) {
            int i2 = androidx.camera.core.ImageProcessingUtil.RemoteActionCompatParcelizer;
            getinflatedid.close();
        } else {
            int i3 = androidx.camera.core.ImageProcessingUtil.RemoteActionCompatParcelizer;
            if (getinflatedid != null) {
                getinflatedid.close();
            }
        }
    }
}
