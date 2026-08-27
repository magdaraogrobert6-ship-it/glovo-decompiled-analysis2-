package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$Unknown$Companion;
import kotlinx.serialization.Serializable;
import o.PlatformFontFamilyTypefaceAdapter;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getFontWeightAdjustment extends getW800 {
    public static final ScrollableComponent$LocationDetail$Unknown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$Unknown$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 13;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return PlatformFontFamilyTypefaceAdapter.serializer;
            }
            PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter = PlatformFontFamilyTypefaceAdapter.serializer;
            throw null;
        }
    };
    private static int serializer = 0;
    private static int write = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.ScrollableComponent$LocationDetail$Unknown$Companion] */
    static {
        int i = serializer + 101;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
