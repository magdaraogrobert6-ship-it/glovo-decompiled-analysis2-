package o;

import com.huawei.location.logic.E5;

/* JADX INFO: loaded from: classes4.dex */
public final class resetMessageMargins extends hasAlpha {
    public final /* synthetic */ E5 IconCompatParcelizer;
    public final /* synthetic */ getAppropriateImageUrl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resetMessageMargins(getAppropriateImageUrl getappropriateimageurl, E5 e5, DateTimeConverter dateTimeConverter) {
        super(dateTimeConverter);
        this.serializer = getappropriateimageurl;
        this.IconCompatParcelizer = e5;
    }

    @Override // o.hasAlpha, o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        getAppropriateImageUrl getappropriateimageurl = this.serializer;
        E5 e5 = this.IconCompatParcelizer;
        synchronized (getappropriateimageurl) {
            if (e5.read) {
                return;
            }
            e5.read = true;
            super.close();
            ((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.IconCompatParcelizer.IconCompatParcelizer).MediaMetadataCompat();
        }
    }
}
