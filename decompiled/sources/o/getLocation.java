package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class getLocation extends allChildren {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final getEnterjXw82LU IconCompatParcelizer;

    static {
        CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion = getEnterjXw82LU.Companion;
        int i = RemoteActionCompatParcelizer + 107;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public getLocation(getEnterjXw82LU getenterjxw82lu) {
        getenterjxw82lu.getClass();
        this.IconCompatParcelizer = getenterjxw82lu;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = write + 59;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CardCashPaymentTask(cardCashPaymentTaskUiItem=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLocation)) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((getLocation) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i2 = serializer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
