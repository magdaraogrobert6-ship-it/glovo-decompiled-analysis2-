package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$HelpCenterEncounteredError$Companion;
import kotlinx.serialization.Serializable;
import o.PathParser;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "HELPCENTER_ENCOUNTERED_ERROR")
public final class pathNodesFromArgs extends getY2 {
    public static final BridgeMessage$HelpCenterEncounteredError$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$HelpCenterEncounteredError$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return PathParser.RemoteActionCompatParcelizer;
        }
    };
    public final String bridgeMessageID;
    public final pathStringToNodes payload;

    public final int hashCode() {
        return this.payload.hashCode() + (this.bridgeMessageID.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pathNodesFromArgs)) {
            return false;
        }
        pathNodesFromArgs pathnodesfromargs = (pathNodesFromArgs) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, pathnodesfromargs.bridgeMessageID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, pathnodesfromargs.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "HelpCenterEncounteredError(bridgeMessageID=" + this.bridgeMessageID + ", payload=" + this.payload + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pathNodesFromArgs(int i, String str, String str2, String str3, pathStringToNodes pathstringtonodes) {
        super(str, str2);
        if (15 == (i & 15)) {
            this.bridgeMessageID = str3;
            this.payload = pathstringtonodes;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, PathParser.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pathNodesFromArgs(String str, pathStringToNodes pathstringtonodes) {
        super(str, "HELPCENTER_ENCOUNTERED_ERROR", 0);
        pathstringtonodes.getClass();
        this.bridgeMessageID = str;
        this.payload = pathstringtonodes;
    }
}
