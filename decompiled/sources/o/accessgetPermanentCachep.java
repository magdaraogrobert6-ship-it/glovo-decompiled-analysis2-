package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.DeliveryConfirmationResponse$Metadata$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetCacheLockp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessgetPermanentCachep {
    public static final DeliveryConfirmationResponse$Metadata$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.DeliveryConfirmationResponse$Metadata$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 115;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetCacheLockp accessgetcachelockp = accessgetCacheLockp.RemoteActionCompatParcelizer;
            int i4 = write + 1;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return accessgetcachelockp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final Long currentDeliveryId;
    public final String deliveryState;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.DeliveryConfirmationResponse$Metadata$Companion] */
    static {
        int i = write + 89;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final Long read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.currentDeliveryId;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.deliveryState;
        int i5 = i3 + 65;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ accessgetPermanentCachep(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.currentDeliveryId = null;
            int i2 = serializer + 83;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 4 % 2;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            this.currentDeliveryId = l;
        }
        if ((i & 2) == 0) {
            int i5 = serializer + 1;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.deliveryState = null;
            return;
        }
        this.deliveryState = str;
        int i7 = RemoteActionCompatParcelizer + 41;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 55 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Long l = this.currentDeliveryId;
        if (l == null) {
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i2 = serializer + 39;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        String str = this.deliveryState;
        int iHashCode2 = (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        int i4 = RemoteActionCompatParcelizer + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Metadata(currentDeliveryId=" + this.currentDeliveryId + ", deliveryState=" + this.deliveryState + ")";
        int i2 = serializer + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 13;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof accessgetPermanentCachep)) {
            return false;
        }
        accessgetPermanentCachep accessgetpermanentcachep = (accessgetPermanentCachep) obj;
        Object[] objArr = {this.currentDeliveryId, accessgetpermanentcachep.currentDeliveryId};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.deliveryState, accessgetpermanentcachep.deliveryState};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer;
        int i5 = i4 + 123;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 9;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
