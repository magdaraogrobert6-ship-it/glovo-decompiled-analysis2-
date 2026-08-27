package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.StartingAreaCoordinates$Companion;
import kotlinx.serialization.Serializable;
import o.sendReftagReferrers;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class sendPreinstallPayload {
    public static final StartingAreaCoordinates$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.StartingAreaCoordinates$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 11;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return sendReftagReferrers.read;
            }
            int i3 = 16 / 0;
            return sendReftagReferrers.read;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final double lat;

    /* JADX INFO: renamed from: long, reason: not valid java name */
    public final double f12long;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.StartingAreaCoordinates$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 17;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final double IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 49;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        double d = this.lat;
        int i5 = i2 + 101;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return d;
    }

    public final double write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        double d = this.f12long;
        int i5 = i3 + 83;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return d;
    }

    public /* synthetic */ sendPreinstallPayload(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.lat = d;
            this.f12long = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, sendReftagReferrers.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = Double.hashCode(this.f12long) % (Double.hashCode(this.lat) << 30);
        } else {
            iHashCode = Double.hashCode(this.f12long) + (Double.hashCode(this.lat) * 31);
        }
        int i3 = serializer + 97;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(this.f12long, ")", af$$ExternalSyntheticOutline0.m(this.lat, "StartingAreaCoordinates(lat=", ", long="));
        int i4 = IconCompatParcelizer + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sendPreinstallPayload)) {
            int i4 = i3 + 3;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        sendPreinstallPayload sendpreinstallpayload = (sendPreinstallPayload) obj;
        if (Double.compare(this.lat, sendpreinstallpayload.lat) == 0) {
            return Double.compare(this.f12long, sendpreinstallpayload.f12long) == 0;
        }
        int i5 = IconCompatParcelizer + 69;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
