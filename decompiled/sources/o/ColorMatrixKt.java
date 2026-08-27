package o;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class ColorMatrixKt {
    public float ComponentActivity;
    public final android.graphics.Paint IconCompatParcelizer;
    public int[] MediaBrowserCompatMediaItem;
    public final android.graphics.Paint MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public float MediaSessionCompatToken;
    public float ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public final android.graphics.Paint PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public float ResultReceiver;
    public float r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public float r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public float r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final RectF r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new RectF();
    public int read;
    public float serializer;
    public android.graphics.Path write;

    public final void read(int i) {
        this.MediaMetadataCompat = i;
        this.RatingCompat = this.MediaBrowserCompatMediaItem[i];
    }

    public ColorMatrixKt() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.PlaybackStateCompatCustomAction = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.IconCompatParcelizer = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.MediaDescriptionCompat = paint3;
        this.ResultReceiver = 0.0f;
        this.MediaSessionCompatToken = 0.0f;
        this.ParcelableVolumeInfo = 0.0f;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 5.0f;
        this.serializer = 1.0f;
        this.RemoteActionCompatParcelizer = 255;
        paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }
}
