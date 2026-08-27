package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$CloseHelpCenter$Companion;
import kotlinx.serialization.Serializable;
import o.pathRelativeMoveNodeFromArgs;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_ASKS_FOR_SHUTDOWN")
public final class resizeNodeData extends getY2 {
    public static final BridgeMessage$CloseHelpCenter$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$CloseHelpCenter$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return pathRelativeMoveNodeFromArgs.IconCompatParcelizer;
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
        if (!(obj instanceof resizeNodeData)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, ((resizeNodeData) obj).bridgeMessageID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("CloseHelpCenter(bridgeMessageID="), this.bridgeMessageID, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ resizeNodeData(int i, String str, String str2, String str3) {
        super(str, str2);
        if (7 == (i & 7)) {
            this.bridgeMessageID = str3;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, pathRelativeMoveNodeFromArgs.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public resizeNodeData(String str) {
        super(str, "HELPCENTER_ASKS_FOR_SHUTDOWN", 0);
        this.bridgeMessageID = str;
    }
}
