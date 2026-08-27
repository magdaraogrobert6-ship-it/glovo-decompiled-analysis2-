package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.UtccComponent$UnknownComponent$Companion;
import kotlinx.serialization.Serializable;
import o.getAxisName;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class grade extends getWeightGVVA2EU {
    public static final UtccComponent$UnknownComponent$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.UtccComponent$UnknownComponent$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 123;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getAxisName getaxisname = getAxisName.read;
            int i4 = RemoteActionCompatParcelizer + 103;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getaxisname;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.UtccComponent$UnknownComponent$Companion] */
    static {
        int i = serializer + 17;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }
}
