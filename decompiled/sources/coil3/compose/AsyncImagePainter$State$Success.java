package coil3.compose;

import androidx.compose.ui.graphics.painter.Painter;
import o.dashPathEffectdefault;
import o.getCieXyz;
import o.getColor0d7_KjUannotations;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePainter$State$Success implements dashPathEffectdefault {
    public final getColor0d7_KjUannotations IconCompatParcelizer;
    private final Painter painter;

    @Override // o.dashPathEffectdefault
    public final Painter serializer() {
        return this.painter;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.painter.hashCode() * 31);
    }

    public AsyncImagePainter$State$Success(Painter painter, getColor0d7_KjUannotations getcolor0d7_kjuannotations) {
        this.painter = painter;
        this.IconCompatParcelizer = getcolor0d7_kjuannotations;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Success)) {
            return false;
        }
        AsyncImagePainter$State$Success asyncImagePainter$State$Success = (AsyncImagePainter$State$Success) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.painter, asyncImagePainter$State$Success.painter}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer.equals(asyncImagePainter$State$Success.IconCompatParcelizer);
    }

    public final String toString() {
        return "Success(painter=" + this.painter + ", result=" + this.IconCompatParcelizer + ")";
    }
}
