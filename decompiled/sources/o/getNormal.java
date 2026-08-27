package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$Unknown$Companion;
import kotlinx.serialization.Serializable;
import o.getW200;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getNormal extends getBold {
    public static final ScrollableComponent$Instructions$Item$Unknown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$Unknown$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 55;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getW200.IconCompatParcelizer;
            }
            int i3 = 96 / 0;
            return getW200.IconCompatParcelizer;
        }
    };
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$Unknown$Companion] */
    static {
        int i = read + 95;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
