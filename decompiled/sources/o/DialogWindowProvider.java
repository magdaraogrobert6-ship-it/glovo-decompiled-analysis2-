package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.DeeplinkActionData$Companion;
import kotlinx.serialization.Serializable;
import o.DialogWrapper;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = com.adjust.sdk.Constants.DEEPLINK)
public final class DialogWindowProvider extends getWindowTitle {
    public static final DeeplinkActionData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.DeeplinkActionData$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 47;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return DialogWrapper.IconCompatParcelizer;
            }
            int i3 = 98 / 0;
            return DialogWrapper.IconCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.DeeplinkActionData$Companion] */
    static {
        int i = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 93;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.url;
        int i4 = i2 + 109;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public /* synthetic */ DialogWindowProvider(int i, String str) {
        if (1 == (i & 1)) {
            this.url = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, DialogWrapper.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.url.hashCode();
        int i4 = read + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("DeeplinkActionData(url=", this.url, ")");
        int i4 = read + 87;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 19;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 123;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(obj instanceof DialogWindowProvider))) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, ((DialogWindowProvider) obj).url}, getCieXyz.write())).booleanValue();
        }
        int i7 = i4 + 11;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }
}
