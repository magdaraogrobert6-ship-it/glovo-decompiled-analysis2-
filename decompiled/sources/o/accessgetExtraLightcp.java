package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.destination.data.models.DeliveryDetailResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.accessgetBoldcp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class accessgetExtraLightcp {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final DeliveryDetailResponse$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.DeliveryDetailResponse$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 9;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return accessgetBoldcp.read;
            }
            int i3 = 4 / 0;
            return accessgetBoldcp.read;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final accessgetW900cp data;
    public final List messages;
    public final accessgetW400cp metadata;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.DeliveryDetailResponse$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new Reason$$ExternalSyntheticLambda0(20)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new Reason$$ExternalSyntheticLambda0(21))};
        int i = RemoteActionCompatParcelizer + 25;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ accessgetExtraLightcp(int i, accessgetW900cp accessgetw900cp, accessgetW400cp accessgetw400cp, List list) {
        if ((i & 1) == 0) {
            this.data = null;
            int i2 = 2 % 2;
        } else {
            this.data = accessgetw900cp;
        }
        if ((i & 2) == 0) {
            this.metadata = null;
        } else {
            this.metadata = accessgetw400cp;
            int i3 = serializer + 117;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        }
        if ((i & 4) != 0) {
            this.messages = list;
            return;
        }
        this.messages = null;
        int i5 = read + 105;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeliveryDetailResponse(data=");
        sb.append(this.data);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", messages=");
        String str = MediaSessionCompatQueueItem.read(sb, this.messages, ")");
        int i2 = read + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        accessgetW900cp accessgetw900cp = this.data;
        if (accessgetw900cp == null) {
            int i2 = serializer + 47;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = accessgetw900cp.hashCode();
        }
        accessgetW400cp accessgetw400cp = this.metadata;
        if (accessgetw400cp == null) {
            int i4 = serializer + 11;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = accessgetw400cp.hashCode();
        }
        List list = this.messages;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        int i6 = read + 123;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return iHashCode3;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof accessgetExtraLightcp) {
            accessgetExtraLightcp accessgetextralightcp = (accessgetExtraLightcp) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.data, accessgetextralightcp.data}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, accessgetextralightcp.metadata}, getCieXyz.write())).booleanValue()) {
                    int i5 = read + 117;
                    serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messages, accessgetextralightcp.messages}, getCieXyz.write())).booleanValue();
            }
            int i7 = serializer + 27;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = i3 + 73;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 8 / 0;
        }
        return false;
    }
}
