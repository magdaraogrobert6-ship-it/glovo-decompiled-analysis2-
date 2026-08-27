package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getOnRemoteTriggerListener extends getOnDeeplinkResponseListener {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final enablePlayStoreKidsCompliance IconCompatParcelizer;
    public final enableFirstSessionDelay MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public getOnRemoteTriggerListener(int i, int i2, int i3, int i4, enablePlayStoreKidsCompliance enableplaystorekidscompliance, enableFirstSessionDelay enablefirstsessiondelay) {
        enableplaystorekidscompliance.getClass();
        enablefirstsessiondelay.getClass();
        this.serializer = i;
        this.write = i2;
        this.read = i3;
        this.RemoteActionCompatParcelizer = i4;
        this.IconCompatParcelizer = enableplaystorekidscompliance;
        this.MediaSessionCompatQueueItem = enablefirstsessiondelay;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.read, af$$ExternalSyntheticOutline0.m(this.write, Integer.hashCode(this.serializer) * 31, 31), 31), 31);
        int iHashCode = this.MediaSessionCompatQueueItem.hashCode() + ((this.IconCompatParcelizer.hashCode() + iM) * 31);
        int i4 = MediaDescriptionCompat + 47;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.serializer, this.write, "Error(title=", ", description=", ", buttonLabel=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.read, this.RemoteActionCompatParcelizer, ", image=", ", buttonAction=", sbM);
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", type=");
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 61;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof getOnRemoteTriggerListener)) {
                return false;
            }
            getOnRemoteTriggerListener getonremotetriggerlistener = (getOnRemoteTriggerListener) obj;
            if (this.serializer != getonremotetriggerlistener.serializer) {
                i = MediaMetadataCompat + 117;
            } else if (this.write != getonremotetriggerlistener.write) {
                i = MediaMetadataCompat + 5;
            } else if (this.read != getonremotetriggerlistener.read || this.RemoteActionCompatParcelizer != getonremotetriggerlistener.RemoteActionCompatParcelizer || this.IconCompatParcelizer != getonremotetriggerlistener.IconCompatParcelizer || this.MediaSessionCompatQueueItem != getonremotetriggerlistener.MediaSessionCompatQueueItem) {
                return false;
            }
            MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i % 2;
            return false;
        }
        int i4 = MediaDescriptionCompat + 117;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
