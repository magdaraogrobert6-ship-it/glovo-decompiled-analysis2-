package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class drawPath {
    public final android.graphics.Path IconCompatParcelizer;
    public final float MediaBrowserCompatMediaItem;
    public final drawImageRectHPBpro0 RemoteActionCompatParcelizer;
    public final float[] write;

    public abstract drawRawPointsO7TthRY RemoteActionCompatParcelizer(float[] fArr, int i);

    public abstract int serializer(boolean z);

    public abstract boolean write();

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public drawPath(android.graphics.Path path, drawImageRectHPBpro0 drawimagerecthpbpro0, float f) {
        path.getClass();
        drawimagerecthpbpro0.getClass();
        this.IconCompatParcelizer = path;
        this.RemoteActionCompatParcelizer = drawimagerecthpbpro0;
        this.MediaBrowserCompatMediaItem = f;
        this.write = new float[8];
    }
}
