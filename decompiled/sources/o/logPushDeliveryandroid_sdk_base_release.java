package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushDeliveryandroid_sdk_base_release extends logPurchase {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final logFeatureFlagImpression read;
    public final Map serializer;
    public final List write;

    public logPushDeliveryandroid_sdk_base_release(String str, String str2, logFeatureFlagImpression logfeatureflagimpression, Map map, List list) {
        logfeatureflagimpression.getClass();
        list.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = logfeatureflagimpression;
        this.serializer = map;
        this.write = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 69;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.IconCompatParcelizer);
        int iHashCode = this.write.hashCode() + IconCompatParcelizer.RemoteActionCompatParcelizer((this.read.hashCode() + iM) * 31, this.serializer, 31);
        int i4 = MediaDescriptionCompat + 61;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return iHashCode;
    }

    public static logPushDeliveryandroid_sdk_base_release RemoteActionCompatParcelizer(logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release, String str, String str2, ArrayList arrayList, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = logpushdeliveryandroid_sdk_base_release.RemoteActionCompatParcelizer;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            int i3 = MediaMetadataCompat + 25;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                str2 = logpushdeliveryandroid_sdk_base_release.IconCompatParcelizer;
                int i4 = 92 / 0;
            } else {
                str2 = logpushdeliveryandroid_sdk_base_release.IconCompatParcelizer;
            }
        }
        String str4 = str2;
        logFeatureFlagImpression logfeatureflagimpression = logpushdeliveryandroid_sdk_base_release.read;
        Map map = logpushdeliveryandroid_sdk_base_release.serializer;
        List list = arrayList;
        if ((i & 16) != 0) {
            int i5 = MediaDescriptionCompat + 125;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                list = logpushdeliveryandroid_sdk_base_release.write;
            } else {
                int i6 = 93 / 0;
                list = logpushdeliveryandroid_sdk_base_release.write;
            }
        }
        List list2 = list;
        logpushdeliveryandroid_sdk_base_release.getClass();
        str4.getClass();
        logfeatureflagimpression.getClass();
        list2.getClass();
        return new logPushDeliveryandroid_sdk_base_release(str3, str4, logfeatureflagimpression, map, list2);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 65;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Available(comment=", this.RemoteActionCompatParcelizer, ", draftComment=", this.IconCompatParcelizer, ", selectedScore=");
        sbM.append(this.read);
        sbM.append(", scores=");
        sbM.append(this.serializer);
        sbM.append(", tags=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.write, ")");
        int i4 = MediaDescriptionCompat + 25;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 99;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logPushDeliveryandroid_sdk_base_release)) {
            return false;
        }
        logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release = (logPushDeliveryandroid_sdk_base_release) obj;
        if (!this.RemoteActionCompatParcelizer.equals(logpushdeliveryandroid_sdk_base_release.RemoteActionCompatParcelizer) || !this.IconCompatParcelizer.equals(logpushdeliveryandroid_sdk_base_release.IconCompatParcelizer)) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, logpushdeliveryandroid_sdk_base_release.read}, getCieXyz.write())).booleanValue()) {
            if (!this.serializer.equals(logpushdeliveryandroid_sdk_base_release.serializer)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, logpushdeliveryandroid_sdk_base_release.write}, getCieXyz.write())).booleanValue();
        }
        int i4 = MediaDescriptionCompat + 23;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
