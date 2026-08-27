package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.MapComponent$Component$NaverRoutePreview$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderonNestedPreFling1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "route_preview")
public final class AndroidViewHolderlayoutNode1coreModifier4 implements AndroidViewHolderlayoutNode15measure2 {
    public static final MapComponent$Component$NaverRoutePreview$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.MapComponent$Component$NaverRoutePreview$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 29;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidViewHolderonNestedPreFling1 androidViewHolderonNestedPreFling1 = AndroidViewHolderonNestedPreFling1.RemoteActionCompatParcelizer;
            int i4 = write + 59;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return androidViewHolderonNestedPreFling1;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k payload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.MapComponent$Component$NaverRoutePreview$Companion] */
    static {
        int i = read + 23;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 93 / 0;
        }
    }

    public /* synthetic */ AndroidViewHolderlayoutNode1coreModifier4(int i, r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r8lambdaerwhggzq_gqgn8cultnvrcshm8k) {
        if (1 == (i & 1)) {
            this.payload = r8lambdaerwhggzq_gqgn8cultnvrcshm8k;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidViewHolderonNestedPreFling1.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.payload.content.hashCode();
        int i4 = serializer + 73;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NaverRoutePreview(payload=" + this.payload + ")";
        int i2 = serializer + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof AndroidViewHolderlayoutNode1coreModifier4) {
                return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, ((AndroidViewHolderlayoutNode1coreModifier4) obj).payload}, getCieXyz.write())).booleanValue() ^ true);
            }
            int i2 = serializer + 125;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer;
        int i5 = i4 + 99;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 107;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
