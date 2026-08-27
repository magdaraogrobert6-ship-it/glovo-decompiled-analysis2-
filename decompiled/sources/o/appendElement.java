package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.AutoAcceptV2Data$Unknown$Companion;
import kotlinx.serialization.Serializable;
import o.ListUtilsKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class appendElement extends fastRoundToInt {
    public static final AutoAcceptV2Data$Unknown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.AutoAcceptV2Data$Unknown$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 115;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ListUtilsKt listUtilsKt = ListUtilsKt.read;
            int i4 = RemoteActionCompatParcelizer + 59;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return listUtilsKt;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.AutoAcceptV2Data$Unknown$Companion] */
    static {
        int i = read + 43;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
