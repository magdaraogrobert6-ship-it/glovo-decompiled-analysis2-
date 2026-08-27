package o;

import com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostEncounteredError$Error$Companion;
import kotlinx.serialization.Serializable;
import o.VectorComposeKtGroup25;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class VectorComposeKtGroup24 {
    public static final HostMessage$HostEncounteredError$Error$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.HostMessage$HostEncounteredError$Error$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return VectorComposeKtGroup25.RemoteActionCompatParcelizer;
        }
    };
    public final String description;
    public final String type;

    public /* synthetic */ VectorComposeKtGroup24(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
        }
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
    }

    public VectorComposeKtGroup24(String str) {
        this.description = str;
        this.type = "HOST_ENCOUNTERED_ERROR";
    }
}
