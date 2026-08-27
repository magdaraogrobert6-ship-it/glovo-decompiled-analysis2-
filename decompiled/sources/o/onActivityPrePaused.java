package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Companion;
import kotlinx.serialization.Serializable;
import o.getZipCrc;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable(write = getZipCrc.class)
public abstract class onActivityPrePaused {
    public static final NestAutoAcceptComponent$SubComponent$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 53;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getZipCrc getzipcrc = getZipCrc.read;
            int i4 = write + 31;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return getzipcrc;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int read = 1;
    private static int serializer;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Companion] */
    static {
        int i = serializer + 55;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 18 / 0;
        }
    }
}
