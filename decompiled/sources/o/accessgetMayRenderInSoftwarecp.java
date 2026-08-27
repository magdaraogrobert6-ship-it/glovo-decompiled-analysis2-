package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMayRenderInSoftwarecp extends isPlacementApproachInProgress {
    public final Uri serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public accessgetMayRenderInSoftwarecp(Uri uri) {
        this.serializer = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof accessgetMayRenderInSoftwarecp) && this.serializer.equals(((accessgetMayRenderInSoftwarecp) obj).serializer);
    }

    public final String toString() {
        return "NativeChooser(photoUri=" + this.serializer + ')';
    }
}
