package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getCollapseContentDescription {
    public final int IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final android.graphics.Matrix RemoteActionCompatParcelizer;
    public final int read;
    public final android.graphics.Rect serializer;
    public final boolean write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int i = this.IconCompatParcelizer;
        int i2 = this.read;
        int i3 = this.write ? 1231 : 1237;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003) ^ (this.MediaBrowserCompatMediaItem ? 1231 : 1237);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getCollapseContentDescription)) {
            return false;
        }
        getCollapseContentDescription getcollapsecontentdescription = (getCollapseContentDescription) obj;
        return this.serializer.equals(getcollapsecontentdescription.serializer) && this.IconCompatParcelizer == getcollapsecontentdescription.IconCompatParcelizer && this.read == getcollapsecontentdescription.read && this.write == getcollapsecontentdescription.write && this.RemoteActionCompatParcelizer.equals(getcollapsecontentdescription.RemoteActionCompatParcelizer) && this.MediaBrowserCompatMediaItem == getcollapsecontentdescription.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.serializer);
        sb.append(", getRotationDegrees=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", getTargetRotation=");
        sb.append(this.read);
        sb.append(", hasCameraTransform=");
        sb.append(this.write);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isMirroring=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaBrowserCompatMediaItem, "}");
    }

    public getCollapseContentDescription(android.graphics.Rect rect, int i, int i2, boolean z, android.graphics.Matrix matrix, boolean z2) {
        if (rect == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null getCropRect");
            throw null;
        }
        this.serializer = rect;
        this.IconCompatParcelizer = i;
        this.read = i2;
        this.write = z;
        if (matrix == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null getSensorToBufferTransform");
            throw null;
        }
        this.RemoteActionCompatParcelizer = matrix;
        this.MediaBrowserCompatMediaItem = z2;
    }
}
