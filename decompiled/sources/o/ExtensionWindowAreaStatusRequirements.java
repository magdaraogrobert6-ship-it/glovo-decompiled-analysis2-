package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtensionWindowAreaStatusRequirements {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final float IconCompatParcelizer;
    public final long MediaDescriptionCompat;
    public final float RemoteActionCompatParcelizer;
    public final double read;
    public final double serializer;
    public final float write;

    public ExtensionWindowAreaStatusRequirements(double d, double d2, float f, float f2, float f3, long j) {
        this.serializer = d;
        this.read = d2;
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.write = f3;
        this.MediaDescriptionCompat = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 17;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.MediaDescriptionCompat) + af$$ExternalSyntheticOutline1.m(this.write, af$$ExternalSyntheticOutline1.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline1.m(this.IconCompatParcelizer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, Double.hashCode(this.serializer) * 31, 31), 31), 31), 31);
        int i4 = MediaSessionCompatQueueItem + 117;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 109;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.serializer, "Location(latitude=", ", longitude=");
        sbM.append(this.read);
        sbM.append(", accuracy=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", bearing=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", speed=");
        sbM.append(this.write);
        sbM.append(", time=");
        sbM.append(this.MediaDescriptionCompat);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 83;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof ExtensionWindowAreaStatusRequirements) {
                ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements = (ExtensionWindowAreaStatusRequirements) obj;
                if (Double.compare(this.serializer, extensionWindowAreaStatusRequirements.serializer) == 0) {
                    if (Double.compare(this.read, extensionWindowAreaStatusRequirements.read) != 0 || Float.compare(this.IconCompatParcelizer, extensionWindowAreaStatusRequirements.IconCompatParcelizer) != 0 || Float.compare(this.RemoteActionCompatParcelizer, extensionWindowAreaStatusRequirements.RemoteActionCompatParcelizer) != 0) {
                        return false;
                    }
                    if (Float.compare(this.write, extensionWindowAreaStatusRequirements.write) != 0) {
                        int i2 = MediaBrowserCompatMediaItem + 59;
                        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    if (this.MediaDescriptionCompat == extensionWindowAreaStatusRequirements.MediaDescriptionCompat) {
                        return true;
                    }
                    int i4 = MediaBrowserCompatMediaItem + 35;
                    MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        int i5 = 90 / 0;
                    }
                    return false;
                }
                int i6 = MediaBrowserCompatMediaItem + 121;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = MediaBrowserCompatMediaItem;
            int i9 = i8 + 67;
            MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            int i11 = i8 + 69;
            MediaSessionCompatQueueItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i12 = MediaSessionCompatQueueItem + 65;
        MediaBrowserCompatMediaItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return true;
    }
}
