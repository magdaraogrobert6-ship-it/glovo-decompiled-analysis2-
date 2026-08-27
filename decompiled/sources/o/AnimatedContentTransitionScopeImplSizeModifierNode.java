package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImplSizeModifierNode {
    public final AnimatedVisibilityKt IconCompatParcelizer;
    public final int write;

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ this.write;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnimatedContentTransitionScopeImplSizeModifierNode)) {
            return false;
        }
        AnimatedContentTransitionScopeImplSizeModifierNode animatedContentTransitionScopeImplSizeModifierNode = (AnimatedContentTransitionScopeImplSizeModifierNode) obj;
        return this.IconCompatParcelizer.equals(animatedContentTransitionScopeImplSizeModifierNode.IconCompatParcelizer) && this.write == animatedContentTransitionScopeImplSizeModifierNode.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", aspectRatio=");
        return af$$ExternalSyntheticOutline0.m(this.write, "}", sb);
    }

    public AnimatedContentTransitionScopeImplSizeModifierNode(AnimatedVisibilityKt animatedVisibilityKt, int i) {
        if (animatedVisibilityKt == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null quality");
            throw null;
        }
        this.IconCompatParcelizer = animatedVisibilityKt;
        this.write = i;
    }
}
