package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentMeasurePolicy {
    public final int IconCompatParcelizer;
    public final getNavButtonView serializer;

    public AnimatedContentMeasurePolicy(int i, getNavButtonView getnavbuttonview) {
        this.IconCompatParcelizer = i;
        if (getnavbuttonview != null) {
            this.serializer = getnavbuttonview;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null cameraIdentifier");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnimatedContentMeasurePolicy)) {
            return false;
        }
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) obj;
        return this.IconCompatParcelizer == animatedContentMeasurePolicy.IconCompatParcelizer && this.serializer.equals(animatedContentMeasurePolicy.serializer);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.IconCompatParcelizer + ", cameraIdentifier=" + this.serializer + "}";
    }

    public final int hashCode() {
        return ((this.IconCompatParcelizer ^ 1000003) * 1000003) ^ this.serializer.hashCode();
    }
}
