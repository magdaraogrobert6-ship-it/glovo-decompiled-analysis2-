package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientQuickReplyMessageSelected$Companion;
import kotlinx.serialization.Serializable;
import o.PathNodeVerticalTo;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_QUICK_REPLY_SENT")
public final class PathNodeKt extends getY2 {
    public static final BridgeMessage$ClientQuickReplyMessageSelected$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientQuickReplyMessageSelected$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return PathNodeVerticalTo.write;
        }
    };
    public final String bridgeMessageID;
    public final pathMoveNodeFromArgs payload;

    public final int hashCode() {
        return this.payload.hashCode() + (this.bridgeMessageID.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathNodeKt)) {
            return false;
        }
        PathNodeKt pathNodeKt = (PathNodeKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bridgeMessageID, pathNodeKt.bridgeMessageID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payload, pathNodeKt.payload}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ClientQuickReplyMessageSelected(bridgeMessageID=" + this.bridgeMessageID + ", payload=" + this.payload + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PathNodeKt(int i, String str, String str2, String str3, pathMoveNodeFromArgs pathmovenodefromargs) {
        super(str, str2);
        if (15 == (i & 15)) {
            this.bridgeMessageID = str3;
            this.payload = pathmovenodefromargs;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, PathNodeVerticalTo.write.getDescriptor());
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathNodeKt(String str, pathMoveNodeFromArgs pathmovenodefromargs) {
        super(str, "CLIENT_CHAT_NOTIFIES_ABOUT_QUICK_REPLY_SENT", 0);
        pathmovenodefromargs.getClass();
        this.bridgeMessageID = str;
        this.payload = pathmovenodefromargs;
    }
}
