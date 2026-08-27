package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesLocationMessageClick$Payload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class hasSpan {
    public static final BridgeMessage$ClientNotifiesLocationMessageClick$Payload$Companion Companion = new BridgeMessage$ClientNotifiesLocationMessageClick$Payload$Companion();
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String accuracy;
    public final double latitude;
    public final double longitude;
    public final String source;

    static {
        int i = read + 99;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ hasSpan(int i, double d, double d2, String str, String str2) {
        int i2;
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
            if ((i & 4) == 0) {
                this.accuracy = null;
                i2 = IconCompatParcelizer + 11;
            } else {
                this.accuracy = str;
                i2 = IconCompatParcelizer + 97;
            }
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            if ((i & 8) == 0) {
                int i5 = IconCompatParcelizer + 73;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                this.source = null;
                return;
            }
            this.source = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getCharSequenceui_text.write.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.latitude, "Payload(latitude=", ", longitude=");
        sbM.append(this.longitude);
        sbM.append(", accuracy=");
        sbM.append(this.accuracy);
        String strM = d$$ExternalSyntheticOutline0.m(sbM, ", source=", this.source, ")");
        int i4 = serializer + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 31, 31);
        String str = this.accuracy;
        if (str == null) {
            int i4 = serializer + 33;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.source;
        return ((iRemoteActionCompatParcelizer + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasSpan)) {
            return false;
        }
        hasSpan hasspan = (hasSpan) obj;
        if (Double.compare(this.latitude, hasspan.latitude) != 0) {
            int i2 = IconCompatParcelizer + 125;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (Double.compare(this.longitude, hasspan.longitude) != 0) {
            int i3 = serializer;
            int i4 = i3 + 63;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 95;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accuracy, hasspan.accuracy}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.source, hasspan.source}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = IconCompatParcelizer + 89;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
