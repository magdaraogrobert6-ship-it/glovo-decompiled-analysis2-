package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.destination.data.models.ConfirmArrivalRequestBody$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessgetSemiBoldcp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class accessgetLightcp {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String action;
    public final List deliveryIds;
    public final Double riderLatitude;
    public final Double riderLongitude;
    public final String stackId;
    public static final ConfirmArrivalRequestBody$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ConfirmArrivalRequestBody$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 5;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                accessgetSemiBoldcp accessgetsemiboldcp = accessgetSemiBoldcp.IconCompatParcelizer;
                throw null;
            }
            accessgetSemiBoldcp accessgetsemiboldcp2 = accessgetSemiBoldcp.IconCompatParcelizer;
            int i3 = read + 49;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return accessgetsemiboldcp2;
            }
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(19)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ConfirmArrivalRequestBody$Companion] */
    static {
        int i = read + 27;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accessgetLightcp(int i, String str, List list, Double d, Double d2, String str2) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.action = str;
            this.deliveryIds = list;
            if ((i & 4) == 0) {
                this.riderLongitude = null;
            } else {
                this.riderLongitude = d;
            }
            if ((i & 8) != 0) {
                this.riderLatitude = d2;
            } else {
                int i2 = RemoteActionCompatParcelizer + 73;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    this.riderLatitude = null;
                    int i3 = 46 / 0;
                } else {
                    this.riderLatitude = null;
                }
                int i4 = 2 % 2;
            }
            if ((i & 16) == 0) {
                int i5 = IconCompatParcelizer + 81;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    this.stackId = null;
                    return;
                } else {
                    this.stackId = null;
                    obj.hashCode();
                    throw null;
                }
            }
            this.stackId = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accessgetSemiBoldcp.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("ConfirmArrivalRequestBody(action=", this.action, ", deliveryIds=", this.deliveryIds, ", riderLongitude=");
        sbSerializer.append(this.riderLongitude);
        sbSerializer.append(", riderLatitude=");
        sbSerializer.append(this.riderLatitude);
        sbSerializer.append(", stackId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbSerializer, this.stackId, ")");
        int i4 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.deliveryIds, this.action.hashCode() * 31, 31);
        Double d = this.riderLongitude;
        int iHashCode2 = 0;
        int iHashCode3 = d == null ? 0 : d.hashCode();
        Double d2 = this.riderLatitude;
        if (d2 == null) {
            int i2 = RemoteActionCompatParcelizer + 73;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
            int i4 = i3 + 7;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode = d2.hashCode();
        }
        String str = this.stackId;
        if (str == null) {
            int i6 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = str.hashCode();
        }
        return ((((iM + iHashCode3) * 31) + iHashCode) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 45;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof accessgetLightcp) {
            accessgetLightcp accessgetlightcp = (accessgetLightcp) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, accessgetlightcp.action}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryIds, accessgetlightcp.deliveryIds}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.riderLongitude, accessgetlightcp.riderLongitude}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.riderLatitude, accessgetlightcp.riderLatitude}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stackId, accessgetlightcp.stackId}, getCieXyz.write())).booleanValue();
            }
            int i5 = RemoteActionCompatParcelizer + 27;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 31;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 89 / 0;
        }
        return false;
    }
}
