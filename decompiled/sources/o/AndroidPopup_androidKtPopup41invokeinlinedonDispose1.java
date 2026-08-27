package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$ExternalComponents$ErrorMessage$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidPopup_androidKtPopup51;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "error_message")
public final class AndroidPopup_androidKtPopup41invokeinlinedonDispose1 implements AndroidPopup_androidKtPopup31 {
    public static final StateV3$ExternalComponents$ErrorMessage$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$ExternalComponents$ErrorMessage$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 25;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return AndroidPopup_androidKtPopup51.serializer;
            }
            int i3 = 10 / 0;
            return AndroidPopup_androidKtPopup51.serializer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String message;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$ExternalComponents$ErrorMessage$Companion] */
    static {
        int i = write + 17;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AndroidPopup_androidKtPopup41invokeinlinedonDispose1(int i, String str) {
        if (1 == (i & 1)) {
            this.message = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidPopup_androidKtPopup51.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.message.hashCode();
        }
        this.message.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("ErrorMessage(message=", this.message, ")");
        int i4 = read + 5;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 63;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 21;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof AndroidPopup_androidKtPopup41invokeinlinedonDispose1) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, ((AndroidPopup_androidKtPopup41invokeinlinedonDispose1) obj).message}, getCieXyz.write())).booleanValue();
        }
        int i8 = i2 + 19;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
