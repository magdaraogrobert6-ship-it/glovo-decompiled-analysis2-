package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.startworking.data.startworking.oneclick.Label$Companion;
import kotlinx.serialization.Serializable;
import o.enableMockNetworkRequestsAndDropEventsMode;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class enableDelayedInitialization {
    public static final Label$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.Label$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 33;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return enableMockNetworkRequestsAndDropEventsMode.read;
            }
            enableMockNetworkRequestsAndDropEventsMode enablemocknetworkrequestsanddropeventsmode = enableMockNetworkRequestsAndDropEventsMode.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.Label$Companion] */
    static {
        int i = IconCompatParcelizer + 89;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ enableDelayedInitialization(int i, String str) {
        if (1 == (i & 1)) {
            this.text = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, enableMockNetworkRequestsAndDropEventsMode.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.text.hashCode();
        }
        this.text.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 37;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("Label(text=", this.text, ")");
        int i4 = read + 61;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 15;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableDelayedInitialization)) {
            int i4 = i2 + 5;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, ((enableDelayedInitialization) obj).text}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = read + 107;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
