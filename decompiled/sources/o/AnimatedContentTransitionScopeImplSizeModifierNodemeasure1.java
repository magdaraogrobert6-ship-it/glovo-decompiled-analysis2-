package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 {
    public final AnimatedEnterExitMeasurePolicy IconCompatParcelizer;
    public final AnimatedContentMeasurePolicymeasure3 RemoteActionCompatParcelizer;
    public final int serializer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003) ^ this.serializer;
    }

    public AnimatedContentTransitionScopeImplSizeModifierNodemeasure1(AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy, AnimatedContentMeasurePolicymeasure3 animatedContentMeasurePolicymeasure3, int i) {
        this.IconCompatParcelizer = animatedEnterExitMeasurePolicy;
        this.RemoteActionCompatParcelizer = animatedContentMeasurePolicymeasure3;
        this.serializer = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnimatedContentTransitionScopeImplSizeModifierNodemeasure1)) {
            return false;
        }
        AnimatedContentTransitionScopeImplSizeModifierNodemeasure1 animatedContentTransitionScopeImplSizeModifierNodemeasure1 = (AnimatedContentTransitionScopeImplSizeModifierNodemeasure1) obj;
        return this.IconCompatParcelizer.equals(animatedContentTransitionScopeImplSizeModifierNodemeasure1.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(animatedContentTransitionScopeImplSizeModifierNodemeasure1.RemoteActionCompatParcelizer) && this.serializer == animatedContentTransitionScopeImplSizeModifierNodemeasure1.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", audioSpec=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", outputFormat=");
        return af$$ExternalSyntheticOutline0.m(this.serializer, "}", sb);
    }
}
