package o;

import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.data.PinHashDerivationError;

/* JADX INFO: loaded from: classes3.dex */
public final class isSpecifiedjoFl9I extends PointerInteropFilterpointerInputFilter1stopDispatching1 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final PinHashDerivationError IconCompatParcelizer;

    public isSpecifiedjoFl9I(PinHashDerivationError pinHashDerivationError) {
        this.IconCompatParcelizer = pinHashDerivationError;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = serializer + 35;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return iHashCode;
    }

    @Override // o.PointerInteropFilterpointerInputFilter1stopDispatching1
    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = this.IconCompatParcelizer.write();
        int i4 = RemoteActionCompatParcelizer + 117;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "KeyDerivation(error=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj && (!(obj instanceof isSpecifiedjoFl9I) || !this.IconCompatParcelizer.equals(((isSpecifiedjoFl9I) obj).IconCompatParcelizer))) {
            int i2 = serializer + 27;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 51;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return true;
    }
}
