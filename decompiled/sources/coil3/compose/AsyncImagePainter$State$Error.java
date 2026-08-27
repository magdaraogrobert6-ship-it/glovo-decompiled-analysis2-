package coil3.compose;

import androidx.compose.ui.graphics.painter.Painter;
import o.ImageShaderF49vj9s;
import o.dashPathEffectdefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePainter$State$Error implements dashPathEffectdefault {
    private final Painter painter;
    public final ImageShaderF49vj9s serializer;

    @Override // o.dashPathEffectdefault
    public final Painter serializer() {
        return this.painter;
    }

    public static AsyncImagePainter$State$Error write(AsyncImagePainter$State$Error asyncImagePainter$State$Error, Painter painter) {
        ImageShaderF49vj9s imageShaderF49vj9s = asyncImagePainter$State$Error.serializer;
        asyncImagePainter$State$Error.getClass();
        return new AsyncImagePainter$State$Error(painter, imageShaderF49vj9s);
    }

    public AsyncImagePainter$State$Error(Painter painter, ImageShaderF49vj9s imageShaderF49vj9s) {
        this.painter = painter;
        this.serializer = imageShaderF49vj9s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Error)) {
            return false;
        }
        AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.painter, asyncImagePainter$State$Error.painter}, getCieXyz.write())).booleanValue() && this.serializer.equals(asyncImagePainter$State$Error.serializer);
    }

    public final int hashCode() {
        Painter painter = this.painter;
        return this.serializer.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.painter + ", result=" + this.serializer + ")";
    }
}
