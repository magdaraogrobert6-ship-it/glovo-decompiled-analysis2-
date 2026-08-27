package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostEncounteredError$Error$Companion;
import kotlinx.serialization.Serializable;
import o.accesstoLayoutTextGranularityduNsdkg;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accesstoLayoutHyphenationFrequency3fSNIE {
    public static final HostMessage$HostEncounteredError$Error$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostEncounteredError$Error$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 123;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accesstoLayoutTextGranularityduNsdkg accesstolayouttextgranularitydunsdkg = accesstoLayoutTextGranularityduNsdkg.write;
            int i4 = RemoteActionCompatParcelizer + 67;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return accesstolayouttextgranularitydunsdkg;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String description;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostEncounteredError$Error$Companion] */
    static {
        int i = write + 57;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accesstoLayoutHyphenationFrequency3fSNIE(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = str;
            int i2 = RemoteActionCompatParcelizer + 125;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            this.type = null;
            return;
        }
        this.type = str2;
        int i4 = RemoteActionCompatParcelizer + 97;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public accesstoLayoutHyphenationFrequency3fSNIE(String str) {
        this.description = str;
        this.type = "HOST_ENCOUNTERED_ERROR";
    }
}
