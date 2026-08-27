package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientNotifiesLocationMessageClick$Payload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class getDy {
    public static final BridgeMessage$ClientNotifiesLocationMessageClick$Payload$Companion Companion = new BridgeMessage$ClientNotifiesLocationMessageClick$Payload$Companion();
    public final String accuracy;
    public final double latitude;
    public final double longitude;
    public final String source;

    public final double RemoteActionCompatParcelizer() {
        return this.latitude;
    }

    public final double write() {
        return this.longitude;
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 31, 31);
        String str = this.accuracy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.source;
        return ((iRemoteActionCompatParcelizer + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDy)) {
            return false;
        }
        getDy getdy = (getDy) obj;
        if (Double.compare(this.latitude, getdy.latitude) != 0 || Double.compare(this.longitude, getdy.longitude) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accuracy, getdy.accuracy}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.source, getdy.source}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payload(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", accuracy=");
        sb.append(this.accuracy);
        sb.append(", source=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.source, ')');
    }

    public /* synthetic */ getDy(int i, double d, double d2, String str, String str2) {
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
            if ((i & 4) == 0) {
                this.accuracy = null;
            } else {
                this.accuracy = str;
            }
            if ((i & 8) == 0) {
                this.source = null;
                return;
            } else {
                this.source = str2;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, PathNodeRelativeMoveTo.read.getDescriptor());
        throw null;
    }
}
