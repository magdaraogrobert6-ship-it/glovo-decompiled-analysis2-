package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$CardItem$Companion;
import kotlinx.serialization.Serializable;
import o.CompositionCallStack;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class CallGroup {
    public static final CardCashPaymentTaskUiItem$CardItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$CardItem$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 25;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            CompositionCallStack compositionCallStack = CompositionCallStack.serializer;
            int i4 = write + 85;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
            }
            return compositionCallStack;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final String actionButtonText;
    public final double amount;
    public final String currency;
    public final String errorDescription;
    public final String errorTitle;
    public final String formattedOriginalAmount;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$CardItem$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 7;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final double read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        double d = this.amount;
        int i5 = i3 + 91;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return d;
    }

    public /* synthetic */ CallGroup(int i, double d, String str, String str2, String str3, String str4, String str5, String str6) {
        if (31 == (i & 31)) {
            this.amount = d;
            this.formattedOriginalAmount = str;
            this.currency = str2;
            this.title = str3;
            this.actionButtonText = str4;
            if ((i & 32) == 0) {
                this.errorTitle = "";
            } else {
                this.errorTitle = str5;
                int i2 = IconCompatParcelizer + 99;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if ((i & 64) == 0) {
                this.errorDescription = "";
                return;
            }
            this.errorDescription = str6;
            int i5 = read + 27;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, CompositionCallStack.serializer.getDescriptor());
        throw null;
    }

    public static CallGroup RemoteActionCompatParcelizer(CallGroup callGroup, double d) {
        int i = 2 % 2;
        String str = callGroup.formattedOriginalAmount;
        String str2 = callGroup.currency;
        String str3 = callGroup.title;
        String str4 = callGroup.actionButtonText;
        String str5 = callGroup.errorTitle;
        String str6 = callGroup.errorDescription;
        callGroup.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        CallGroup callGroup2 = new CallGroup(d, str, str2, str3, str4, str5, str6);
        int i2 = IconCompatParcelizer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return callGroup2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.errorDescription.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Double.hashCode(this.amount) * 31, 31, this.formattedOriginalAmount), 31, this.currency), 31, this.title), 31, this.actionButtonText), 31, this.errorTitle);
        int i4 = read + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public CallGroup(double d, String str, String str2, String str3, String str4, String str5, String str6) {
        m1$$ExternalSyntheticOutline0.m(str2, str3, str4, str5, str6);
        this.amount = d;
        this.formattedOriginalAmount = str;
        this.currency = str2;
        this.title = str3;
        this.actionButtonText = str4;
        this.errorTitle = str5;
        this.errorDescription = str6;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CardItem(amount=");
        sb.append(this.amount);
        sb.append(", formattedOriginalAmount=");
        sb.append(this.formattedOriginalAmount);
        c8$$ExternalSyntheticOutline0.m(sb, ", currency=", this.currency, ", title=", this.title);
        c8$$ExternalSyntheticOutline0.m(sb, ", actionButtonText=", this.actionButtonText, ", errorTitle=", this.errorTitle);
        String strM = d$$ExternalSyntheticOutline0.m(sb, ", errorDescription=", this.errorDescription, ")");
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 29;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CallGroup)) {
            return false;
        }
        CallGroup callGroup = (CallGroup) obj;
        if (Double.compare(this.amount, callGroup.amount) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.formattedOriginalAmount, callGroup.formattedOriginalAmount}, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 91;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currency, callGroup.currency}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, callGroup.title}, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 7;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionButtonText, callGroup.actionButtonText}, getCieXyz.write())).booleanValue()) {
            int i8 = read + 19;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorTitle, callGroup.errorTitle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.errorDescription, callGroup.errorDescription}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i9 = IconCompatParcelizer + 121;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
