package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;

/* JADX INFO: loaded from: classes3.dex */
public final class throwIfPresent implements ResourceFontHelper {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String serializer;
    public final CashPaymentTaskUiItem.Reasons write;

    public throwIfPresent(String str, CashPaymentTaskUiItem.Reasons reasons) {
        str.getClass();
        reasons.getClass();
        this.serializer = str;
        this.write = reasons;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = read + 43;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowCardCashPaymentReasons(taskId=" + this.serializer + ", reasons=" + this.write + ")";
        int i2 = IconCompatParcelizer + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof throwIfPresent)) {
                return false;
            }
            throwIfPresent throwifpresent = (throwIfPresent) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, throwifpresent.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, throwifpresent.write}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = IconCompatParcelizer + 65;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        int i3 = read + 39;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }
}
