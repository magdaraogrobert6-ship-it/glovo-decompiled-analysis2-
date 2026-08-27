package o;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class CanvasDrawScopeKt implements getInverseTransform {
    public final drawPathGBMwjPUdefault read;
    public final /* synthetic */ int serializer;

    @Override // o.getInverseTransform
    public final generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        int i3 = this.serializer;
        drawPathGBMwjPUdefault drawpathgbmwjpudefault = this.read;
        return i3 != 0 ? drawpathgbmwjpudefault.serializer(ImageDecoder.createSource(DrawScopeMarker.write((InputStream) obj)), i, i2, geteotffuncui_graphics) : drawpathgbmwjpudefault.serializer(ImageDecoder.createSource((ByteBuffer) obj), i, i2, geteotffuncui_graphics);
    }

    public CanvasDrawScopeKt(int i) {
        this.serializer = i;
        if (i != 1) {
            this.read = new drawPathGBMwjPUdefault();
        } else {
            this.read = new drawPathGBMwjPUdefault();
        }
    }

    @Override // o.getInverseTransform
    public final /* bridge */ /* synthetic */ boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) {
        if (this.serializer != 0) {
            return true;
        }
        return true;
    }
}
