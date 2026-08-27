package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$FallbackScreen$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.PreviewParameterProvider;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessgetCountjd {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk enteredPin;
    public final String headline;
    public final String instructionMessage;
    public final String pinErrorMessage;
    public final String pinSuccessMessage;
    public final List trackingEvents;
    public final String validationPin;
    public static final QrCodeScanTaskUiItem$FallbackScreen$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$FallbackScreen$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 105;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                PreviewParameterProvider previewParameterProvider = PreviewParameterProvider.write;
                throw null;
            }
            PreviewParameterProvider previewParameterProvider2 = PreviewParameterProvider.write;
            int i3 = IconCompatParcelizer + 29;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 52 / 0;
            }
            return previewParameterProvider2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new fontScale(7))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$FallbackScreen$Companion] */
    static {
        int i = serializer + 81;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk serializer() {
        int i = 2 % 2;
        int i2 = write + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.enteredPin;
        }
        int i3 = 22 / 0;
        return this.enteredPin;
    }

    public accessgetCountjd(String str, String str2, String str3, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str4, String str5, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        str4.getClass();
        str5.getClass();
        this.instructionMessage = str;
        this.headline = str2;
        this.validationPin = str3;
        this.enteredPin = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.pinSuccessMessage = str4;
        this.pinErrorMessage = str5;
        this.trackingEvents = list;
    }

    public /* synthetic */ accessgetCountjd(int i, String str, String str2, String str3, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str4, String str5, List list) {
        if (127 != (i & 127)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 127, PreviewParameterProvider.write.getDescriptor());
            throw null;
        }
        this.instructionMessage = str;
        this.headline = str2;
        this.validationPin = str3;
        this.enteredPin = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.pinSuccessMessage = str4;
        this.pinErrorMessage = str5;
        this.trackingEvents = list;
    }

    public static accessgetCountjd IconCompatParcelizer(accessgetCountjd accessgetcountjd, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
        int i = 2 % 2;
        String str = accessgetcountjd.instructionMessage;
        String str2 = accessgetcountjd.headline;
        String str3 = accessgetcountjd.validationPin;
        String str4 = accessgetcountjd.pinSuccessMessage;
        String str5 = accessgetcountjd.pinErrorMessage;
        List list = accessgetcountjd.trackingEvents;
        accessgetcountjd.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        str4.getClass();
        str5.getClass();
        list.getClass();
        accessgetCountjd accessgetcountjd2 = new accessgetCountjd(str, str2, str3, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str4, str5, list);
        int i2 = read + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return accessgetcountjd2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.instructionMessage.hashCode() * 31, 31, this.headline), 31, this.validationPin);
        int iHashCode = this.trackingEvents.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.enteredPin.hashCode() + iM) * 31, 31, this.pinSuccessMessage), 31, this.pinErrorMessage);
        int i4 = write + 103;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("FallbackScreen(instructionMessage=", this.instructionMessage, ", headline=", this.headline, ", validationPin=");
        sbM.append(this.validationPin);
        sbM.append(", enteredPin=");
        sbM.append(this.enteredPin);
        sbM.append(", pinSuccessMessage=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.pinSuccessMessage, ", pinErrorMessage=", this.pinErrorMessage, ", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.trackingEvents, ")");
        int i4 = read + 25;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetCountjd)) {
            return false;
        }
        accessgetCountjd accessgetcountjd = (accessgetCountjd) obj;
        Object[] objArr = {this.instructionMessage, accessgetcountjd.instructionMessage};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.headline, accessgetcountjd.headline};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.validationPin, accessgetcountjd.validationPin};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.enteredPin, accessgetcountjd.enteredPin};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.pinSuccessMessage, accessgetcountjd.pinSuccessMessage};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            int i2 = read + 13;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object[] objArr6 = {this.pinErrorMessage, accessgetcountjd.pinErrorMessage};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
            int i3 = read + 61;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        Object[] objArr7 = {this.trackingEvents, accessgetcountjd.trackingEvents};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i5 = read + 53;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
