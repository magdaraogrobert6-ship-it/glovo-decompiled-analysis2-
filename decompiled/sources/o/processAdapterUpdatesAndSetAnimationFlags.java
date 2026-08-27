package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class processAdapterUpdatesAndSetAnimationFlags {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public processAdapterUpdatesAndSetAnimationFlags(String str, String str2, String str3, String str4, String str5) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.serializer = str3;
        this.read = str4;
        this.write = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 65;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("InAppNotificationAnalyticsData(messageId=", this.RemoteActionCompatParcelizer, ", campaignId=", this.IconCompatParcelizer, ", executionId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", templateId=", this.read, ", notificationId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.write, ")");
        int i4 = MediaMetadataCompat + 87;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 9;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.serializer), 31, this.read);
        int i4 = MediaMetadataCompat + 13;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof processAdapterUpdatesAndSetAnimationFlags) {
                processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags = (processAdapterUpdatesAndSetAnimationFlags) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, processadapterupdatesandsetanimationflags.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, processadapterupdatesandsetanimationflags.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    int i2 = MediaDescriptionCompat + 123;
                    MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 != 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, processadapterupdatesandsetanimationflags.serializer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, processadapterupdatesandsetanimationflags.read}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, processadapterupdatesandsetanimationflags.write}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i3 = MediaDescriptionCompat + 11;
                MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = MediaMetadataCompat + 47;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = MediaDescriptionCompat + 123;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
