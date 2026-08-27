package coil3.compose;

import androidx.compose.ui.graphics.painter.Painter;
import o.dashPathEffectdefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePainter$State$Loading implements dashPathEffectdefault {
    private final Painter painter;

    @Override // o.dashPathEffectdefault
    public final Painter serializer() {
        return this.painter;
    }

    public AsyncImagePainter$State$Loading(Painter painter) {
        this.painter = painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Loading)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.painter, ((AsyncImagePainter$State$Loading) obj).painter}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Painter painter = this.painter;
        if (painter == null) {
            return 0;
        }
        return painter.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.painter + ")";
    }
}
