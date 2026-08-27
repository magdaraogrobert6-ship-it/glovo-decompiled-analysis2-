package o;

/* JADX INFO: loaded from: classes2.dex */
public final class takeOrElseoyDd2qo {
    public final android.graphics.Paint MediaBrowserCompatMediaItem;
    public final android.graphics.Paint MediaDescriptionCompat;
    public final android.graphics.Path MediaMetadataCompat = new android.graphics.Path();
    public int MediaSessionCompatQueueItem;
    public final android.graphics.Paint MediaSessionCompatToken;
    public int PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public final android.graphics.Paint serializer;
    public static final int[] read = new int[3];
    public static final float[] RemoteActionCompatParcelizer = {0.0f, 0.5f, 1.0f};
    public static final int[] IconCompatParcelizer = new int[4];
    public static final float[] write = {0.0f, 0.0f, 0.5f, 1.0f};

    public final void serializer(int i) {
        this.PlaybackStateCompatCustomAction = setPrevious.write(i, 68);
        this.MediaSessionCompatQueueItem = setPrevious.write(i, 20);
        this.RatingCompat = setPrevious.write(i, 0);
        this.MediaBrowserCompatMediaItem.setColor(this.PlaybackStateCompatCustomAction);
    }

    public takeOrElseoyDd2qo() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.MediaSessionCompatToken = paint;
        this.MediaBrowserCompatMediaItem = new android.graphics.Paint();
        serializer(-16777216);
        paint.setColor(0);
        android.graphics.Paint paint2 = new android.graphics.Paint(4);
        this.serializer = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.MediaDescriptionCompat = new android.graphics.Paint(paint2);
    }
}
