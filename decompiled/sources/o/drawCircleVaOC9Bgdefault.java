package o;

import android.graphics.ImageDecoder;
import android.os.Build;
import androidx.camera.video.Recorder$3;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class drawCircleVaOC9Bgdefault implements getInverseTransform {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Recorder$3 write;

    public /* synthetic */ drawCircleVaOC9Bgdefault(Recorder$3 recorder$3, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = recorder$3;
    }

    @Override // o.getInverseTransform
    public final generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        return this.RemoteActionCompatParcelizer != 0 ? Recorder$3.IconCompatParcelizer(ImageDecoder.createSource((ByteBuffer) obj), i, i2, geteotffuncui_graphics) : Recorder$3.IconCompatParcelizer(ImageDecoder.createSource(DrawScopeMarker.write((InputStream) obj)), i, i2, geteotffuncui_graphics);
    }

    @Override // o.getInverseTransform
    public final boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        Recorder$3 recorder$3 = this.write;
        if (i != 0) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeWrite = resizeToBitmapDimensionslambda3.write((ArrayList) recorder$3.MediaBrowserCompatMediaItem, (ByteBuffer) obj);
            return imageHeaderParser$ImageTypeWrite == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeWrite == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeIconCompatParcelizer = resizeToBitmapDimensionslambda3.IconCompatParcelizer((ArrayList) recorder$3.MediaBrowserCompatMediaItem, (InputStream) obj, (getF) recorder$3.RemoteActionCompatParcelizer);
        return imageHeaderParser$ImageTypeIconCompatParcelizer == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeIconCompatParcelizer == ImageHeaderParser$ImageType.ANIMATED_AVIF);
    }
}
