package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PartialGapBufferCompanion {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final transformedToOriginal serializer;
    public final List write;

    public PartialGapBufferCompanion(String str, String str2, String str3, List list, transformedToOriginal transformedtooriginal) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.write = list;
        this.serializer = transformedtooriginal;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.write, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31);
        transformedToOriginal transformedtooriginal = this.serializer;
        if (transformedtooriginal == null) {
            int i2 = MediaMetadataCompat + 55;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = transformedtooriginal.hashCode();
        }
        int i4 = iM + iHashCode;
        int i5 = MediaMetadataCompat + 75;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 1;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RemoteReportSheet(title=", this.read, ", description=", this.IconCompatParcelizer, ", actionTitle=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.RemoteActionCompatParcelizer, ", reasons=", this.write, ", blockRiderOption=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 19;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 33;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof PartialGapBufferCompanion)) {
                return false;
            }
            PartialGapBufferCompanion partialGapBufferCompanion = (PartialGapBufferCompanion) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, partialGapBufferCompanion.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, partialGapBufferCompanion.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, partialGapBufferCompanion.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || !this.write.equals(partialGapBufferCompanion.write)) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, partialGapBufferCompanion.serializer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } else {
                int i4 = MediaMetadataCompat + 87;
                MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return false;
                }
                int i5 = 2 / 3;
                return false;
            }
        }
        return true;
    }
}
