package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.entities.softpos.detail.PaymentFailedResult$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setTypefaceui_text;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontFamily {
    public static final PaymentFailedResult$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.entities.softpos.detail.PaymentFailedResult$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 35;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return setTypefaceui_text.read;
            }
            setTypefaceui_text settypefaceui_text = setTypefaceui_text.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final String dateISO;
    public final String paymentResultText;
    public final String screenMessageText;
    public final String transactionAmount;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.entities.softpos.detail.PaymentFailedResult$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ FontFamily(String str, int i, String str2, String str3, String str4) {
        if (15 == (i & 15)) {
            this.transactionAmount = str;
            this.paymentResultText = str2;
            this.screenMessageText = str3;
            this.dateISO = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, setTypefaceui_text.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 69;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PaymentFailedResult(transactionAmount=", this.transactionAmount, ", paymentResultText=", this.paymentResultText, ", screenMessageText="), this.screenMessageText, ", dateISO=", this.dateISO, ")");
        int i4 = read + 109;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.dateISO.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.transactionAmount.hashCode() * 31, 31, this.paymentResultText), 31, this.screenMessageText);
        int i4 = read + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 125;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 91;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof FontFamily)) {
            return false;
        }
        FontFamily fontFamily = (FontFamily) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.transactionAmount, fontFamily.transactionAmount}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentResultText, fontFamily.paymentResultText}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.screenMessageText, fontFamily.screenMessageText}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dateISO, fontFamily.dateISO}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i6 = read + 107;
                    serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }
                int i8 = read + 7;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i8 % 2 != 0;
            }
            int i9 = serializer + 57;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = serializer + 33;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i11 % 2 == 0;
    }
}
