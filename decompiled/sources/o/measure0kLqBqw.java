package o;

/* JADX INFO: loaded from: classes.dex */
public final class measure0kLqBqw {
    public androidx.compose.ui.graphics.ImageBitmap serializer = null;
    public androidx.compose.ui.graphics.Canvas IconCompatParcelizer = null;
    public androidx.compose.ui.graphics.drawscope.CanvasDrawScope read = null;
    public androidx.compose.ui.graphics.Path write = null;

    public final androidx.compose.ui.graphics.Path RemoteActionCompatParcelizer() {
        androidx.compose.ui.graphics.Path path = this.write;
        if (path != null) {
            return path;
        }
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        this.write = Path;
        return Path;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof measure0kLqBqw)) {
            return false;
        }
        measure0kLqBqw measure0klqbqw = (measure0kLqBqw) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, measure0klqbqw.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, measure0klqbqw.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, measure0klqbqw.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, measure0klqbqw.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.serializer + ", canvas=" + this.IconCompatParcelizer + ", canvasDrawScope=" + this.read + ", borderPath=" + this.write + ')';
    }

    public final int hashCode() {
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = this.serializer;
        int iHashCode = imageBitmap == null ? 0 : imageBitmap.hashCode();
        androidx.compose.ui.graphics.Canvas canvas = this.IconCompatParcelizer;
        int iHashCode2 = canvas == null ? 0 : canvas.hashCode();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = this.read;
        int iHashCode3 = canvasDrawScope == null ? 0 : canvasDrawScope.hashCode();
        androidx.compose.ui.graphics.Path path = this.write;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (path != null ? path.hashCode() : 0);
    }
}
