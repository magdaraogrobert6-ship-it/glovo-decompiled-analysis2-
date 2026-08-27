package o;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayout implements SimplePlacementScope {
    public final float IconCompatParcelizer;
    public final SimplePlacementScope RemoteActionCompatParcelizer;

    @Override // o.SimplePlacementScope
    public final float write(RectF rectF) {
        return Math.max(0.0f, this.RemoteActionCompatParcelizer.write(rectF) + this.IconCompatParcelizer);
    }

    public SubcomposeLayout(float f, SimplePlacementScope simplePlacementScope) {
        while (simplePlacementScope instanceof SubcomposeLayout) {
            simplePlacementScope = ((SubcomposeLayout) simplePlacementScope).RemoteActionCompatParcelizer;
            f += ((SubcomposeLayout) simplePlacementScope).IconCompatParcelizer;
        }
        this.RemoteActionCompatParcelizer = simplePlacementScope;
        this.IconCompatParcelizer = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubcomposeLayout)) {
            return false;
        }
        SubcomposeLayout subcomposeLayout = (SubcomposeLayout) obj;
        return this.RemoteActionCompatParcelizer.equals(subcomposeLayout.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == subcomposeLayout.IconCompatParcelizer;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer, Float.valueOf(this.IconCompatParcelizer)});
    }
}
