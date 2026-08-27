package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startworking.data.stopworking.entity.VehicleRequest$Companion;
import kotlinx.serialization.Serializable;
import o.isDelayedInitializationEnabled;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class isEphemeralEventKeylambda0 {
    public static final VehicleRequest$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.stopworking.entity.VehicleRequest$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 99;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            isDelayedInitializationEnabled isdelayedinitializationenabled = isDelayedInitializationEnabled.serializer;
            int i4 = RemoteActionCompatParcelizer + 39;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return isdelayedinitializationenabled;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final String bagType;
    public final String name;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.stopworking.entity.VehicleRequest$Companion] */
    static {
        int i = read + 59;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ isEphemeralEventKeylambda0(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.name = str;
            if ((i & 2) == 0) {
                this.bagType = null;
                int i2 = RemoteActionCompatParcelizer + 33;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 70 / 0;
                    return;
                }
                return;
            }
            this.bagType = str2;
            int i4 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, isDelayedInitializationEnabled.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        String strWrite;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("VehicleRequest(name=", this.name, ", bagType=", this.bagType, ")");
            int i3 = 96 / 0;
        } else {
            strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("VehicleRequest(name=", this.name, ", bagType=", this.bagType, ")");
        }
        int i4 = IconCompatParcelizer + 81;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.name.hashCode();
            throw null;
        }
        int iHashCode2 = this.name.hashCode();
        String str = this.bagType;
        if (str == null) {
            int i3 = RemoteActionCompatParcelizer;
            int i4 = i3 + 95;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 75;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 107;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof isEphemeralEventKeylambda0) {
            isEphemeralEventKeylambda0 isephemeraleventkeylambda0 = (isEphemeralEventKeylambda0) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, isephemeraleventkeylambda0.name}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bagType, isephemeraleventkeylambda0.bagType}, getCieXyz.write())).booleanValue();
            }
            int i4 = IconCompatParcelizer + 55;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
