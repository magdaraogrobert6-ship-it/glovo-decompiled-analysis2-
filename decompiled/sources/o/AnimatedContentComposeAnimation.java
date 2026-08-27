package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimatedContentComposeAnimation implements AnimatedContentComposeAnimationCompanion {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final CashPaymentTaskUiItem.Reasons serializer;

    public AnimatedContentComposeAnimation(CashPaymentTaskUiItem.Reasons reasons) {
        reasons.getClass();
        this.serializer = reasons;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer.hashCode();
        }
        this.serializer.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowCashPaymentReasons(reasons=" + this.serializer + ")";
        int i2 = read + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnimatedContentComposeAnimation) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((AnimatedContentComposeAnimation) obj).serializer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = read + 11;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IconCompatParcelizer + 109;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
