package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class IntRectCompanion implements IntRectVbeCjmY {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    private static int MediaSessionCompatQueueItem;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final long serializer;
    public final accessgetLOREM_IPSUM_SOURCEp write;

    static {
        TakePictureTaskUiItem$Companion takePictureTaskUiItem$Companion = accessgetLOREM_IPSUM_SOURCEp.Companion;
        int i = MediaDescriptionCompat + 57;
        MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    public IntRectCompanion(String str, String str2, accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep, long j, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = accessgetlorem_ipsum_sourcep;
        this.serializer = j;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer);
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m((this.write.hashCode() + iM) * 31, 31, this.serializer);
        int i4 = MediaMetadataCompat + 123;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 63;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("OpenCamera(screenData=", this.read, ", pictureOutputPath=", this.IconCompatParcelizer, ", item=");
        sbM.append(this.write);
        sbM.append(", deliveryId=");
        sbM.append(this.serializer);
        String strM = d$$ExternalSyntheticOutline0.m(sbM, ", deliveryState=", this.RemoteActionCompatParcelizer, ")");
        int i4 = MediaBrowserCompatMediaItem + 1;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof IntRectCompanion) {
                IntRectCompanion intRectCompanion = (IntRectCompanion) obj;
                Object[] objArr = {this.read, intRectCompanion.read};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr2 = {this.IconCompatParcelizer, intRectCompanion.IconCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || !this.write.equals(intRectCompanion.write) || this.serializer != intRectCompanion.serializer) {
                    return false;
                }
                Object[] objArr3 = {this.RemoteActionCompatParcelizer, intRectCompanion.RemoteActionCompatParcelizer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } else {
                int i5 = i3 + 109;
                MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        int i7 = MediaMetadataCompat + 103;
        MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
