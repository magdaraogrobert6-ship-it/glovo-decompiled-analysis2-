package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$ExternalMap$Companion;
import com.roadrunner.delivery.destination.data.models.VehicleType;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FontWeightAdjustmentHelper;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "external_map")
public final class getW900 extends getW800 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final String caption;
    public final double latitude;
    public final double longitude;
    public final VehicleType vehicleType;
    public static final ScrollableComponent$LocationDetail$ExternalMap$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$ExternalMap$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 87;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                FontWeightAdjustmentHelper fontWeightAdjustmentHelper = FontWeightAdjustmentHelper.serializer;
                obj.hashCode();
                throw null;
            }
            FontWeightAdjustmentHelper fontWeightAdjustmentHelper2 = FontWeightAdjustmentHelper.serializer;
            int i3 = write + 71;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return fontWeightAdjustmentHelper2;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(13))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$ExternalMap$Companion] */
    static {
        int i = serializer + 115;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getW900(int i, double d, double d2, String str, VehicleType vehicleType) {
        if (11 == (i & 11)) {
            this.latitude = d;
            this.longitude = d2;
            if ((i & 4) == 0) {
                this.caption = null;
            } else {
                this.caption = str;
                int i2 = read + 27;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            this.vehicleType = vehicleType;
            int i5 = read + 31;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 11, FontWeightAdjustmentHelper.serializer.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041 A[PHI: r1 r3
  0x0041: PHI (r1v11 int) = (r1v6 int), (r1v14 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r3v9 java.lang.String) = (r3v2 java.lang.String), (r3v13 java.lang.String) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v7 int) = (r1v6 int), (r1v14 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iRemoteActionCompatParcelizer;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 123;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) << 79, 77);
            str = this.caption;
            if (str == null) {
                int i4 = RemoteActionCompatParcelizer + 39;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                i = 0;
            } else {
                int iHashCode = str.hashCode();
                int i6 = read + 109;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i = iHashCode;
            }
        } else {
            iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 31, 31);
            str = this.caption;
            if (str == null) {
                int i8 = RemoteActionCompatParcelizer + 39;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i = 0;
            } else {
                int iHashCode2 = str.hashCode();
                int i10 = read + 109;
                RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i = iHashCode2;
            }
        }
        return this.vehicleType.hashCode() + ((iRemoteActionCompatParcelizer + i) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
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
        int i4 = RemoteActionCompatParcelizer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getW900)) {
            int i2 = read + 13;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        getW900 getw900 = (getW900) obj;
        if (Double.compare(this.latitude, getw900.latitude) != 0 || Double.compare(this.longitude, getw900.longitude) != 0) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.caption, getw900.caption}, getCieXyz.write())).booleanValue()) {
            if (this.vehicleType == getw900.vehicleType) {
                return true;
            }
            int i4 = read + 27;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = read + 11;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
