package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdattOPrCwQAZdC10c20qDtJUliAwE {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final int RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean serializer;
    public final String write;

    public r8lambdattOPrCwQAZdC10c20qDtJUliAwE(String str, String str2, boolean z, boolean z2, String str3, int i) {
        this.MediaBrowserCompatMediaItem = str;
        this.write = str2;
        this.serializer = z;
        this.read = z2;
        this.IconCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 121;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PushEvent(title=", this.MediaBrowserCompatMediaItem, ", message=", this.write, ", isSyncPush=");
        af$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", isPaymentPush=", this.read, ", category=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", notificationSound=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 51;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.MediaBrowserCompatMediaItem;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = MediaSessionCompatQueueItem + 79;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.write;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.serializer), 31, this.read);
        String str3 = this.IconCompatParcelizer;
        if (str3 == null) {
            int i4 = MediaDescriptionCompat + 33;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = str3.hashCode();
        }
        int iHashCode3 = Integer.hashCode(this.RemoteActionCompatParcelizer) + ((iM + iHashCode2) * 31);
        int i6 = MediaSessionCompatQueueItem + 111;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return iHashCode3;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdattOPrCwQAZdC10c20qDtJUliAwE) {
            r8lambdattOPrCwQAZdC10c20qDtJUliAwE r8lambdattoprcwqazdc10c20qdtjuliawe = (r8lambdattOPrCwQAZdC10c20qDtJUliAwE) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, r8lambdattoprcwqazdc10c20qdtjuliawe.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdattoprcwqazdc10c20qdtjuliawe.write}, getCieXyz.write())).booleanValue()) || this.serializer != r8lambdattoprcwqazdc10c20qdtjuliawe.serializer || this.read != r8lambdattoprcwqazdc10c20qdtjuliawe.read) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdattoprcwqazdc10c20qdtjuliawe.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer == r8lambdattoprcwqazdc10c20qdtjuliawe.RemoteActionCompatParcelizer) {
                return true;
            }
            int i2 = MediaSessionCompatQueueItem + 93;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = MediaSessionCompatQueueItem + 39;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
