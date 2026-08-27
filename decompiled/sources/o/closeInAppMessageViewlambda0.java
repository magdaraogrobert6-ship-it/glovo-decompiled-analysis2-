package o;

/* JADX INFO: loaded from: classes4.dex */
public final class closeInAppMessageViewlambda0 extends closeInAppMessageViewlambda2 {
    public boolean MediaBrowserCompatMediaItem;
    public Object MediaSessionCompatQueueItem;
    public int RatingCompat;
    public final closeInAppMessageViewlambda3 read;

    /* JADX WARN: Illegal instructions before constructor call */
    public closeInAppMessageViewlambda0(closeInAppMessageViewlambda3 closeinappmessageviewlambda3) {
        Object obj = closeinappmessageviewlambda3.serializer;
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = closeinappmessageviewlambda3.read;
        super(obj, r8lambdayvdweaikwvq_ojtermd5bm8okkq, 0);
        this.read = closeinappmessageviewlambda3;
        this.RatingCompat = r8lambdayvdweaikwvq_ojtermd5bm8okkq.RemoteActionCompatParcelizer;
    }

    @Override // o.closeInAppMessageViewlambda2, java.util.Iterator
    public final Object next() {
        if (this.read.read.RemoteActionCompatParcelizer != this.RatingCompat) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return null;
        }
        Object next = super.next();
        this.MediaSessionCompatQueueItem = next;
        this.MediaBrowserCompatMediaItem = true;
        return next;
    }

    @Override // o.closeInAppMessageViewlambda2, java.util.Iterator
    public final void remove() {
        if (!this.MediaBrowserCompatMediaItem) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        Object obj = this.MediaSessionCompatQueueItem;
        closeInAppMessageViewlambda3 closeinappmessageviewlambda3 = this.read;
        pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(closeinappmessageviewlambda3).remove(obj);
        this.MediaSessionCompatQueueItem = null;
        this.MediaBrowserCompatMediaItem = false;
        this.RatingCompat = closeinappmessageviewlambda3.read.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer--;
    }
}
