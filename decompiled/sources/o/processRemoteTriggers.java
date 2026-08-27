package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.model.PhoneValidationRequest$Companion;
import kotlinx.serialization.Serializable;
import o.removeGlobalCallbackParameter;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class processRemoteTriggers {
    public static final PhoneValidationRequest$Companion Companion = new Object() { // from class: com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.model.PhoneValidationRequest$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            removeGlobalCallbackParameter removeglobalcallbackparameter;
            int i = 2 % 2;
            int i2 = read + 65;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                removeglobalcallbackparameter = removeGlobalCallbackParameter.write;
                int i3 = 85 / 0;
            } else {
                removeglobalcallbackparameter = removeGlobalCallbackParameter.write;
            }
            int i4 = read + 87;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return removeglobalcallbackparameter;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String brand;
    public final String countryCode;
    public final String phoneNumber;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.model.PhoneValidationRequest$Companion] */
    static {
        int i = serializer + 57;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 93 / 0;
        }
    }

    public /* synthetic */ processRemoteTriggers(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.phoneNumber = str;
            this.brand = str2;
            this.countryCode = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, removeGlobalCallbackParameter.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.countryCode.hashCode() + af$$ExternalSyntheticOutline0.m(this.phoneNumber.hashCode() * 31, 31, this.brand);
        int i4 = write + 43;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PhoneValidationRequest(phoneNumber=", this.phoneNumber, ", brand=", this.brand, ", countryCode="), this.countryCode, ")");
        }
        int i3 = 10 / 0;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PhoneValidationRequest(phoneNumber=", this.phoneNumber, ", brand=", this.brand, ", countryCode="), this.countryCode, ")");
    }

    public processRemoteTriggers(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.phoneNumber = str;
        this.brand = str2;
        this.countryCode = str3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof processRemoteTriggers) {
            processRemoteTriggers processremotetriggers = (processRemoteTriggers) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, processremotetriggers.phoneNumber}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, processremotetriggers.brand}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, processremotetriggers.countryCode}, getCieXyz.write())).booleanValue();
            }
            int i2 = IconCompatParcelizer + 67;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = write + 17;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
