package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.order.history.data.database.entity.Delivery$Customer$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.yc;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class yf {
    public static final Delivery$Customer$Companion Companion = new Object() { // from class: com.roadrunner.order.history.data.database.entity.Delivery$Customer$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 99;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                yc ycVar = yc.serializer;
                throw null;
            }
            yc ycVar2 = yc.serializer;
            int i3 = read + 91;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 49 / 0;
            }
            return ycVar2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final y9 dropOffAddress;
    public final String name;
    public final String phoneNumber;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.order.history.data.database.entity.Delivery$Customer$Companion] */
    static {
        int i = write + 55;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    public /* synthetic */ yf(int i, String str, String str2, y9 y9Var) {
        if (1 == (i & 1)) {
            this.name = str;
            if ((i & 2) == 0) {
                this.phoneNumber = null;
                int i2 = serializer + 11;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                }
                if ((i & 4) == 0) {
                    this.dropOffAddress = null;
                    return;
                } else {
                    this.dropOffAddress = y9Var;
                    return;
                }
            }
            this.phoneNumber = str2;
            int i3 = serializer + 111;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            if ((i & 4) == 0) {
                this.dropOffAddress = null;
                return;
            } else {
                this.dropOffAddress = y9Var;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, yc.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Customer(name=", this.name, ", phoneNumber=", this.phoneNumber, ", dropOffAddress=");
            sbM.append(this.dropOffAddress);
            sbM.append(")");
            String string = sbM.toString();
            int i3 = 1 / 0;
            return string;
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("Customer(name=", this.name, ", phoneNumber=", this.phoneNumber, ", dropOffAddress=");
        sbM2.append(this.dropOffAddress);
        sbM2.append(")");
        return sbM2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f A[PHI: r1 r3
  0x002f: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r3v6 java.lang.String) = (r3v0 java.lang.String), (r3v8 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.name.hashCode();
            str = this.phoneNumber;
            if (str == null) {
                int i3 = RemoteActionCompatParcelizer + 49;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            iHashCode = this.name.hashCode();
            str = this.phoneNumber;
            if (str == null) {
                int i5 = RemoteActionCompatParcelizer + 49;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        }
        y9 y9Var = this.dropOffAddress;
        if (y9Var != null) {
            iHashCode3 = y9Var.hashCode();
            int i7 = RemoteActionCompatParcelizer + 69;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public yf(String str, String str2, y9 y9Var) {
        str.getClass();
        this.name = str;
        this.phoneNumber = str2;
        this.dropOffAddress = y9Var;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof yf) {
            yf yfVar = (yf) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, yfVar.name}, getCieXyz.write())).booleanValue()) {
                int i2 = RemoteActionCompatParcelizer + 41;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, yfVar.phoneNumber}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dropOffAddress, yfVar.dropOffAddress}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = serializer + 103;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 109;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
