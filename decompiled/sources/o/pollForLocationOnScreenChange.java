package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.Instruction$Unknown$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.updatePosition;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class pollForLocationOnScreenChange extends accessgetPropertiesp {
    public static final Instruction$Unknown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$Unknown$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 39;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                updatePosition updateposition = updatePosition.IconCompatParcelizer;
                throw null;
            }
            updatePosition updateposition2 = updatePosition.IconCompatParcelizer;
            int i3 = read + 15;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return updateposition2;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$Unknown$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 55;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
