package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPropertyFillAlpha extends VectorPainterKtRenderVectorGroupconfig2 {
    public final Uri serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public VectorPropertyFillAlpha(Uri uri) {
        uri.getClass();
        this.serializer = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorPropertyFillAlpha)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((VectorPropertyFillAlpha) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ImageSelectionSuccess(uri=" + this.serializer + ')';
    }
}
