package o;

/* JADX INFO: loaded from: classes.dex */
public final class getXorannotations implements AutoCloseable {
    public final getUnionannotations RemoteActionCompatParcelizer;
    public final /* synthetic */ getReverseDifferenceannotations serializer;
    public boolean write;

    public getXorannotations(getReverseDifferenceannotations getreversedifferenceannotations, getUnionannotations getunionannotations) {
        this.serializer = getreversedifferenceannotations;
        this.RemoteActionCompatParcelizer = getunionannotations;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.write) {
            return;
        }
        this.write = true;
        getReverseDifferenceannotations getreversedifferenceannotations = this.serializer;
        synchronized (getreversedifferenceannotations.PlaybackStateCompat) {
            getUnionannotations getunionannotations = this.RemoteActionCompatParcelizer;
            int i = getunionannotations.MediaMetadataCompat - 1;
            getunionannotations.MediaMetadataCompat = i;
            if (i == 0 && getunionannotations.MediaBrowserCompatMediaItem) {
                getreversedifferenceannotations.serializer(getunionannotations);
            }
        }
    }
}
