package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Geofence$Companion;
import kotlinx.serialization.Serializable;
import o.insetBounds;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accesssetDrawingp {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Geofence$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Geofence$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 51;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return insetBounds.write;
            }
            insetBounds insetbounds = insetBounds.write;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final double latitude;
    public final double longitude;
    public final int radius;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$Geofence$Companion] */
    static {
        int i = IconCompatParcelizer + 11;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accesssetDrawingp(int i, int i2, double d, double d2) {
        if (7 == (i & 7)) {
            this.radius = i2;
            this.latitude = d;
            this.longitude = d2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, insetBounds.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Double.hashCode(this.longitude) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.latitude, Integer.hashCode(this.radius) * 31, 31);
        int i4 = serializer + 19;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 85;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accesssetDrawingp)) {
            int i5 = i4 + 85;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        accesssetDrawingp accesssetdrawingp = (accesssetDrawingp) obj;
        if (this.radius == accesssetdrawingp.radius) {
            if (Double.compare(this.latitude, accesssetdrawingp.latitude) != 0) {
                return false;
            }
            if (Double.compare(this.longitude, accesssetdrawingp.longitude) == 0) {
                return true;
            }
            int i6 = write + 37;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        int i7 = i2 + 29;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i8;
        boolean z = i7 % 2 == 0;
        int i9 = i8 + 7;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return z;
        }
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Geofence(radius=" + this.radius + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
        int i2 = serializer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
