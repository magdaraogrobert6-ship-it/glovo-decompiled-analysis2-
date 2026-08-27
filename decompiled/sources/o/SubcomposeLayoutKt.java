package o;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutKt implements SimplePlacementScope {
    public final float write;

    @Override // o.SimplePlacementScope
    public final float write(RectF rectF) {
        return this.write;
    }

    public SubcomposeLayoutKt(float f) {
        this.write = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubcomposeLayoutKt) && this.write == ((SubcomposeLayoutKt) obj).write;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.write)});
    }
}
