package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$HelpcenterWontHandleBackNavigation$Companion;
import kotlinx.serialization.Serializable;
import o.VNode;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_WONT_HANDLE_BACK_NAVIGATION")
public final class toRadians extends getY2 {
    public static final BridgeMessage$HelpcenterWontHandleBackNavigation$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$HelpcenterWontHandleBackNavigation$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VNode.read;
        }
    };
    public final String bridgeMessageID;

    public final int hashCode() {
        return this.bridgeMessageID.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toRadians)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, ((toRadians) obj).bridgeMessageID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("HelpcenterWontHandleBackNavigation(bridgeMessageID="), this.bridgeMessageID, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ toRadians(int i, String str, String str2, String str3) {
        super(str, str2);
        if (7 == (i & 7)) {
            this.bridgeMessageID = str3;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, VNode.read.getDescriptor());
            throw null;
        }
    }

    public toRadians(String str) {
        super(str, "HELPCENTER_WONT_HANDLE_BACK_NAVIGATION", 0);
        this.bridgeMessageID = str;
    }
}
