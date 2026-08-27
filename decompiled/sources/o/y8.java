package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.order.history.data.database.entity.Delivery$Address$LatLong$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.ya;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class y8 {
    public static final Delivery$Address$LatLong$Companion Companion = new Object() { // from class: com.roadrunner.order.history.data.database.entity.Delivery$Address$LatLong$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ya yaVar = ya.IconCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return yaVar;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final double latitude;
    public final double longitude;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.order.history.data.database.entity.Delivery$Address$LatLong$Companion] */
    static {
        int i = IconCompatParcelizer + 15;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ y8(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.latitude = d;
            this.longitude = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, ya.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        int i4 = serializer + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = serializer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strM = ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "LatLong(latitude=", ", longitude="));
            int i3 = 30 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "LatLong(latitude=", ", longitude="));
        }
        int i4 = read + 103;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return strM;
    }

    public y8(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof y8) {
            y8 y8Var = (y8) obj;
            if (Double.compare(this.latitude, y8Var.latitude) == 0) {
                return Double.compare(this.longitude, y8Var.longitude) == 0;
            }
            int i2 = serializer + 57;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer;
        int i5 = i4 + 15;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 81;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
