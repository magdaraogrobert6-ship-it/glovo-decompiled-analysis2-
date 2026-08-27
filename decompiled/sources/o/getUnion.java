package o;

/* JADX INFO: loaded from: classes.dex */
public final class getUnion extends isWebp {
    @Override // o.HttpUrlFetcher
    public final DateTimeConverter write(RecyclableBufferedInputStream recyclableBufferedInputStream, boolean z) {
        RecyclableBufferedInputStream recyclableBufferedInputStreamIconCompatParcelizer = recyclableBufferedInputStream.IconCompatParcelizer();
        if (recyclableBufferedInputStreamIconCompatParcelizer != null) {
            RemoteActionCompatParcelizer(recyclableBufferedInputStreamIconCompatParcelizer);
        }
        return this.IconCompatParcelizer.write(recyclableBufferedInputStream, z);
    }

    public getUnion(HttpUrlFetcher httpUrlFetcher) {
        super(httpUrlFetcher);
    }
}
