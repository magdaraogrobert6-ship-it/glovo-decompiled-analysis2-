package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$ExternalMap$Companion;
import com.roadrunner.delivery.state.MapComponent$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.VehicleType;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderExternalSyntheticLambda0;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "external_map")
public final class AndroidViewHolder2 implements accessobtainMeasureSpec {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final String caption;
    public final double latitude;
    public final double longitude;
    public final VehicleType vehicleType;
    public static final DestinationInfo$ScrollableComponent$LocationDetail$ExternalMap$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$ExternalMap$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 101;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidViewHolderExternalSyntheticLambda0 androidViewHolderExternalSyntheticLambda0 = AndroidViewHolderExternalSyntheticLambda0.write;
            int i4 = write + 87;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
            }
            return androidViewHolderExternalSyntheticLambda0;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(11))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$ExternalMap$Companion] */
    static {
        int i = IconCompatParcelizer + 33;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AndroidViewHolder2(int i, double d, double d2, String str, VehicleType vehicleType) {
        if (11 == (i & 11)) {
            this.latitude = d;
            this.longitude = d2;
            if ((i & 4) == 0) {
                this.caption = null;
            } else {
                this.caption = str;
                int i2 = write + 75;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.vehicleType = vehicleType;
            int i5 = read + 27;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 11, AndroidViewHolderExternalSyntheticLambda0.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 31, 31);
        String str = this.caption;
        if (str == null) {
            int i2 = read + 25;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.vehicleType.hashCode() + ((iRemoteActionCompatParcelizer + iHashCode) * 31);
        int i4 = read + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.latitude, "ExternalMap(latitude=", ", longitude=");
        sbM.append(this.longitude);
        sbM.append(", caption=");
        sbM.append(this.caption);
        sbM.append(", vehicleType=");
        sbM.append(this.vehicleType);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidViewHolder2)) {
            int i4 = i2 + 43;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        AndroidViewHolder2 androidViewHolder2 = (AndroidViewHolder2) obj;
        if (Double.compare(this.latitude, androidViewHolder2.latitude) != 0) {
            int i6 = write + 121;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (Double.compare(this.longitude, androidViewHolder2.longitude) == 0) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.caption, androidViewHolder2.caption}, getCieXyz.write())).booleanValue() && this.vehicleType == androidViewHolder2.vehicleType;
        }
        int i8 = read + 97;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
