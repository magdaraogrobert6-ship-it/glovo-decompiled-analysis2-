package o;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetState extends accessgetSlotReusePolicyp {
    public static final RectF serializer = new RectF();
    public final float IconCompatParcelizer;
    public final float MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public final float RemoteActionCompatParcelizer;
    public final float read;
    public float write;

    @Override // o.accessgetSlotReusePolicyp
    public final void serializer(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.MediaBrowserCompatMediaItem;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.RemoteActionCompatParcelizer;
        float f2 = this.IconCompatParcelizer;
        RectF rectF = serializer;
        rectF.set(this.read, this.MediaMetadataCompat, f, f2);
        path.arcTo(rectF, this.write, this.MediaSessionCompatQueueItem, false);
        path.transform(matrix);
    }

    public accessgetState(float f, float f2, float f3, float f4) {
        this.read = f;
        this.MediaMetadataCompat = f2;
        this.RemoteActionCompatParcelizer = f3;
        this.IconCompatParcelizer = f4;
    }
}
