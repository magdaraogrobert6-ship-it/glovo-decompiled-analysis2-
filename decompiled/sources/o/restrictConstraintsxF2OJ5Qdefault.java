package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$TapToPayCashUiItem$Companion;
import kotlinx.serialization.Serializable;
import o.ConstraintsCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class restrictConstraintsxF2OJ5Qdefault {
    public static final TapToPayTaskUiItem$TapToPayCashUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$TapToPayCashUiItem$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 17;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ConstraintsCompanion constraintsCompanion = ConstraintsCompanion.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 71;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return constraintsCompanion;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String key;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$TapToPayCashUiItem$Companion] */
    static {
        int i = serializer + 57;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 88 / 0;
        }
    }

    public /* synthetic */ restrictConstraintsxF2OJ5Qdefault(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.key = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, ConstraintsCompanion.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TapToPayCashUiItem(title=", this.title, ", key=", this.key, ")");
        int i4 = RemoteActionCompatParcelizer + 9;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.key.hashCode() + (this.title.hashCode() * 31);
        int i4 = write + 81;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public restrictConstraintsxF2OJ5Qdefault(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.key = str2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof restrictConstraintsxF2OJ5Qdefault))) {
            restrictConstraintsxF2OJ5Qdefault restrictconstraintsxf2oj5qdefault = (restrictConstraintsxF2OJ5Qdefault) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, restrictconstraintsxf2oj5qdefault.title}, getCieXyz.write())).booleanValue()) {
                int i2 = RemoteActionCompatParcelizer + 79;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, restrictconstraintsxf2oj5qdefault.key}, getCieXyz.write())).booleanValue();
        }
        int i3 = write + 69;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
