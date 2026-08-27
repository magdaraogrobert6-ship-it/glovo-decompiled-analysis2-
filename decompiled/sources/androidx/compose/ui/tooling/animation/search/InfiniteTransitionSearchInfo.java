package androidx.compose.ui.tooling.animation.search;

import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.ToolingOverride;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import o.ArrangementHorizontal;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteTransitionSearchInfo implements SearchInfo<InfiniteTransitionComposeAnimation, InfiniteTransitionClock> {
    public static final int $stable = 8;
    private final Object animationObject;
    private final ArrangementHorizontal infiniteTransition;
    private final Object initialState;
    private final Object targetState;
    private final ToolingOverride<Long> toolingOverride;

    public final ArrangementHorizontal component1() {
        return this.infiniteTransition;
    }

    public final ToolingOverride<Long> component2() {
        return this.toolingOverride;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getAnimationObject() {
        return this.animationObject;
    }

    public final ArrangementHorizontal getInfiniteTransition() {
        return this.infiniteTransition;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getInitialState() {
        return this.initialState;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getTargetState() {
        return this.targetState;
    }

    public final ToolingOverride<Long> getToolingOverride() {
        return this.toolingOverride;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setInitialStateToCurrentAnimationValue() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setTargetStateToCurrentAnimationValue() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void attach() {
        this.toolingOverride.overrideState();
    }

    public final InfiniteTransitionSearchInfo copy(ArrangementHorizontal arrangementHorizontal, ToolingOverride<Long> toolingOverride) {
        return new InfiniteTransitionSearchInfo(arrangementHorizontal, toolingOverride);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void detach() {
        this.toolingOverride.clearOverride();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        return this.infiniteTransition.read;
    }

    public int hashCode() {
        return this.toolingOverride.hashCode() + (this.infiniteTransition.hashCode() * 31);
    }

    public InfiniteTransitionSearchInfo(ArrangementHorizontal arrangementHorizontal, ToolingOverride<Long> toolingOverride) {
        this.infiniteTransition = arrangementHorizontal;
        this.toolingOverride = toolingOverride;
        this.animationObject = arrangementHorizontal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfiniteTransitionSearchInfo copy$default(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo, ArrangementHorizontal arrangementHorizontal, ToolingOverride toolingOverride, int i, Object obj) {
        if ((i & 1) != 0) {
            arrangementHorizontal = infiniteTransitionSearchInfo.infiniteTransition;
        }
        if ((i & 2) != 0) {
            toolingOverride = infiniteTransitionSearchInfo.toolingOverride;
        }
        return infiniteTransitionSearchInfo.copy(arrangementHorizontal, toolingOverride);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfiniteTransitionSearchInfo)) {
            return false;
        }
        InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (InfiniteTransitionSearchInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.infiniteTransition, infiniteTransitionSearchInfo.infiniteTransition}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.toolingOverride, infiniteTransitionSearchInfo.toolingOverride}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.infiniteTransition + ", toolingOverride=" + this.toolingOverride + ')';
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public InfiniteTransitionClock createClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, ClockInfo clockInfo) {
        return new InfiniteTransitionClock(infiniteTransitionComposeAnimation, new CoroutineLiveData$$ExternalSyntheticLambda0(27, clockInfo));
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public InfiniteTransitionComposeAnimation createAnimation() {
        return InfiniteTransitionComposeAnimation.Companion.parse$ui_tooling(this);
    }
}
