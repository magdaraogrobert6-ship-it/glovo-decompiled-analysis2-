package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$ClientQuickReplyMessageSelected$Payload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class pathMoveNodeFromArgs {
    public static final BridgeMessage$ClientQuickReplyMessageSelected$Payload$Companion Companion = new BridgeMessage$ClientQuickReplyMessageSelected$Payload$Companion();
    public final String selectedQuickReply;

    public final String serializer() {
        return this.selectedQuickReply;
    }

    public final int hashCode() {
        return this.selectedQuickReply.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pathMoveNodeFromArgs)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.selectedQuickReply, ((pathMoveNodeFromArgs) obj).selectedQuickReply}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Payload(selectedQuickReply="), this.selectedQuickReply, ')');
    }

    public /* synthetic */ pathMoveNodeFromArgs(int i, String str) {
        if (1 == (i & 1)) {
            this.selectedQuickReply = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, addPathNodes.write.getDescriptor());
            throw null;
        }
    }
}
