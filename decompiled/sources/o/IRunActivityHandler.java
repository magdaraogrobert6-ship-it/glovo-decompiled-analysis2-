package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.provider.data.model.ShiftMetadataResponse$Companion;
import kotlinx.serialization.Serializable;
import o.sendSdkClick;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class IRunActivityHandler {
    public static final ShiftMetadataResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.ShiftMetadataResponse$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 19;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return sendSdkClick.write;
            }
            int i3 = 18 / 0;
            return sendSdkClick.write;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String context;
    public final String mode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.ShiftMetadataResponse$Companion] */
    static {
        int i = read + 41;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.mode;
        int i5 = i2 + 107;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ IRunActivityHandler(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.mode = null;
            int i2 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            this.mode = str;
        }
        int i4 = 2 % 2;
        if ((i & 2) != 0) {
            this.context = str2;
            return;
        }
        int i5 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        this.context = null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ShiftMetadataResponse(mode=", this.mode, ", context=", this.context, ")");
        int i4 = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 27;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0 ? (str = this.mode) != null : (str = this.mode) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 45;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        }
        String str2 = this.context;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 105;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 87;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof IRunActivityHandler) {
            IRunActivityHandler iRunActivityHandler = (IRunActivityHandler) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mode, iRunActivityHandler.mode}, getCieXyz.write())).booleanValue())) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.context, iRunActivityHandler.context}, getCieXyz.write())).booleanValue();
            }
            int i8 = IconCompatParcelizer + 81;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = i4 + 119;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 == 0;
    }
}
