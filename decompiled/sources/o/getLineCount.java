package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$HelpCenterEncounteredError$Error$Companion;
import kotlinx.serialization.Serializable;
import o.getLineDescentui_text;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getLineCount {
    public static final BridgeMessage$HelpCenterEncounteredError$Error$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$HelpCenterEncounteredError$Error$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 23;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getLineDescentui_text getlinedescentui_text = getLineDescentui_text.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 109;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getlinedescentui_text;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String description;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$HelpCenterEncounteredError$Error$Companion] */
    static {
        int i = serializer + 23;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 65 / 0;
        }
    }

    public /* synthetic */ getLineCount(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.description = null;
            int i2 = IconCompatParcelizer + 103;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.description = str;
        }
        if ((i & 2) != 0) {
            this.type = str2;
            return;
        }
        int i4 = write + 17;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            this.type = null;
        } else {
            this.type = null;
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Error(description=", this.description, ", type=", this.type, ")");
            int i3 = write + 83;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strWrite;
            }
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Error(description=", this.description, ", type=", this.type, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.description;
        if (str == null) {
            int i2 = write + 97;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = IconCompatParcelizer + 89;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 5;
            }
        }
        String str2 = this.type;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getLineCount) {
            getLineCount getlinecount = (getLineCount) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getlinecount.description}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, getlinecount.type}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i2 = IconCompatParcelizer + 13;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 125;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
