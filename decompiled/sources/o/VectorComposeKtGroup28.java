package o;

import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostEncounteredError$Payload$Companion;
import kotlinx.serialization.Serializable;
import o.VectorComposeKtGroup27;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposeKtGroup28 {
    public static final HostMessage$HostEncounteredError$Payload$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostEncounteredError$Payload$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VectorComposeKtGroup27.serializer;
        }
    };
    public final String duringMessageType;
    public final VectorComposeKtGroup24 error;

    public /* synthetic */ VectorComposeKtGroup28(int i, String str, VectorComposeKtGroup24 vectorComposeKtGroup24) {
        if (1 == (i & 1)) {
            this.duringMessageType = str;
            if ((i & 2) == 0) {
                this.error = null;
                return;
            } else {
                this.error = vectorComposeKtGroup24;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, VectorComposeKtGroup27.serializer.getDescriptor());
        throw null;
    }

    public VectorComposeKtGroup28(VectorComposeKtGroup24 vectorComposeKtGroup24) {
        this.duringMessageType = "HOST_ENCOUNTERED_ERROR";
        this.error = vectorComposeKtGroup24;
    }
}
