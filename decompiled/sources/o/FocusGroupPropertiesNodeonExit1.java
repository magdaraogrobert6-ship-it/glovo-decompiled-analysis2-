package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$DeclineData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.retrievePinnableContainer;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FocusGroupPropertiesNodeonExit1 {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final StateV3$AcceptData$DeclineData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$DeclineData$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 87;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return retrievePinnableContainer.read;
            }
            retrievePinnableContainer retrievepinnablecontainer = retrievePinnableContainer.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final List deliveryIds;
    public final List paymentEstimationAmounts;
    public final List paymentEstimationIds;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$DeclineData$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ComposableSingletonsAndroidDialog_androidKt(5)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ComposableSingletonsAndroidDialog_androidKt(6)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new ComposableSingletonsAndroidDialog_androidKt(7))};
        int i = IconCompatParcelizer + 95;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ FocusGroupPropertiesNodeonExit1(int i, List list, List list2, List list3) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.deliveryIds = list;
            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
            if ((i & 2) == 0) {
                this.paymentEstimationIds = instance_delegatelambda0Var;
            } else {
                this.paymentEstimationIds = list2;
            }
            if ((i & 4) != 0) {
                this.paymentEstimationAmounts = list3;
                return;
            }
            int i2 = RemoteActionCompatParcelizer + 103;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            this.paymentEstimationAmounts = instance_delegatelambda0Var;
            int i5 = i3 + 61;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, retrievePinnableContainer.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return c8$$ExternalSyntheticOutline0.m(this.paymentEstimationIds, this.deliveryIds.hashCode() * 31, 31) + this.paymentEstimationAmounts.hashCode();
        }
        return this.paymentEstimationAmounts.hashCode() >>> c8$$ExternalSyntheticOutline0.m(this.paymentEstimationIds, this.deliveryIds.hashCode() >> 15, 17);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("DeclineData(deliveryIds=");
        sb.append(this.deliveryIds);
        sb.append(", paymentEstimationIds=");
        sb.append(this.paymentEstimationIds);
        sb.append(", paymentEstimationAmounts=");
        String str = MediaSessionCompatQueueItem.read(sb, this.paymentEstimationAmounts, ")");
        int i2 = RemoteActionCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusGroupPropertiesNodeonExit1)) {
            return false;
        }
        FocusGroupPropertiesNodeonExit1 focusGroupPropertiesNodeonExit1 = (FocusGroupPropertiesNodeonExit1) obj;
        Object[] objArr = {this.deliveryIds, focusGroupPropertiesNodeonExit1.deliveryIds};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i3 = RemoteActionCompatParcelizer + 49;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        Object[] objArr2 = {this.paymentEstimationIds, focusGroupPropertiesNodeonExit1.paymentEstimationIds};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 83;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        Object[] objArr3 = {this.paymentEstimationAmounts, focusGroupPropertiesNodeonExit1.paymentEstimationAmounts};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = read + 3;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
