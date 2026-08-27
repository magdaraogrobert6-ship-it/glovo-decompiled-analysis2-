package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$Earnings$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FocusTargetInteropNodefocusTargetNode1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "earnings")
public final class FocusTargetPropertiesNode extends accessgetCurrentlyFocusedRect {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final List individualEarnings;
    public final FocusTargetInteropNoderetrievePinnableContainer1 overview;
    public static final StateV3$AcceptData$Earnings$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Earnings$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            FocusTargetInteropNodefocusTargetNode1 focusTargetInteropNodefocusTargetNode1;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 13;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                focusTargetInteropNodefocusTargetNode1 = FocusTargetInteropNodefocusTargetNode1.IconCompatParcelizer;
                int i3 = 28 / 0;
            } else {
                focusTargetInteropNodefocusTargetNode1 = FocusTargetInteropNodefocusTargetNode1.IconCompatParcelizer;
            }
            int i4 = IconCompatParcelizer + 125;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return focusTargetInteropNodefocusTargetNode1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(9))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Earnings$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ FocusTargetPropertiesNode(int i, FocusTargetInteropNoderetrievePinnableContainer1 focusTargetInteropNoderetrievePinnableContainer1, List list) {
        if (1 == (i & 1)) {
            this.overview = focusTargetInteropNoderetrievePinnableContainer1;
            if ((i & 2) == 0) {
                this.individualEarnings = null;
                int i2 = write + 53;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.individualEarnings = list;
            int i3 = write + 109;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, FocusTargetInteropNodefocusTargetNode1.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.overview.hashCode();
        List list = this.individualEarnings;
        int iHashCode2 = (iHashCode * 31) + (list == null ? 0 : list.hashCode());
        int i4 = serializer + 123;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Earnings(overview=" + this.overview + ", individualEarnings=" + this.individualEarnings + ")";
        int i2 = write + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof FocusTargetPropertiesNode)) {
                return false;
            }
            FocusTargetPropertiesNode focusTargetPropertiesNode = (FocusTargetPropertiesNode) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.overview, focusTargetPropertiesNode.overview}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.individualEarnings, focusTargetPropertiesNode.individualEarnings}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = serializer + 49;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = serializer + 33;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = write + 89;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
