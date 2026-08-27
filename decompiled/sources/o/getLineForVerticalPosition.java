package o;

import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$HelpCenterEncounteredError$Payload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getLineForVerticalPosition {
    public static final BridgeMessage$HelpCenterEncounteredError$Payload$Companion Companion = new BridgeMessage$HelpCenterEncounteredError$Payload$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String duringMessageType;
    public final getLineCount error;

    static {
        int i = IconCompatParcelizer + 47;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getLineForVerticalPosition(int i, String str, getLineCount getlinecount) {
        if (1 == (i & 1)) {
            this.duringMessageType = str;
            if ((i & 2) == 0) {
                this.error = null;
                int i2 = serializer + 67;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 79 / 0;
                    return;
                }
                return;
            }
            this.error = getlinecount;
            int i4 = RemoteActionCompatParcelizer + 95;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getLineEnd.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.duringMessageType.hashCode();
        getLineCount getlinecount = this.error;
        if (getlinecount == null) {
            int i2 = RemoteActionCompatParcelizer + 69;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getlinecount.hashCode();
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = serializer + 29;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Payload(duringMessageType=" + this.duringMessageType + ", error=" + this.error + ")";
        int i2 = serializer + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 61;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getLineForVerticalPosition)) {
            return false;
        }
        getLineForVerticalPosition getlineforverticalposition = (getLineForVerticalPosition) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.duringMessageType, getlineforverticalposition.duringMessageType}, getCieXyz.write())).booleanValue()) {
            int i7 = RemoteActionCompatParcelizer + 51;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.error, getlineforverticalposition.error}, getCieXyz.write())).booleanValue();
    }
}
