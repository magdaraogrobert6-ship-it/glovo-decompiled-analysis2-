package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.UnknownAction$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.updateViewLayout;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getWindowBounds extends getWindowTitle {
    public static final UnknownAction$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.UnknownAction$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 81;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            updateViewLayout updateviewlayout = updateViewLayout.write;
            int i4 = serializer + 1;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return updateviewlayout;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.UnknownAction$Companion] */
    static {
        int i = serializer + 29;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
