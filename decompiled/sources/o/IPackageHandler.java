package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.PaymentResponse$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.verbose;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class IPackageHandler {
    public static final PaymentResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.PaymentResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 101;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            verbose verboseVar = verbose.IconCompatParcelizer;
            int i4 = serializer + 123;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return verboseVar;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final String infraLevel;
    public final String lastPaymentTime;
    public final String nextPaymentTime;
    public final addPackage pin;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.PaymentResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 91;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
        }
    }

    public /* synthetic */ IPackageHandler(int i, String str, addPackage addpackage, String str2, String str3) {
        if (15 == (i & 15)) {
            this.infraLevel = str;
            this.pin = addpackage;
            this.nextPaymentTime = str2;
            this.lastPaymentTime = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, verbose.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.infraLevel.hashCode();
        int iHashCode2 = this.lastPaymentTime.hashCode() + af$$ExternalSyntheticOutline0.m((this.pin.hashCode() + (iHashCode * 31)) * 31, 31, this.nextPaymentTime);
        int i4 = RemoteActionCompatParcelizer + 43;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PaymentResponse(infraLevel=");
        sb.append(this.infraLevel);
        sb.append(", pin=");
        sb.append(this.pin);
        sb.append(", nextPaymentTime=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.nextPaymentTime, ", lastPaymentTime=", this.lastPaymentTime, ")");
        int i2 = RemoteActionCompatParcelizer + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IPackageHandler) {
            IPackageHandler iPackageHandler = (IPackageHandler) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.infraLevel, iPackageHandler.infraLevel}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pin, iPackageHandler.pin}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.nextPaymentTime, iPackageHandler.nextPaymentTime}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lastPaymentTime, iPackageHandler.lastPaymentTime}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = serializer + 71;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = serializer + 47;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = RemoteActionCompatParcelizer + 113;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
