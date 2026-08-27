package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$HelpCenterEncounteredError$Payload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class pathStringToNodes {
    public static final BridgeMessage$HelpCenterEncounteredError$Payload$Companion Companion = new BridgeMessage$HelpCenterEncounteredError$Payload$Companion();
    public final String duringMessageType;
    public final pathStringToNodesdefault error;

    public /* synthetic */ pathStringToNodes(int i, String str, pathStringToNodesdefault pathstringtonodesdefault) {
        if (1 == (i & 1)) {
            this.duringMessageType = str;
            if ((i & 2) == 0) {
                this.error = null;
                return;
            } else {
                this.error = pathstringtonodesdefault;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, toPathdefault.IconCompatParcelizer.getDescriptor());
        throw null;
    }
}
