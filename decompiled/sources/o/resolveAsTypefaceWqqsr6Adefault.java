package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$Unknown$Companion;
import kotlinx.serialization.Serializable;
import o.FontF3nL8kk;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class resolveAsTypefaceWqqsr6Adefault implements FontFamilyResolverKt {
    public static final OverlayComponent$Unknown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$Unknown$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 33;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return FontF3nL8kk.RemoteActionCompatParcelizer;
            }
            FontF3nL8kk fontF3nL8kk = FontF3nL8kk.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int read = 1;
    private static int write;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.OverlayComponent$Unknown$Companion] */
    static {
        int i = write + 35;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
