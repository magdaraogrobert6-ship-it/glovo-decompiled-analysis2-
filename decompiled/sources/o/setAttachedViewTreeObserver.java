package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$DeclineConfirmation$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.onGlobalFocusChanged;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setAttachedViewTreeObserver {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final List acceptDetails;
    public final String actionAccept;
    public final String actionCancel;
    public final String actionConfirm;
    public final FocusTargetInteropElement declineDetails;
    public final String message;
    public final String title;
    public static final StateV3$AcceptData$DeclineConfirmation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$DeclineConfirmation$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 79;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            onGlobalFocusChanged onglobalfocuschanged = onGlobalFocusChanged.read;
            int i4 = serializer + 73;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return onglobalfocuschanged;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(3))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$DeclineConfirmation$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 117;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setAttachedViewTreeObserver(int i, String str, String str2, String str3, String str4, String str5, FocusTargetInteropElement focusTargetInteropElement, List list) {
        if (127 == (i & 127)) {
            this.title = str;
            this.message = str2;
            this.actionConfirm = str3;
            this.actionAccept = str4;
            this.actionCancel = str5;
            this.declineDetails = focusTargetInteropElement;
            this.acceptDetails = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, onGlobalFocusChanged.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.actionConfirm), 31, this.actionAccept), 31, this.actionCancel);
        int iHashCode = this.acceptDetails.hashCode() + ((this.declineDetails.hashCode() + iM) * 31);
        int i4 = IconCompatParcelizer + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DeclineConfirmation(title=", this.title, ", message=", this.message, ", actionConfirm=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.actionConfirm, ", actionAccept=", this.actionAccept, ", actionCancel=");
        sbM.append(this.actionCancel);
        sbM.append(", declineDetails=");
        sbM.append(this.declineDetails);
        sbM.append(", acceptDetails=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.acceptDetails, ")");
        int i4 = IconCompatParcelizer + 67;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAttachedViewTreeObserver)) {
            int i2 = read + 39;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        setAttachedViewTreeObserver setattachedviewtreeobserver = (setAttachedViewTreeObserver) obj;
        Object[] objArr = {this.title, setattachedviewtreeobserver.title};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 3;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr2 = {this.message, setattachedviewtreeobserver.message};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.actionConfirm, setattachedviewtreeobserver.actionConfirm};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.actionAccept, setattachedviewtreeobserver.actionAccept};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.actionCancel, setattachedviewtreeobserver.actionCancel};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr6 = {this.declineDetails, setattachedviewtreeobserver.declineDetails};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr7 = {this.acceptDetails, setattachedviewtreeobserver.acceptDetails};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = read + 113;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
