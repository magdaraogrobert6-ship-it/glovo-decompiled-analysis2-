package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetIcsp implements getTextAfterSelection {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final InAppCameraOverlay RemoteActionCompatParcelizer;
    public final String read;
    public final boolean serializer;

    public accessgetIcsp(String str, InAppCameraOverlay.Tags tags, boolean z) {
        tags.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = tags;
        this.serializer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int iHashCode2 = Boolean.hashCode(this.serializer) + ((this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
        int i4 = write + 79;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("OpenCamera(outputFilePath=");
        sb.append(this.read);
        sb.append(", overlay=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", enableZoomControl=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.serializer, ")");
        int i2 = write + 119;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetIcsp)) {
            return false;
        }
        accessgetIcsp accessgeticsp = (accessgetIcsp) obj;
        if (this.read.equals(accessgeticsp.read)) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, accessgeticsp.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return this.serializer == accessgeticsp.serializer;
            }
            i = write + 55;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = IconCompatParcelizer + 55;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i3 = i % 2;
        return false;
    }
}
