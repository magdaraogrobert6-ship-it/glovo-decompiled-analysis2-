package o;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutKtReusedSlotId1 implements SimplePlacementScope {
    public final float IconCompatParcelizer;

    public SubcomposeLayoutKtReusedSlotId1(float f) {
        this.IconCompatParcelizer = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubcomposeLayoutKtReusedSlotId1) && this.IconCompatParcelizer == ((SubcomposeLayoutKtReusedSlotId1) obj).IconCompatParcelizer;
    }

    @Override // o.SimplePlacementScope
    public final float write(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.IconCompatParcelizer)});
    }
}
