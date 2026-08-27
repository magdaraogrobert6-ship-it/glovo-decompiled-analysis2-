package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrCode$Companion;
import kotlinx.serialization.Serializable;
import o.PreviewParameterProviderDefaultImpls;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getDisplayName {
    public static final QrPaymentTaskUiItem$QrCode$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrCode$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 125;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PreviewParameterProviderDefaultImpls previewParameterProviderDefaultImpls = PreviewParameterProviderDefaultImpls.RemoteActionCompatParcelizer;
            int i4 = serializer + 49;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return previewParameterProviderDefaultImpls;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final double amount;
    public final String amountToShow;
    public final String description;
    public final boolean isOptional;
    public final PreviewScreenSizes qrPaymentDetails;
    public final PreviewWrapper qrPaymentScreen;
    public final ComposeAnimationState showQrCodeButton;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrCode$Companion] */
    static {
        int i = IconCompatParcelizer + 57;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getDisplayName(int i, String str, String str2, ComposeAnimationState composeAnimationState, PreviewWrapper previewWrapper, double d, boolean z, PreviewScreenSizes previewScreenSizes, String str3) {
        if (255 == (i & 255)) {
            this.title = str;
            this.description = str2;
            this.showQrCodeButton = composeAnimationState;
            this.qrPaymentScreen = previewWrapper;
            this.amount = d;
            this.isOptional = z;
            this.qrPaymentDetails = previewScreenSizes;
            this.amountToShow = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 255, PreviewParameterProviderDefaultImpls.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public getDisplayName(String str, String str2, ComposeAnimationState composeAnimationState, PreviewWrapper previewWrapper, double d, boolean z, PreviewScreenSizes previewScreenSizes, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.title = str;
        this.description = str2;
        this.showQrCodeButton = composeAnimationState;
        this.qrPaymentScreen = previewWrapper;
        this.amount = d;
        this.isOptional = z;
        this.qrPaymentDetails = previewScreenSizes;
        this.amountToShow = str3;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
        ComposeAnimationState composeAnimationState = this.showQrCodeButton;
        int iHashCode2 = 0;
        if (composeAnimationState == null) {
            int i2 = read + 37;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = composeAnimationState.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.amount, (this.qrPaymentScreen.hashCode() + ((iM + iHashCode) * 31)) * 31, 31), 31, this.isOptional);
        PreviewScreenSizes previewScreenSizes = this.qrPaymentDetails;
        if (previewScreenSizes == null) {
            int i4 = serializer + 33;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = previewScreenSizes.hashCode();
        }
        return this.amountToShow.hashCode() + ((iM2 + iHashCode2) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("QrCode(title=", this.title, ", description=", this.description, ", showQrCodeButton=");
        sbM.append(this.showQrCodeButton);
        sbM.append(", qrPaymentScreen=");
        sbM.append(this.qrPaymentScreen);
        sbM.append(", amount=");
        sbM.append(this.amount);
        sbM.append(", isOptional=");
        sbM.append(this.isOptional);
        sbM.append(", qrPaymentDetails=");
        sbM.append(this.qrPaymentDetails);
        sbM.append(", amountToShow=");
        sbM.append(this.amountToShow);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 105;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getDisplayName)) {
            return false;
        }
        getDisplayName getdisplayname = (getDisplayName) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getdisplayname.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getdisplayname.description}, getCieXyz.write())).booleanValue()) {
            int i7 = serializer;
            int i8 = i7 + 89;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            boolean z = i8 % 2 == 0;
            int i9 = i7 + 117;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                return z;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.showQrCodeButton, getdisplayname.showQrCodeButton}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.qrPaymentScreen, getdisplayname.qrPaymentScreen}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (Double.compare(this.amount, getdisplayname.amount) == 0) {
            if (this.isOptional != getdisplayname.isOptional) {
                int i10 = serializer + 59;
                read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i10 % 2 == 0;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.qrPaymentDetails, getdisplayname.qrPaymentDetails}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.amountToShow, getdisplayname.amountToShow}, getCieXyz.write())).booleanValue();
            }
            return false;
        }
        int i11 = serializer + 81;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
