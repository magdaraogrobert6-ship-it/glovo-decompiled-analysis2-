package o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class computeWhitePoint {
    public final Executor IconCompatParcelizer;
    public final com.bumptech.glide.request.SingleRequest write;

    public final int hashCode() {
        return this.write.hashCode();
    }

    public computeWhitePoint(com.bumptech.glide.request.SingleRequest singleRequest, Executor executor) {
        this.write = singleRequest;
        this.IconCompatParcelizer = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof computeWhitePoint) && this.write == ((computeWhitePoint) obj).write;
    }
}
