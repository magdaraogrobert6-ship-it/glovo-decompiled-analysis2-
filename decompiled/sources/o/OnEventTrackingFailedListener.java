package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.database.entity.PaymentEntity$Companion;
import kotlinx.serialization.Serializable;
import o.launchReceivedDeeplink;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class OnEventTrackingFailedListener {
    public static final PaymentEntity$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.database.entity.PaymentEntity$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return launchReceivedDeeplink.read;
            }
            launchReceivedDeeplink launchreceiveddeeplink = launchReceivedDeeplink.read;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String infraLevel;
    public final String lastPaymentTime;
    public final String nextPaymentTime;
    public final onDeeplinkResolved pin;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.database.entity.PaymentEntity$Companion] */
    static {
        int i = serializer + 43;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.infraLevel;
        int i4 = i3 + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.lastPaymentTime;
        int i5 = i3 + 57;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String read() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 59;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.nextPaymentTime;
            int i4 = 18 / 0;
        } else {
            str = this.nextPaymentTime;
        }
        int i5 = i2 + 81;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return str;
    }

    public final onDeeplinkResolved write() {
        int i = 2 % 2;
        int i2 = write + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.pin;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public /* synthetic */ OnEventTrackingFailedListener(int i, String str, onDeeplinkResolved ondeeplinkresolved, String str2, String str3) {
        int i2;
        int i3;
        if ((i & 1) == 0) {
            this.infraLevel = "";
            int i4 = write + 63;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            }
            if ((i & 2) == 0) {
                this.pin = new onDeeplinkResolved();
                i3 = write + 107;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i6 = 2 / 4;
                } else {
                    int i7 = 2 % 2;
                }
            } else {
                this.pin = ondeeplinkresolved;
            }
            if ((i & 4) == 0) {
                int i8 = IconCompatParcelizer + 11;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                this.nextPaymentTime = "";
            } else {
                this.nextPaymentTime = str2;
                i2 = write + 37;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i10 = 2 % 2;
                }
            }
            if ((i & 8) == 0) {
                this.lastPaymentTime = "";
            } else {
                this.lastPaymentTime = str3;
            }
        }
        this.infraLevel = str;
        int i11 = 2 % 2;
        if ((i & 2) == 0) {
            this.pin = new onDeeplinkResolved();
            i3 = write + 107;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i12 = 2 / 4;
            } else {
                int i13 = 2 % 2;
            }
        } else {
            this.pin = ondeeplinkresolved;
        }
        if ((i & 4) == 0) {
            int i14 = IconCompatParcelizer + 11;
            write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            this.nextPaymentTime = "";
        } else {
            this.nextPaymentTime = str2;
            i2 = write + 37;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i16 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            this.lastPaymentTime = "";
        } else {
            this.lastPaymentTime = str3;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.infraLevel.hashCode();
        int iHashCode2 = this.lastPaymentTime.hashCode() + af$$ExternalSyntheticOutline0.m((this.pin.hashCode() + (iHashCode * 31)) * 31, 31, this.nextPaymentTime);
        int i4 = IconCompatParcelizer + 97;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("PaymentEntity(infraLevel=");
        sb.append(this.infraLevel);
        sb.append(", pin=");
        sb.append(this.pin);
        sb.append(", nextPaymentTime=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.nextPaymentTime, ", lastPaymentTime=", this.lastPaymentTime, ")");
        int i2 = write + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
        return strM;
    }

    public OnEventTrackingFailedListener(String str, onDeeplinkResolved ondeeplinkresolved, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.infraLevel = str;
        this.pin = ondeeplinkresolved;
        this.nextPaymentTime = str2;
        this.lastPaymentTime = str3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEventTrackingFailedListener) {
            OnEventTrackingFailedListener onEventTrackingFailedListener = (OnEventTrackingFailedListener) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.infraLevel, onEventTrackingFailedListener.infraLevel}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pin, onEventTrackingFailedListener.pin}, getCieXyz.write())).booleanValue()) {
                    int i2 = IconCompatParcelizer + 111;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.nextPaymentTime, onEventTrackingFailedListener.nextPaymentTime}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lastPaymentTime, onEventTrackingFailedListener.lastPaymentTime}, getCieXyz.write())).booleanValue();
            }
            int i4 = write + 65;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 83;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
