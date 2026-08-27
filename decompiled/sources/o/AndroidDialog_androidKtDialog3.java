package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$Payment$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidDialog_androidKtDialog11;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "payment")
public final class AndroidDialog_androidKtDialog3 extends accessgetCurrentlyFocusedRect {
    public static final StateV3$AcceptData$Payment$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Payment$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 57;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidDialog_androidKtDialog11 androidDialog_androidKtDialog11 = AndroidDialog_androidKtDialog11.RemoteActionCompatParcelizer;
            int i4 = write + 69;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return androidDialog_androidKtDialog11;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final String formattedAmount;
    public final boolean newDesign;
    public final AndroidDialog_androidKtDialogLayout2 paymentOptions;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Payment$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 125;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AndroidDialog_androidKtDialog3(int i, String str, String str2, AndroidDialog_androidKtDialogLayout2 androidDialog_androidKtDialogLayout2, boolean z) {
        if (3 == (i & 3)) {
            this.title = str;
            this.formattedAmount = str2;
            if ((i & 4) == 0) {
                this.paymentOptions = null;
            } else {
                this.paymentOptions = androidDialog_androidKtDialogLayout2;
            }
            int i2 = 2 % 2;
            if ((i & 8) == 0) {
                int i3 = IconCompatParcelizer + 93;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                this.newDesign = i3 % 2 == 0;
                return;
            } else {
                this.newDesign = z;
                int i4 = IconCompatParcelizer + 9;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AndroidDialog_androidKtDialog11.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.formattedAmount);
        AndroidDialog_androidKtDialogLayout2 androidDialog_androidKtDialogLayout2 = this.paymentOptions;
        if (androidDialog_androidKtDialogLayout2 == null) {
            int i4 = read + 15;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 7;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = androidDialog_androidKtDialogLayout2.hashCode();
        }
        int iHashCode2 = Boolean.hashCode(this.newDesign) + ((iM + iHashCode) * 31);
        int i9 = read + 93;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Payment(title=", this.title, ", formattedAmount=", this.formattedAmount, ", paymentOptions=");
        sbM.append(this.paymentOptions);
        sbM.append(", newDesign=");
        sbM.append(this.newDesign);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 35;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidDialog_androidKtDialog3) {
            AndroidDialog_androidKtDialog3 androidDialog_androidKtDialog3 = (AndroidDialog_androidKtDialog3) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidDialog_androidKtDialog3.title}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 15;
                int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                read = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 125;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.formattedAmount, androidDialog_androidKtDialog3.formattedAmount}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentOptions, androidDialog_androidKtDialog3.paymentOptions}, getCieXyz.write())).booleanValue())) {
                if (this.newDesign != androidDialog_androidKtDialog3.newDesign) {
                    return false;
                }
                int i7 = IconCompatParcelizer + 27;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i8 = IconCompatParcelizer + 103;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = read + 39;
        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 != 0;
    }
}
