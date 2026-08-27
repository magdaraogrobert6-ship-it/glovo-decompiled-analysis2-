package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class GraphicsLayerV29 extends isPlacementApproachInProgress {
    public final Uri serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public GraphicsLayerV29(Uri uri) {
        this.serializer = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GraphicsLayerV29) && this.serializer.equals(((GraphicsLayerV29) obj).serializer);
    }

    public final String toString() {
        return "CAMERA(photoUri=" + this.serializer + ')';
    }
}
