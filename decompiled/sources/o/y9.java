package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.order.history.data.database.entity.Delivery$Address$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.y7;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class y9 {
    public static final Delivery$Address$Companion Companion = new Object() { // from class: com.roadrunner.order.history.data.database.entity.Delivery$Address$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 73;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return y7.write;
            }
            y7 y7Var = y7.write;
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final y8 coordinate;
    public final String formattedAddress;
    public final String specialInstructions;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.order.history.data.database.entity.Delivery$Address$Companion] */
    static {
        int i = IconCompatParcelizer + 75;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ y9(int i, String str, y8 y8Var, String str2) {
        if ((i & 1) == 0) {
            this.formattedAddress = null;
            int i2 = serializer + 93;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            this.formattedAddress = str;
        }
        int i4 = 2 % 2;
        if ((i & 2) == 0) {
            int i5 = RemoteActionCompatParcelizer + 45;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.coordinate = null;
        } else {
            this.coordinate = y8Var;
        }
        if ((i & 4) == 0) {
            this.specialInstructions = null;
        } else {
            this.specialInstructions = str2;
        }
    }

    public y9(String str, y8 y8Var, String str2) {
        this.formattedAddress = str;
        this.coordinate = y8Var;
        this.specialInstructions = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Address(formattedAddress=");
        sb.append(this.formattedAddress);
        sb.append(", coordinate=");
        sb.append(this.coordinate);
        sb.append(", specialInstructions=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.specialInstructions, ")");
        int i2 = serializer + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 87;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.formattedAddress;
        if (str == null) {
            int i5 = i2 + 43;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        y8 y8Var = this.coordinate;
        if (y8Var == null) {
            int i7 = serializer + 123;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = y8Var.hashCode();
        }
        String str2 = this.specialInstructions;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        int i9 = serializer + 3;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        Object[] objArr = {this.formattedAddress, y9Var.formattedAddress};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.coordinate, y9Var.coordinate};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            Object[] objArr3 = {this.specialInstructions, y9Var.specialInstructions};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 47;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
