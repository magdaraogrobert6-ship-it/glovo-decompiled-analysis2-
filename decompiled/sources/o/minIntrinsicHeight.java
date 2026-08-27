package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class minIntrinsicHeight {
    public static final minIntrinsicHeight serializer = new minIntrinsicHeight(AnimatedVisibilityKt.write, 0);
    public final AnimatedVisibilityKt IconCompatParcelizer;
    public final int write;

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ this.write;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof minIntrinsicHeight)) {
            return false;
        }
        minIntrinsicHeight minintrinsicheight = (minIntrinsicHeight) obj;
        return this.IconCompatParcelizer.equals(minintrinsicheight.IconCompatParcelizer) && this.write == minintrinsicheight.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fallbackRule=");
        return af$$ExternalSyntheticOutline0.m(this.write, "}", sb);
    }

    public minIntrinsicHeight(AnimatedVisibilityKt animatedVisibilityKt, int i) {
        if (animatedVisibilityKt == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null fallbackQuality");
            throw null;
        }
        this.IconCompatParcelizer = animatedVisibilityKt;
        this.write = i;
    }
}
