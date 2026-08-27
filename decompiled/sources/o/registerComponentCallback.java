package o;

/* JADX INFO: loaded from: classes.dex */
public final class registerComponentCallback implements Runnable {
    public final /* synthetic */ accessunregisterComponentCallback write;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.write.MediaMetadataCompat) {
            obj = this.write.PlaybackStateCompatCustomAction;
            this.write.PlaybackStateCompatCustomAction = accessunregisterComponentCallback.MediaSessionCompatQueueItem;
        }
        this.write.RemoteActionCompatParcelizer(obj);
    }

    public registerComponentCallback(accessunregisterComponentCallback accessunregistercomponentcallback) {
        this.write = accessunregistercomponentcallback;
    }
}
