package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.database.entity.PaymentConfirmation$Companion;
import kotlinx.serialization.Serializable;
import o.getTopJ6kI3mc;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class getIncludeFontPaddingannotations {
    public static final PaymentConfirmation$Companion Companion = new Object() { // from class: com.roadrunner.database.entity.PaymentConfirmation$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 1;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getTopJ6kI3mc gettopj6ki3mc = getTopJ6kI3mc.write;
            int i4 = serializer + 5;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return gettopj6ki3mc;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final boolean isPaid;
    public final String paymentConfirmationBackupCode;
    public final String paymentConfirmationCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.database.entity.PaymentConfirmation$Companion] */
    static {
        int i = serializer + 99;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getIncludeFontPaddingannotations(int i, String str, String str2, boolean z) {
        if (7 == (i & 7)) {
            this.isPaid = z;
            this.paymentConfirmationCode = str;
            this.paymentConfirmationBackupCode = str2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getTopJ6kI3mc.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.paymentConfirmationBackupCode.hashCode() + af$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isPaid) * 31, 31, this.paymentConfirmationCode);
        int i4 = read + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PaymentConfirmation(isPaid=");
        sb.append(this.isPaid);
        sb.append(", paymentConfirmationCode=");
        sb.append(this.paymentConfirmationCode);
        sb.append(", paymentConfirmationBackupCode=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.paymentConfirmationBackupCode, ")");
        int i2 = RemoteActionCompatParcelizer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getIncludeFontPaddingannotations) {
                getIncludeFontPaddingannotations getincludefontpaddingannotations = (getIncludeFontPaddingannotations) obj;
                if (this.isPaid != getincludefontpaddingannotations.isPaid) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentConfirmationCode, getincludefontpaddingannotations.paymentConfirmationCode}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentConfirmationBackupCode, getincludefontpaddingannotations.paymentConfirmationBackupCode}, getCieXyz.write())).booleanValue())) {
                    return true;
                }
                int i2 = RemoteActionCompatParcelizer + 51;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = RemoteActionCompatParcelizer + 95;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = read + 109;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
