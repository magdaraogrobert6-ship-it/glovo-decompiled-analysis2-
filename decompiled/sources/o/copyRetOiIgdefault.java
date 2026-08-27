package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.destination.data.models.StepComponent$Unknown$Companion;
import kotlinx.serialization.Serializable;
import o.ResourceFont;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class copyRetOiIgdefault extends PlatformFontVariationSettings_androidKtExternalSyntheticLambda0 {
    public static final StepComponent$Unknown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.destination.data.models.StepComponent$Unknown$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 15;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ResourceFont resourceFont = ResourceFont.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 27;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return resourceFont;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.destination.data.models.StepComponent$Unknown$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 83;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
