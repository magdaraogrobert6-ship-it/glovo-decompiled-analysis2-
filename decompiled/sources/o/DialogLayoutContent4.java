package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.model.Vendor$Location$Companion;
import kotlinx.serialization.Serializable;
import o.getUsePlatformDefaultWidth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class DialogLayoutContent4 {
    public static final Vendor$Location$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.model.Vendor$Location$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 45;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getUsePlatformDefaultWidth getuseplatformdefaultwidth = getUsePlatformDefaultWidth.read;
            int i4 = read + 119;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 67 / 0;
            }
            return getuseplatformdefaultwidth;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final double latitude;
    public final double longitude;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.model.Vendor$Location$Companion] */
    static {
        int i = write + 73;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ DialogLayoutContent4(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getUsePlatformDefaultWidth.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        int i4 = read + 73;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "Location(latitude=", ", longitude="));
        int i4 = read + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 75;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof DialogLayoutContent4) {
            DialogLayoutContent4 dialogLayoutContent4 = (DialogLayoutContent4) obj;
            if (Double.compare(this.latitude, dialogLayoutContent4.latitude) == 0) {
                return Double.compare(this.longitude, dialogLayoutContent4.longitude) == 0;
            }
            int i4 = serializer + 1;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 125;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
