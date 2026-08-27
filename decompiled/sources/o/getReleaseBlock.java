package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$Item$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setSavableRegistryEntry;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class getReleaseBlock {
    public static final StateV3$AcceptData$Item$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Item$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 19;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return setSavableRegistryEntry.serializer;
            }
            setSavableRegistryEntry setsavableregistryentry = setSavableRegistryEntry.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final String count;
    public final String name;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Item$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 3;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getReleaseBlock(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.count = str;
            this.name = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setSavableRegistryEntry.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 107;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Item(count=", this.count, ", name=", this.name, ")");
            int i3 = read + 97;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Item(count=", this.count, ", name=", this.name, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 91;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.count.hashCode();
            iHashCode = this.name.hashCode();
            i = iHashCode2 >>> 48;
        } else {
            int iHashCode3 = this.count.hashCode();
            iHashCode = this.name.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getReleaseBlock) {
            getReleaseBlock getreleaseblock = (getReleaseBlock) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.count, getreleaseblock.count}, getCieXyz.write())).booleanValue()) {
                int i5 = read + 115;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, getreleaseblock.name}, getCieXyz.write())).booleanValue();
        }
        int i7 = i3 + 1;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 != 0;
    }
}
