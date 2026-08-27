package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessxyPrimaries implements Runnable {
    public final com.bumptech.glide.request.SingleRequest IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ accessisSrgb read;

    public /* synthetic */ accessxyPrimaries(accessisSrgb accessissrgb, com.bumptech.glide.request.SingleRequest singleRequest, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = accessissrgb;
        this.IconCompatParcelizer = singleRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.RemoteActionCompatParcelizer == 0) {
            com.bumptech.glide.request.SingleRequest singleRequest = this.IconCompatParcelizer;
            singleRequest.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer();
            synchronized (singleRequest.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                synchronized (this.read) {
                    if (this.read.write.RemoteActionCompatParcelizer.contains(new computeWhitePoint(this.IconCompatParcelizer, DrawTransformKt.write))) {
                        accessisSrgb accessissrgb = this.read;
                        com.bumptech.glide.request.SingleRequest singleRequest2 = this.IconCompatParcelizer;
                        accessissrgb.getClass();
                        try {
                            singleRequest2.IconCompatParcelizer(accessissrgb.MediaBrowserCompatMediaItem, 5);
                        } catch (Throwable th) {
                            throw new com.bumptech.glide.load.engine.CallbackException(th);
                        }
                    }
                    this.read.RemoteActionCompatParcelizer();
                }
            }
            return;
        }
        com.bumptech.glide.request.SingleRequest singleRequest3 = this.IconCompatParcelizer;
        singleRequest3.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer();
        synchronized (singleRequest3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            synchronized (this.read) {
                if (this.read.write.RemoteActionCompatParcelizer.contains(new computeWhitePoint(this.IconCompatParcelizer, DrawTransformKt.write))) {
                    this.read.MediaMetadataCompat.serializer();
                    accessisSrgb accessissrgb2 = this.read;
                    com.bumptech.glide.request.SingleRequest singleRequest4 = this.IconCompatParcelizer;
                    accessissrgb2.getClass();
                    try {
                        singleRequest4.write(accessissrgb2.MediaMetadataCompat, accessissrgb2.read);
                        this.read.serializer(this.IconCompatParcelizer);
                    } catch (Throwable th2) {
                        throw new com.bumptech.glide.load.engine.CallbackException(th2);
                    }
                }
                this.read.RemoteActionCompatParcelizer();
            }
        }
    }
}
