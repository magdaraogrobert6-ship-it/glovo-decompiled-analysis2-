package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class Clipboard extends ClipMetadata {
    public int RemoteActionCompatParcelizer = 0;
    public final /* synthetic */ getClipMetadata read;
    public final int serializer;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer < this.serializer;
    }

    @Override // o.ClipMetadata
    public final byte serializer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i < this.serializer) {
            this.RemoteActionCompatParcelizer = i + 1;
            return this.read.serializer(i);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return (byte) 0;
    }

    public Clipboard(getClipMetadata getclipmetadata) {
        this.read = getclipmetadata;
        this.serializer = getclipmetadata.RatingCompat();
    }
}
