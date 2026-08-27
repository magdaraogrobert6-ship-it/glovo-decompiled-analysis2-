package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.RiderStateSummaryDescription$Companion;
import kotlinx.serialization.Serializable;
import o.optimizedPathFor;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class MultiDexV14ICSElementConstructor {
    public static final RiderStateSummaryDescription$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.RiderStateSummaryDescription$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 93;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            optimizedPathFor optimizedpathfor = optimizedPathFor.write;
            int i4 = serializer + 27;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
            return optimizedpathfor;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String style;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.RiderStateSummaryDescription$Companion] */
    static {
        int i = read + 119;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
    }

    public /* synthetic */ MultiDexV14ICSElementConstructor(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.text = str;
            this.style = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, optimizedPathFor.write.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("RiderStateSummaryDescription(text=", this.text, ", style=", this.style, ")");
            int i3 = write + 85;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strWrite;
            }
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("RiderStateSummaryDescription(text=", this.text, ", style=", this.style, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.style.hashCode() >> (this.text.hashCode() << 60);
        } else {
            iHashCode = (this.text.hashCode() * 31) + this.style.hashCode();
        }
        int i3 = serializer + 105;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 41;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof MultiDexV14ICSElementConstructor)) {
            return false;
        }
        MultiDexV14ICSElementConstructor multiDexV14ICSElementConstructor = (MultiDexV14ICSElementConstructor) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, multiDexV14ICSElementConstructor.text}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, multiDexV14ICSElementConstructor.style}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i4 = write + 103;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i5 = serializer + 125;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }
}
