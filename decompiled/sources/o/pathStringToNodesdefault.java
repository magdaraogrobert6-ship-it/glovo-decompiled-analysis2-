package o;

import com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$HelpCenterEncounteredError$Error$Companion;
import kotlinx.serialization.Serializable;
import o.parsePathString;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class pathStringToNodesdefault {
    public static final BridgeMessage$HelpCenterEncounteredError$Error$Companion Companion = new Object() { // from class: com.deliveryhero.selfServiceChat.data.bridge.BridgeMessage$HelpCenterEncounteredError$Error$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return parsePathString.IconCompatParcelizer;
        }
    };
    public final String description;
    public final String type;

    public /* synthetic */ pathStringToNodesdefault(int i, String str, String str2) {
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
}
