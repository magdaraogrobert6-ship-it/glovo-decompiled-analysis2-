package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$TransferChangeItem$TaskData$Companion;
import kotlinx.serialization.Serializable;
import o.CompositionDataTreeKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isCall {
    public static final CashPaymentTaskUiItem$TransferChangeItem$TaskData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$TransferChangeItem$TaskData$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 57;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                CompositionDataTreeKt compositionDataTreeKt = CompositionDataTreeKt.write;
                obj.hashCode();
                throw null;
            }
            CompositionDataTreeKt compositionDataTreeKt2 = CompositionDataTreeKt.write;
            int i3 = RemoteActionCompatParcelizer + 41;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return compositionDataTreeKt2;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String calculatorTitle;
    public final String changeAmountTitle;
    public final String description;
    public final String descriptionTitle;
    public final String enterAmountMessage;
    public final String inputAmountPlaceholder;
    public final String inputAmountValidationErrorMessage;
    public final String inputAmountValidationRegex;
    public final String title;
    public final String transferChangeButtonText;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$TransferChangeItem$TaskData$Companion] */
    static {
        int i = IconCompatParcelizer + 73;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ isCall(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (1023 == (i & 1023)) {
            this.title = str;
            this.descriptionTitle = str2;
            this.description = str3;
            this.enterAmountMessage = str4;
            this.inputAmountPlaceholder = str5;
            this.inputAmountValidationRegex = str6;
            this.inputAmountValidationErrorMessage = str7;
            this.calculatorTitle = str8;
            this.changeAmountTitle = str9;
            this.transferChangeButtonText = str10;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1023, CompositionDataTreeKt.write.getDescriptor());
        throw null;
    }

    public isCall(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        m1$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
        this.title = str;
        this.descriptionTitle = str2;
        this.description = str3;
        this.enterAmountMessage = str4;
        this.inputAmountPlaceholder = str5;
        this.inputAmountValidationRegex = str6;
        this.inputAmountValidationErrorMessage = str7;
        this.calculatorTitle = str8;
        this.changeAmountTitle = str9;
        this.transferChangeButtonText = str10;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TaskData(title=", this.title, ", descriptionTitle=", this.descriptionTitle, ", description=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.description, ", enterAmountMessage=", this.enterAmountMessage, ", inputAmountPlaceholder=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.inputAmountPlaceholder, ", inputAmountValidationRegex=", this.inputAmountValidationRegex, ", inputAmountValidationErrorMessage=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.inputAmountValidationErrorMessage, ", calculatorTitle=", this.calculatorTitle, ", changeAmountTitle=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.changeAmountTitle, ", transferChangeButtonText=", this.transferChangeButtonText, ")");
        int i4 = serializer + 81;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.transferChangeButtonText.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.descriptionTitle), 31, this.description), 31, this.enterAmountMessage), 31, this.inputAmountPlaceholder), 31, this.inputAmountValidationRegex), 31, this.inputAmountValidationErrorMessage), 31, this.calculatorTitle), 31, this.changeAmountTitle);
        int i4 = RemoteActionCompatParcelizer + 81;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof isCall)) {
                return false;
            }
            isCall iscall = (isCall) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, iscall.title}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptionTitle, iscall.descriptionTitle}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, iscall.description}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.enterAmountMessage, iscall.enterAmountMessage}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.inputAmountPlaceholder, iscall.inputAmountPlaceholder}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.inputAmountValidationRegex, iscall.inputAmountValidationRegex}, getCieXyz.write())).booleanValue()) {
                    int i2 = serializer + 51;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 != 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.inputAmountValidationErrorMessage, iscall.inputAmountValidationErrorMessage}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.calculatorTitle, iscall.calculatorTitle}, getCieXyz.write())).booleanValue()) {
                    int i3 = RemoteActionCompatParcelizer + 51;
                    serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.changeAmountTitle, iscall.changeAmountTitle}, getCieXyz.write())).booleanValue()) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.transferChangeButtonText, iscall.transferChangeButtonText}, getCieXyz.write())).booleanValue();
                }
                int i5 = serializer + 31;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = serializer + 91;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = serializer + 61;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
