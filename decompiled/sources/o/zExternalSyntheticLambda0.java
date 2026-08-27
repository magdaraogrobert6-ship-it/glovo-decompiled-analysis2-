package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.order.history.data.database.entity.Delivery$Vendor$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.z1;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class zExternalSyntheticLambda0 {
    public static final Delivery$Vendor$Companion Companion = new Object() { // from class: com.roadrunner.order.history.data.database.entity.Delivery$Vendor$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 123;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z1 z1Var = z1.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 87;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return z1Var;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String name;
    public final String phoneNumber;
    public final y9 pickUpAddress;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.order.history.data.database.entity.Delivery$Vendor$Companion] */
    static {
        int i = IconCompatParcelizer + 117;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    public /* synthetic */ zExternalSyntheticLambda0(int i, String str, String str2, y9 y9Var) {
        if (1 == (i & 1)) {
            this.name = str;
            if ((i & 2) == 0) {
                this.phoneNumber = null;
                int i2 = write + 53;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            } else {
                this.phoneNumber = str2;
                int i4 = RemoteActionCompatParcelizer + 97;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                }
                if ((i & 4) == 0) {
                    int i5 = write + 73;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    this.pickUpAddress = null;
                    return;
                }
                this.pickUpAddress = y9Var;
                return;
            }
            int i7 = 2 % 2;
            if ((i & 4) == 0) {
                int i8 = write + 73;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                this.pickUpAddress = null;
                return;
            }
            this.pickUpAddress = y9Var;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, z1.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Vendor(name=", this.name, ", phoneNumber=", this.phoneNumber, ", pickUpAddress=");
            sbM.append(this.pickUpAddress);
            sbM.append(")");
            return sbM.toString();
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("Vendor(name=", this.name, ", phoneNumber=", this.phoneNumber, ", pickUpAddress=");
        sbM2.append(this.pickUpAddress);
        sbM2.append(")");
        sbM2.toString();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.name.hashCode();
        String str = this.phoneNumber;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = RemoteActionCompatParcelizer + 113;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        y9 y9Var = this.pickUpAddress;
        if (y9Var != null) {
            iHashCode3 = y9Var.hashCode();
            int i4 = write + 101;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
    }

    public zExternalSyntheticLambda0(String str, String str2, y9 y9Var) {
        this.name = str;
        this.phoneNumber = str2;
        this.pickUpAddress = y9Var;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 93;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof zExternalSyntheticLambda0)) {
            return false;
        }
        zExternalSyntheticLambda0 zexternalsyntheticlambda0 = (zExternalSyntheticLambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, zexternalsyntheticlambda0.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, zexternalsyntheticlambda0.phoneNumber}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pickUpAddress, zexternalsyntheticlambda0.pickUpAddress}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i3 = write + 111;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = RemoteActionCompatParcelizer + 81;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return !(i5 % 2 == 0);
    }
}
