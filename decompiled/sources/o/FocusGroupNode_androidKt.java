package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$AcceptanceRateV2$Companion;
import kotlinx.serialization.Serializable;
import o.BringIntoViewNoderequester11;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "acceptance_rate_v2")
public final class FocusGroupNode_androidKt extends accessgetCurrentlyFocusedRect {
    public static final StateV3$AcceptData$AcceptanceRateV2$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$AcceptanceRateV2$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            BringIntoViewNoderequester11 bringIntoViewNoderequester11;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 23;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                bringIntoViewNoderequester11 = BringIntoViewNoderequester11.IconCompatParcelizer;
                int i3 = 66 / 0;
            } else {
                bringIntoViewNoderequester11 = BringIntoViewNoderequester11.IconCompatParcelizer;
            }
            int i4 = RemoteActionCompatParcelizer + 17;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return bringIntoViewNoderequester11;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$AcceptanceRateV2$Companion] */
    static {
        int i = write + 55;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ FocusGroupNode_androidKt(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.subtitle = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, BringIntoViewNoderequester11.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("AcceptanceRateV2(title=", this.title, ", subtitle=", this.subtitle, ")");
        int i4 = IconCompatParcelizer + 47;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.subtitle.hashCode() + (this.title.hashCode() * 31);
        int i4 = serializer + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof FocusGroupNode_androidKt))) {
            FocusGroupNode_androidKt focusGroupNode_androidKt = (FocusGroupNode_androidKt) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, focusGroupNode_androidKt.title}, getCieXyz.write())).booleanValue())) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, focusGroupNode_androidKt.subtitle}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = serializer + 69;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = serializer + 101;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = serializer + 31;
        int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i6;
        boolean z = i5 % 2 == 0;
        int i7 = i6 + 49;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 29 / 0;
        }
        return z;
    }
}
