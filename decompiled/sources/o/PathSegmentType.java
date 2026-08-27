package o;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class PathSegmentType implements toSvgdefault {
    public final Bitmap read;

    public PathSegmentType(Bitmap bitmap) {
        this.read = bitmap;
    }

    @Override // o.toSvgdefault
    public final Object fetch(getBuffer getbuffer) {
        return new getWaAFU9c(new accessiteratorjd(this.read), false, getSegmentdefault.MEMORY);
    }
}
