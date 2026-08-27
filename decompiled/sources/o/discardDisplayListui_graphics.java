package o;

import com.data.model.delivery.cod.FoodoraCodReason$Companion;
import kotlinx.serialization.Serializable;
import o.emulateTrimMemoryui_graphics;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class discardDisplayListui_graphics {
    public static final FoodoraCodReason$Companion Companion = new Object() { // from class: com.data.model.delivery.cod.FoodoraCodReason$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return emulateTrimMemoryui_graphics.RemoteActionCompatParcelizer;
        }
    };
    public final int reason;
    public final String reasonCode;

    public /* synthetic */ discardDisplayListui_graphics(int i, int i2, String str) {
        if (3 == (i & 3)) {
            this.reason = i2;
            this.reasonCode = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, emulateTrimMemoryui_graphics.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }
}
