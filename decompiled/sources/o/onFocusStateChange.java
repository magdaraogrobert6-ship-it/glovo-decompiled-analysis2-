package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$DeliveryDetails$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FocusTargetInteropNode;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "delivery_details")
public final class onFocusStateChange extends accessgetCurrentlyFocusedRect {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final List destinations;
    public static final StateV3$AcceptData$DeliveryDetails$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$DeliveryDetails$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 91;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return FocusTargetInteropNode.write;
            }
            int i3 = 99 / 0;
            return FocusTargetInteropNode.write;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(8))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$DeliveryDetails$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ onFocusStateChange(int i, List list) {
        if (1 == (i & 1)) {
            this.destinations = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, FocusTargetInteropNode.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.destinations.hashCode();
        int i4 = serializer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i = 2 % 2;
        int i2 = write + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str = MediaSessionCompatQueueItem.read("DeliveryDetails(destinations=", ")", this.destinations);
            int i3 = 72 / 0;
        } else {
            str = MediaSessionCompatQueueItem.read("DeliveryDetails(destinations=", ")", this.destinations);
        }
        int i4 = serializer + 125;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onFocusStateChange)) {
            int i2 = serializer + 71;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.destinations, ((onFocusStateChange) obj).destinations}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i4 = write + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
