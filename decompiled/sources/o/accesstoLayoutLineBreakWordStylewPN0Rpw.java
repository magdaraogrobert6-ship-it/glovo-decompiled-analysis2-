package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostEncounteredError$Payload$Companion;
import kotlinx.serialization.Serializable;
import o.attachIndentationFixSpan;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accesstoLayoutLineBreakWordStylewPN0Rpw {
    public static final HostMessage$HostEncounteredError$Payload$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostEncounteredError$Payload$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 53;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            attachIndentationFixSpan attachindentationfixspan = attachIndentationFixSpan.write;
            int i4 = IconCompatParcelizer + 45;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return attachindentationfixspan;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String duringMessageType;
    public final accesstoLayoutHyphenationFrequency3fSNIE error;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostEncounteredError$Payload$Companion] */
    static {
        int i = IconCompatParcelizer + 1;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ accesstoLayoutLineBreakWordStylewPN0Rpw(int i, String str, accesstoLayoutHyphenationFrequency3fSNIE accesstolayouthyphenationfrequency3fsnie) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.duringMessageType = str;
            if ((i & 2) == 0) {
                this.error = null;
                int i2 = RemoteActionCompatParcelizer + 21;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.error = accesstolayouthyphenationfrequency3fsnie;
            int i3 = serializer + 101;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, attachIndentationFixSpan.write.getDescriptor());
        throw null;
    }

    public accesstoLayoutLineBreakWordStylewPN0Rpw(accesstoLayoutHyphenationFrequency3fSNIE accesstolayouthyphenationfrequency3fsnie) {
        this.duringMessageType = "HOST_ENCOUNTERED_ERROR";
        this.error = accesstolayouthyphenationfrequency3fsnie;
    }
}
