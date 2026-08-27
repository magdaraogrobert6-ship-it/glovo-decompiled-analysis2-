package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.UnknownTask$Companion;
import kotlinx.serialization.Serializable;
import o.getAllGVVA2EU;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isWeightOnimplui_text extends DeviceFontFamilyNameFontKt {
    public static final UnknownTask$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.UnknownTask$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 117;
            serializer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                getAllGVVA2EU getallgvva2eu = getAllGVVA2EU.serializer;
                throw null;
            }
            getAllGVVA2EU getallgvva2eu2 = getAllGVVA2EU.serializer;
            int i3 = write + 1;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return getallgvva2eu2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.UnknownTask$Companion] */
    static {
        int i = serializer + 117;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
