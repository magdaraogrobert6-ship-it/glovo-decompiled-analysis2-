package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class zcExternalSyntheticLambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final zgExternalSyntheticLambda11 read;
    public final OrderDetails serializer;
    public final long write;

    public zcExternalSyntheticLambda0(String str, int i, long j, zgExternalSyntheticLambda11 zgexternalsyntheticlambda11, OrderDetails orderDetails) {
        str.getClass();
        zgexternalsyntheticlambda11.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = i;
        this.write = j;
        this.read = zgexternalsyntheticlambda11;
        this.serializer = orderDetails;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 97;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer.hashCode() * 31, 31), 31, this.write);
        int iHashCode = this.serializer.hashCode() + ((this.read.hashCode() + iM) * 31);
        int i4 = MediaBrowserCompatMediaItem + 45;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 7;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("LatestDelivery(confirmationNumber=", this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, ", vendorOrderNumber=", ", collected=");
        sbM.append(this.write);
        sbM.append(", paymentType=");
        sbM.append(this.read);
        sbM.append(", orderDetails=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 59;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 57;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof zcExternalSyntheticLambda0)) {
                return false;
            }
            zcExternalSyntheticLambda0 zcexternalsyntheticlambda0 = (zcExternalSyntheticLambda0) obj;
            Object[] objArr = {this.RemoteActionCompatParcelizer, zcexternalsyntheticlambda0.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i3 = MediaBrowserCompatMediaItem + 7;
                MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (this.IconCompatParcelizer != zcexternalsyntheticlambda0.IconCompatParcelizer || this.write != zcexternalsyntheticlambda0.write || this.read != zcexternalsyntheticlambda0.read || !this.serializer.equals(zcexternalsyntheticlambda0.serializer)) {
                return false;
            }
        }
        return true;
    }
}
