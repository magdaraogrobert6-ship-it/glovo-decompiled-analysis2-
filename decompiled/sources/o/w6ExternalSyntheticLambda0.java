package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.opportunities.data.PaymentResponse$Companion;
import kotlinx.serialization.Serializable;
import o.Y;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class w6ExternalSyntheticLambda0 {
    public static final PaymentResponse$Companion Companion = new Object() { // from class: com.roadrunner.opportunities.data.PaymentResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 37;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Y y = Y.serializer;
            int i4 = IconCompatParcelizer + 99;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return y;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String infraLevel;
    public final String lastPaymentTime;
    public final String nextPaymentTime;
    public final w6 pin;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.opportunities.data.PaymentResponse$Companion] */
    static {
        int i = write + 55;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 65;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.nextPaymentTime;
        int i5 = i2 + 47;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 85;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.infraLevel;
        int i5 = i2 + 105;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 121;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.lastPaymentTime;
        int i5 = i2 + 13;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final w6 write() {
        int i = 2 % 2;
        int i2 = read + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        w6 w6Var = this.pin;
        int i5 = i3 + 83;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return w6Var;
    }

    public /* synthetic */ w6ExternalSyntheticLambda0(int i, String str, w6 w6Var, String str2, String str3) {
        if ((i & 1) == 0) {
            this.infraLevel = "";
        } else {
            this.infraLevel = str;
            int i2 = IconCompatParcelizer + 123;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.pin = new w6();
            int i5 = IconCompatParcelizer + 85;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.pin = w6Var;
        }
        if ((i & 4) == 0) {
            this.nextPaymentTime = "";
        } else {
            this.nextPaymentTime = str2;
        }
        if ((i & 8) == 0) {
            this.lastPaymentTime = "";
            int i7 = IconCompatParcelizer + 91;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.lastPaymentTime = str3;
        int i8 = read + 83;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.infraLevel.hashCode();
        int iHashCode2 = this.lastPaymentTime.hashCode() + af$$ExternalSyntheticOutline0.m((this.pin.hashCode() + (iHashCode * 31)) * 31, 31, this.nextPaymentTime);
        int i4 = read + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
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
        int i2 = IconCompatParcelizer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6ExternalSyntheticLambda0)) {
            return false;
        }
        w6ExternalSyntheticLambda0 w6externalsyntheticlambda0 = (w6ExternalSyntheticLambda0) obj;
        Object[] objArr = {this.infraLevel, w6externalsyntheticlambda0.infraLevel};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.pin, w6externalsyntheticlambda0.pin};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.nextPaymentTime, w6externalsyntheticlambda0.nextPaymentTime};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.lastPaymentTime, w6externalsyntheticlambda0.lastPaymentTime};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            int i2 = read + 1;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
