package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostNotifiesAboutVisibilityChange$Payload$Companion;
import kotlinx.serialization.Serializable;
import o.getParagraphStyles;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getAnnotationsui_text {
    public static final HostMessage$HostNotifiesAboutVisibilityChange$Payload$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostNotifiesAboutVisibilityChange$Payload$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 65;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getParagraphStyles.read;
            }
            int i3 = 79 / 0;
            return getParagraphStyles.read;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final boolean isWebViewVisible;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostNotifiesAboutVisibilityChange$Payload$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 67;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 5 / 0;
        }
    }

    public /* synthetic */ getAnnotationsui_text(int i, boolean z) {
        if (1 == (i & 1)) {
            this.isWebViewVisible = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getParagraphStyles.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isWebViewVisible);
        int i4 = IconCompatParcelizer + 15;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return MediaSessionCompatQueueItem.serializer("Payload(isWebViewVisible=", ")", this.isWebViewVisible);
        }
        int i3 = 76 / 0;
        return MediaSessionCompatQueueItem.serializer("Payload(isWebViewVisible=", ")", this.isWebViewVisible);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 29;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            return (obj instanceof getAnnotationsui_text) && this.isWebViewVisible == ((getAnnotationsui_text) obj).isWebViewVisible;
        }
        int i5 = i2 + 35;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    public getAnnotationsui_text(boolean z) {
        this.isWebViewVisible = z;
    }
}
