package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushNotificationOpenedlambda32 extends logPushNotificationActionClickedlambda11 {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public logPushNotificationOpenedlambda32(String str, String str2, String str3, String str4) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("SelectedEquipmentViewEntity(title=", this.write, ", buttonText=", this.IconCompatParcelizer, ", vehicle="), this.read, ", bag=", this.RemoteActionCompatParcelizer, ")");
            int i3 = MediaMetadataCompat + 23;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 3 / 0;
            }
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("SelectedEquipmentViewEntity(title=", this.write, ", buttonText=", this.IconCompatParcelizer, ", vehicle="), this.read, ", bag=", this.RemoteActionCompatParcelizer, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.read);
        int i4 = serializer + 67;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 87;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logPushNotificationOpenedlambda32)) {
            return false;
        }
        logPushNotificationOpenedlambda32 logpushnotificationopenedlambda32 = (logPushNotificationOpenedlambda32) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, logpushnotificationopenedlambda32.write}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, logpushnotificationopenedlambda32.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, logpushnotificationopenedlambda32.read}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, logpushnotificationopenedlambda32.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
            }
            int i4 = MediaMetadataCompat + 113;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
            }
            return false;
        }
        int i6 = serializer + 99;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
