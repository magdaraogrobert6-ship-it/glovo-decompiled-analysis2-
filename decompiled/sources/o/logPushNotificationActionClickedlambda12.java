package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushNotificationActionClickedlambda12 extends logPushNotificationActionClickedlambda11 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public logPushNotificationActionClickedlambda12(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.read = str;
        this.write = str2;
        this.serializer = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.write);
        int i4 = RemoteActionCompatParcelizer + 105;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PolicyWithLinkViewEntity(text=", this.read, ", hyperLinkText=", this.write, ", url="), this.serializer, ")");
        int i4 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 77 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof logPushNotificationActionClickedlambda12) {
            logPushNotificationActionClickedlambda12 logpushnotificationactionclickedlambda12 = (logPushNotificationActionClickedlambda12) obj;
            Object[] objArr = {this.read, logpushnotificationactionclickedlambda12.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                i = RemoteActionCompatParcelizer + 109;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else if (this.write.equals(logpushnotificationactionclickedlambda12.write)) {
                Object[] objArr2 = {this.serializer, logpushnotificationactionclickedlambda12.serializer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            } else {
                i = IconCompatParcelizer + 53;
                RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i5 = i % 2;
        }
        return false;
    }
}
