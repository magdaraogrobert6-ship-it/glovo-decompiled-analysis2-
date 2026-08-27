package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getContentInsetEndWithActions {
    public final boolean IconCompatParcelizer;
    public final ImageCapture1 RemoteActionCompatParcelizer;
    public final int read;
    public final android.graphics.Rect serializer;
    public final android.util.Size write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        ImageCapture1 imageCapture1 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = imageCapture1 == null ? 0 : imageCapture1.hashCode();
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ this.read) * 1000003) ^ (this.IconCompatParcelizer ? 1231 : 1237);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getContentInsetEndWithActions)) {
            return false;
        }
        getContentInsetEndWithActions getcontentinsetendwithactions = (getContentInsetEndWithActions) obj;
        if (!this.write.equals(getcontentinsetendwithactions.write) || !this.serializer.equals(getcontentinsetendwithactions.serializer)) {
            return false;
        }
        ImageCapture1 imageCapture1 = getcontentinsetendwithactions.RemoteActionCompatParcelizer;
        ImageCapture1 imageCapture2 = this.RemoteActionCompatParcelizer;
        if (imageCapture2 == null) {
            if (imageCapture1 != null) {
                return false;
            }
        } else if (!imageCapture2.equals(imageCapture1)) {
            return false;
        }
        return this.read == getcontentinsetendwithactions.read && this.IconCompatParcelizer == getcontentinsetendwithactions.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.write);
        sb.append(", inputCropRect=");
        sb.append(this.serializer);
        sb.append(", cameraInternal=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", rotationDegrees=");
        sb.append(this.read);
        sb.append(", mirroring=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, "}");
    }

    public getContentInsetEndWithActions(android.util.Size size, android.graphics.Rect rect, ImageCapture1 imageCapture1, int i, boolean z) {
        if (size == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null inputSize");
            throw null;
        }
        this.write = size;
        if (rect == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null inputCropRect");
            throw null;
        }
        this.serializer = rect;
        this.RemoteActionCompatParcelizer = imageCapture1;
        this.read = i;
        this.IconCompatParcelizer = z;
    }
}
