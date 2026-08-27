package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.Instruction$DeliveryNotes$DeliveryNotesComponent$Unknown$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.updateParameters;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class DialogWrapper2 extends _init_disableClipping {
    public static final Instruction$DeliveryNotes$DeliveryNotesComponent$Unknown$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$DeliveryNotes$DeliveryNotesComponent$Unknown$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 61;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            updateParameters updateparameters = updateParameters.RemoteActionCompatParcelizer;
            int i4 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return updateparameters;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$DeliveryNotes$DeliveryNotesComponent$Unknown$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 9;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
