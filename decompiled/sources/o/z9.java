package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class z9 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final ArrayList IconCompatParcelizer;
    public final zgExternalSyntheticLambda11 RemoteActionCompatParcelizer;
    public final DateTime read;
    public final String serializer;
    public final int write;

    public z9(String str, int i, DateTime dateTime, zgExternalSyntheticLambda11 zgexternalsyntheticlambda11, ArrayList arrayList) {
        str.getClass();
        zgexternalsyntheticlambda11.getClass();
        this.serializer = str;
        this.write = i;
        this.read = dateTime;
        this.RemoteActionCompatParcelizer = zgexternalsyntheticlambda11;
        this.IconCompatParcelizer = arrayList;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 1;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write, this.serializer.hashCode() * 31, 31);
        DateTime dateTime = this.read;
        if (dateTime == null) {
            int i4 = MediaBrowserCompatMediaItem + 65;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = dateTime.hashCode();
        }
        return this.IconCompatParcelizer.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + ((iM + iHashCode) * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 21;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("Delivery(confirmationNumber=", this.write, this.serializer, ", vendorOrderNumber=", ", completedAt=");
        sbM.append(this.read);
        sbM.append(", paymentType=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", details=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 115;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 57;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 35;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            if (!(obj instanceof z9)) {
                return false;
            }
            z9 z9Var = (z9) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, z9Var.serializer}, getCieXyz.write())).booleanValue() || this.write != z9Var.write) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, z9Var.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer == z9Var.RemoteActionCompatParcelizer) {
                if (!this.IconCompatParcelizer.equals(z9Var.IconCompatParcelizer)) {
                    return false;
                }
            } else {
                int i7 = MediaBrowserCompatMediaItem + 117;
                MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
        }
        return true;
    }
}
