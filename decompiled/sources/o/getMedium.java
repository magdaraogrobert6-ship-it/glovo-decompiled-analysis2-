package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Unknown$Companion;
import kotlinx.serialization.Serializable;
import o.getSemiBold;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getMedium extends getLight {
    public static final ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Unknown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Unknown$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 59;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getSemiBold getsemibold = getSemiBold.write;
            int i4 = serializer + 111;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getsemibold;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$Instructions$Item$DeliveryNotes$DeliveryNotesComponent$Unknown$Companion] */
    static {
        int i = write + 63;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
