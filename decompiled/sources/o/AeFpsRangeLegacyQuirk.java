package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class AeFpsRangeLegacyQuirk extends Camera2DeviceSurfaceManager {
    public final int RemoteActionCompatParcelizer = 1;
    public final ZoomControl read = ZoomControl.IMAGE_FORMAT;

    @Override // o.Camera2DeviceSurfaceManager
    public final ZoomControl write() {
        return this.read;
    }

    public final String toString() {
        String strM;
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            strM = "JPEG";
        } else if (i != 1) {
            strM = m1$$ExternalSyntheticOutline0.m("UNDEFINED(", i, ')');
        } else {
            strM = "JPEG_R";
        }
        return ff$$ExternalSyntheticOutline0.m(sb, strM, ')');
    }
}
