package o;

/* JADX INFO: loaded from: classes3.dex */
public final class updateTextLayoutResult {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final getLogoDescription IconCompatParcelizer;
    public final String read;
    public final float serializer;

    public updateTextLayoutResult(String str, getLogoDescription getlogodescription, float f) {
        getlogodescription.getClass();
        this.read = str;
        this.IconCompatParcelizer = getlogodescription;
        this.serializer = f;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int iHashCode2 = this.read.hashCode();
            iHashCode = Float.hashCode(this.serializer) << ((this.IconCompatParcelizer.hashCode() % (iHashCode2 << 103)) / 120);
        } else {
            int iHashCode3 = this.read.hashCode();
            iHashCode = Float.hashCode(this.serializer) + ((this.IconCompatParcelizer.hashCode() + (iHashCode3 * 31)) * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 21;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CameraZoomOption(label=" + this.read + ", selector=" + this.IconCompatParcelizer + ", zoomRatio=" + this.serializer + ")";
        int i2 = write + 25;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof updateTextLayoutResult) {
            updateTextLayoutResult updatetextlayoutresult = (updateTextLayoutResult) obj;
            if (this.read.equals(updatetextlayoutresult.read)) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, updatetextlayoutresult.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && Float.compare(this.serializer, updatetextlayoutresult.serializer) == 0;
            }
            i = RemoteActionCompatParcelizer + 19;
        } else {
            i = RemoteActionCompatParcelizer + 81;
        }
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i % 2;
        return false;
    }
}
