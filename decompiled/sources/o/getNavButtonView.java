package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getNavButtonView {
    public final ArrayList RemoteActionCompatParcelizer;
    public final PreviewPixelHDRnetQuirk read;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        PreviewPixelHDRnetQuirk previewPixelHDRnetQuirk = this.read;
        return (iHashCode * 31) + (previewPixelHDRnetQuirk != null ? previewPixelHDRnetQuirk.hashCode() : 0);
    }

    public final String write() {
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) onContentCardDismissed.read((List) arrayList);
    }

    public getNavButtonView(ArrayList arrayList, PreviewPixelHDRnetQuirk previewPixelHDRnetQuirk) {
        this.RemoteActionCompatParcelizer = arrayList;
        this.read = previewPixelHDRnetQuirk;
        coil3.util.UtilsKt.IconCompatParcelizer("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNavButtonView)) {
            return false;
        }
        getNavButtonView getnavbuttonview = (getNavButtonView) obj;
        if (!this.RemoteActionCompatParcelizer.equals(getnavbuttonview.RemoteActionCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getnavbuttonview.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(onContentCardDismissed.IconCompatParcelizer(this.RemoteActionCompatParcelizer, ",", null, null, null, 62));
        PreviewPixelHDRnetQuirk previewPixelHDRnetQuirk = this.read;
        if (previewPixelHDRnetQuirk != null) {
            str = ", compatId=" + previewPixelHDRnetQuirk;
        } else {
            str = "";
        }
        return ff$$ExternalSyntheticOutline0.m(sb, str, '}');
    }
}
