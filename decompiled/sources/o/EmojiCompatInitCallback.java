package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.ReasonPayload$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setScrimColor;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EmojiCompatInitCallback {
    public static final ReasonPayload$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.ReasonPayload$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 81;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                setScrimColor setscrimcolor = setScrimColor.write;
                throw null;
            }
            setScrimColor setscrimcolor2 = setScrimColor.write;
            int i3 = read + 47;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return setscrimcolor2;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String orderId;
    public final setDrawerLockMode preChatValues;
    public final String reasonCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.ReasonPayload$Companion] */
    static {
        int i = read + 37;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ EmojiCompatInitCallback(int i, String str, setDrawerLockMode setdrawerlockmode, String str2) {
        if (7 == (i & 7)) {
            this.reasonCode = str;
            this.preChatValues = setdrawerlockmode;
            this.orderId = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, setScrimColor.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.reasonCode.hashCode();
        int iHashCode2 = this.orderId.hashCode() + ((this.preChatValues.hashCode() + (iHashCode * 31)) * 31);
        int i4 = IconCompatParcelizer + 9;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return iHashCode2;
    }

    public EmojiCompatInitCallback(String str, setDrawerLockMode setdrawerlockmode, String str2) {
        this.reasonCode = str;
        this.preChatValues = setdrawerlockmode;
        this.orderId = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ReasonPayload(reasonCode=");
        sb.append(this.reasonCode);
        sb.append(", preChatValues=");
        sb.append(this.preChatValues);
        sb.append(", orderId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.orderId, ")");
        int i2 = write + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 17;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiCompatInitCallback)) {
            int i4 = i2 + 115;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        EmojiCompatInitCallback emojiCompatInitCallback = (EmojiCompatInitCallback) obj;
        Object[] objArr = {this.reasonCode, emojiCompatInitCallback.reasonCode};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i6 = write + 117;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr2 = {this.preChatValues, emojiCompatInitCallback.preChatValues};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.orderId, emojiCompatInitCallback.orderId};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = IconCompatParcelizer + 113;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
