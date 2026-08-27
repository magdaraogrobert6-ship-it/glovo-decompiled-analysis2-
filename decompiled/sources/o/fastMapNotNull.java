package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$FullscreenItem$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.fastMapIndexedNotNull;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class fastMapNotNull {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$FullscreenItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$FullscreenItem$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 101;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            fastMapIndexedNotNull fastmapindexednotnull = fastMapIndexedNotNull.read;
            int i4 = write + 89;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return fastmapindexednotnull;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final List fullscreenDetails;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ExpandableButtonV1$FullscreenItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(13)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fastFilteredMap(14))};
        int i = read + 63;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ fastMapNotNull(List list, List list2, int i) {
        if (3 == (i & 3)) {
            this.fullscreenDetails = list;
            this.trackingEvents = list2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, fastMapIndexedNotNull.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.trackingEvents.hashCode() / (this.fullscreenDetails.hashCode() / 114);
        } else {
            iHashCode = this.trackingEvents.hashCode() + (this.fullscreenDetails.hashCode() * 31);
        }
        int i3 = write + 107;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FullscreenItem(fullscreenDetails=" + this.fullscreenDetails + ", trackingEvents=" + this.trackingEvents + ")";
        int i2 = serializer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 27;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        if (obj instanceof fastMapNotNull) {
            fastMapNotNull fastmapnotnull = (fastMapNotNull) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fullscreenDetails, fastmapnotnull.fullscreenDetails}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, fastmapnotnull.trackingEvents}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i3 = write + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
