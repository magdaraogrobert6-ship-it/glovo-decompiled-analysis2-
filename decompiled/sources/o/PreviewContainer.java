package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.value;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class PreviewContainer implements uiMode {
    public static final QrCodeScanTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 55;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            value valueVar = value.RemoteActionCompatParcelizer;
            int i4 = read + 123;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return valueVar;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String description;
    public final ComposeAnimationState enterPinButton;
    public final boolean isOptional;
    public final boolean isSuccess;
    public final PreviewParameter qrScanScreen;
    public final ComposeAnimationState scanQrCodeButton;
    public final String taskId;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$Companion] */
    static {
        int i = write + 123;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 111;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.taskId;
        int i5 = i2 + 89;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final PreviewParameter RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.qrScanScreen;
        }
        throw null;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        boolean z = this.isOptional;
        int i5 = i3 + 9;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.isSuccess;
        }
        int i3 = 85 / 0;
        return this.isSuccess;
    }

    public /* synthetic */ PreviewContainer(int i, String str, boolean z, String str2, String str3, boolean z2, ComposeAnimationState composeAnimationState, ComposeAnimationState composeAnimationState2, PreviewParameter previewParameter) {
        if (255 == (i & 255)) {
            this.taskId = str;
            this.isOptional = z;
            this.title = str2;
            this.description = str3;
            this.isSuccess = z2;
            this.scanQrCodeButton = composeAnimationState;
            this.enterPinButton = composeAnimationState2;
            this.qrScanScreen = previewParameter;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 255, value.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this.isOptional) {
            return true;
        }
        if (!this.isSuccess) {
            return false;
        }
        int i5 = i3 + 25;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    public PreviewContainer(String str, boolean z, String str2, String str3, boolean z2, ComposeAnimationState composeAnimationState, ComposeAnimationState composeAnimationState2, PreviewParameter previewParameter) {
        str.getClass();
        str2.getClass();
        this.taskId = str;
        this.isOptional = z;
        this.title = str2;
        this.description = str3;
        this.isSuccess = z2;
        this.scanQrCodeButton = composeAnimationState;
        this.enterPinButton = composeAnimationState2;
        this.qrScanScreen = previewParameter;
    }

    public static PreviewContainer RemoteActionCompatParcelizer(PreviewContainer previewContainer, boolean z, PreviewParameter previewParameter, int i) {
        int i2 = 2 % 2;
        String str = previewContainer.taskId;
        boolean z2 = previewContainer.isOptional;
        String str2 = previewContainer.title;
        String str3 = previewContainer.description;
        if ((i & 16) != 0) {
            int i3 = serializer + 113;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = previewContainer.isSuccess;
        }
        boolean z3 = z;
        ComposeAnimationState composeAnimationState = previewContainer.scanQrCodeButton;
        ComposeAnimationState composeAnimationState2 = previewContainer.enterPinButton;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            previewParameter = previewContainer.qrScanScreen;
        }
        PreviewParameter previewParameter2 = previewParameter;
        previewContainer.getClass();
        str.getClass();
        str2.getClass();
        composeAnimationState.getClass();
        composeAnimationState2.getClass();
        previewParameter2.getClass();
        PreviewContainer previewContainer2 = new PreviewContainer(str, z2, str2, str3, z3, composeAnimationState, composeAnimationState2, previewParameter2);
        int i5 = serializer + 37;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return previewContainer2;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 69;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.isOptional), 31, this.title);
        String str = this.description;
        if (str == null) {
            int i5 = RemoteActionCompatParcelizer + 85;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i7 = RemoteActionCompatParcelizer + 41;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i = iHashCode;
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + i) * 31, 31, this.isSuccess);
        int iHashCode2 = this.scanQrCodeButton.hashCode();
        return this.qrScanScreen.hashCode() + ((this.enterPinButton.hashCode() + ((iHashCode2 + iM2) * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("QrCodeScanTaskUiItem(taskId=", this.taskId, ", isOptional=", ", title=", this.isOptional);
        c8$$ExternalSyntheticOutline0.m(sbM, this.title, ", description=", this.description, ", isSuccess=");
        sbM.append(this.isSuccess);
        sbM.append(", scanQrCodeButton=");
        sbM.append(this.scanQrCodeButton);
        sbM.append(", enterPinButton=");
        sbM.append(this.enterPinButton);
        sbM.append(", qrScanScreen=");
        sbM.append(this.qrScanScreen);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 21;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 57;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (!(obj instanceof PreviewContainer)) {
            return false;
        }
        PreviewContainer previewContainer = (PreviewContainer) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, previewContainer.taskId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.isOptional != previewContainer.isOptional) {
            int i5 = serializer + 47;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, previewContainer.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, previewContainer.description}, getCieXyz.write())).booleanValue()) {
            int i7 = RemoteActionCompatParcelizer + 109;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (this.isSuccess != previewContainer.isSuccess) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scanQrCodeButton, previewContainer.scanQrCodeButton}, getCieXyz.write())).booleanValue()) {
            int i9 = RemoteActionCompatParcelizer + 33;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.enterPinButton, previewContainer.enterPinButton}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.qrScanScreen, previewContainer.qrScanScreen}, getCieXyz.write())).booleanValue();
    }
}
