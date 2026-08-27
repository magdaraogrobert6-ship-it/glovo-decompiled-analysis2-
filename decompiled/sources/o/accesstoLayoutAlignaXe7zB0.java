package o;

import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostAsksForBackNavigation$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accesstoLayoutAlignaXe7zB0 extends getPlaceholderRects {
    public static final HostMessage$HostAsksForBackNavigation$Companion Companion = new HostMessage$HostAsksForBackNavigation$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String id;
    public final String messageType;

    static {
        int i = RemoteActionCompatParcelizer + 123;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
    }

    @Override // o.getPlaceholderRects
    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.messageType;
        }
        throw null;
    }

    public /* synthetic */ accesstoLayoutAlignaXe7zB0(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.id = str;
            if ((i & 2) == 0) {
                this.messageType = "HOST_ASKS_FOR_BACK_NAVIGATION";
                int i2 = IconCompatParcelizer + 47;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.messageType = str2;
            int i4 = IconCompatParcelizer + 61;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, accesstoLayoutLineBreakStylehpcqdu8.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("HostAsksForBackNavigation(id=", this.id, ", messageType=", this.messageType, ")");
            int i3 = IconCompatParcelizer + 27;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("HostAsksForBackNavigation(id=", this.id, ", messageType=", this.messageType, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.messageType.hashCode() + (this.id.hashCode() * 31);
        int i4 = IconCompatParcelizer + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public accesstoLayoutAlignaXe7zB0(String str) {
        this.id = str;
        this.messageType = "HOST_ASKS_FOR_BACK_NAVIGATION";
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 1;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof accesstoLayoutAlignaXe7zB0)) {
            return false;
        }
        accesstoLayoutAlignaXe7zB0 accesstolayoutalignaxe7zb0 = (accesstoLayoutAlignaXe7zB0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, accesstolayoutalignaxe7zb0.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageType, accesstolayoutalignaxe7zb0.messageType}, getCieXyz.write())).booleanValue() ^ true);
    }
}
