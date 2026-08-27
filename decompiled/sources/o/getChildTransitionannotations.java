package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;

/* JADX INFO: loaded from: classes3.dex */
public final class getChildTransitionannotations extends AnimatedVisibilityComposeAnimation_androidKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final CashPaymentTaskUiItem serializer;

    static {
        CashPaymentTaskUiItem.Companion companion = CashPaymentTaskUiItem.Companion;
        int i = read + 25;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public getChildTransitionannotations(CashPaymentTaskUiItem cashPaymentTaskUiItem) {
        cashPaymentTaskUiItem.getClass();
        this.serializer = cashPaymentTaskUiItem;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.serializer.hashCode();
            int i3 = 38 / 0;
        } else {
            iHashCode = this.serializer.hashCode();
        }
        int i4 = IconCompatParcelizer + 55;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CashPaymentTask(cashPaymentTaskUiItem=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof getChildTransitionannotations)) {
                int i2 = RemoteActionCompatParcelizer + 43;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((getChildTransitionannotations) obj).serializer}, getCieXyz.write())).booleanValue()) {
                int i3 = IconCompatParcelizer + 3;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i3 % 2 == 0;
            }
            int i4 = IconCompatParcelizer + 67;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IconCompatParcelizer + 13;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
