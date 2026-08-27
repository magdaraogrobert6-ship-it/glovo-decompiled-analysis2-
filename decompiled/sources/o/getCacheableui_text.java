package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.entities.softpos.detail.ReceiptDetail$Companion;
import kotlinx.serialization.Serializable;
import o.loadWithTimeoutOrNullui_text;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getCacheableui_text {
    public static final ReceiptDetail$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.entities.softpos.detail.ReceiptDetail$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 111;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                loadWithTimeoutOrNullui_text loadwithtimeoutornullui_text = loadWithTimeoutOrNullui_text.IconCompatParcelizer;
                throw null;
            }
            loadWithTimeoutOrNullui_text loadwithtimeoutornullui_text2 = loadWithTimeoutOrNullui_text.IconCompatParcelizer;
            int i3 = serializer + 35;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return loadwithtimeoutornullui_text2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final String key;
    public final String value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.entities.softpos.detail.ReceiptDetail$Companion] */
    static {
        int i = IconCompatParcelizer + 75;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 50 / 0;
        }
    }

    public /* synthetic */ getCacheableui_text(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.key = str;
            this.value = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, loadWithTimeoutOrNullui_text.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ReceiptDetail(key=", this.key, ", value=", this.value, ")");
            int i3 = read + 109;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strWrite;
            }
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ReceiptDetail(key=", this.key, ", value=", this.value, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 25;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.value.hashCode() + (this.key.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 73;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 67;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(!(obj instanceof getCacheableui_text))) {
            getCacheableui_text getcacheableui_text = (getCacheableui_text) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, getcacheableui_text.key}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, getcacheableui_text.value}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i7 = read + 45;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = i3 + 71;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
