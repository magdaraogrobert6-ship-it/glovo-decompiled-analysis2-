package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;

/* JADX INFO: loaded from: classes3.dex */
public final class minusCBMgk4 implements getXD9Ej5fM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final CashPaymentTaskUiItem.Reasons write;

    public minusCBMgk4(CashPaymentTaskUiItem.Reasons reasons) {
        reasons.getClass();
        this.write = reasons;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 97;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = RemoteActionCompatParcelizer + 11;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowCashPaymentReasons(reasons=" + this.write + ")";
        int i2 = RemoteActionCompatParcelizer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof minusCBMgk4) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((minusCBMgk4) obj).write}, getCieXyz.write())).booleanValue();
            }
            int i2 = RemoteActionCompatParcelizer + 101;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 11;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
