package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.safety.report.data.entity.RemoteSafetyScore$Companion;
import kotlinx.serialization.Serializable;
import o.getCurrency;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setAdImpressionsCount {
    public static final RemoteSafetyScore$Companion Companion = new Object() { // from class: com.roadrunner.rider.safety.report.data.entity.RemoteSafetyScore$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 19;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                getCurrency getcurrency = getCurrency.IconCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            getCurrency getcurrency2 = getCurrency.IconCompatParcelizer;
            int i3 = IconCompatParcelizer + 13;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return getcurrency2;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final float score;
    public final String tag;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.safety.report.data.entity.RemoteSafetyScore$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 119;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ setAdImpressionsCount(String str, int i, float f) {
        if (3 == (i & 3)) {
            this.score = f;
            this.tag = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getCurrency.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.tag.hashCode() + (Float.hashCode(this.score) * 31);
        int i4 = write + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RemoteSafetyScore(score=" + this.score + ", tag=" + this.tag + ")";
        int i2 = read + 37;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setAdImpressionsCount) {
            setAdImpressionsCount setadimpressionscount = (setAdImpressionsCount) obj;
            if (Float.compare(this.score, setadimpressionscount.score) != 0) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tag, setadimpressionscount.tag}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = write + 1;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 73;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
