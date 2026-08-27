package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.ToolingOverride;
import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.getCieXyz;
import o.onShowTranslationui;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AnimateXAsStateSearchInfo<T, V extends TransformGestureDetectorKtdetectTransformGestures2> implements SearchInfo<AnimateXAsStateComposeAnimation<?, ?>, AnimateXAsStateClock<?, ?>> {
    public static final int $stable = 8;
    private final Animatable animatable;
    private final Object animationObject;
    private final TrackpadScrollingLogic animationSpec;
    private Object initialState;
    private Object targetState;
    private final ToolingOverride<T> toolingOverride;

    public final Animatable component1() {
        return this.animatable;
    }

    public final TrackpadScrollingLogic component2() {
        return this.animationSpec;
    }

    public final ToolingOverride<T> component3() {
        return this.toolingOverride;
    }

    public final Animatable getAnimatable() {
        return this.animatable;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getAnimationObject() {
        return this.animationObject;
    }

    public final TrackpadScrollingLogic getAnimationSpec() {
        return this.animationSpec;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getInitialState() {
        return this.initialState;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getTargetState() {
        return this.targetState;
    }

    public final ToolingOverride<T> getToolingOverride() {
        return this.toolingOverride;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void attach() {
        this.toolingOverride.overrideState();
    }

    public final AnimateXAsStateSearchInfo<T, V> copy(Animatable animatable, TrackpadScrollingLogic trackpadScrollingLogic, ToolingOverride<T> toolingOverride) {
        return new AnimateXAsStateSearchInfo<>(animatable, trackpadScrollingLogic, toolingOverride);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void detach() {
        this.toolingOverride.clearOverride();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        return this.animatable.write;
    }

    public int hashCode() {
        int iHashCode = this.animatable.hashCode();
        return this.toolingOverride.hashCode() + ((this.animationSpec.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setInitialStateToCurrentAnimationValue() {
        this.initialState = ((onShowTranslationui) this.animatable.RatingCompat).getValue();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setTargetStateToCurrentAnimationValue() {
        this.targetState = ((onShowTranslationui) this.animatable.RatingCompat).getValue();
    }

    public AnimateXAsStateSearchInfo(Animatable animatable, TrackpadScrollingLogic trackpadScrollingLogic, ToolingOverride<T> toolingOverride) {
        this.animatable = animatable;
        this.animationSpec = trackpadScrollingLogic;
        this.toolingOverride = toolingOverride;
        this.animationObject = animatable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimateXAsStateSearchInfo copy$default(AnimateXAsStateSearchInfo animateXAsStateSearchInfo, Animatable animatable, TrackpadScrollingLogic trackpadScrollingLogic, ToolingOverride toolingOverride, int i, Object obj) {
        if ((i & 1) != 0) {
            animatable = animateXAsStateSearchInfo.animatable;
        }
        if ((i & 2) != 0) {
            trackpadScrollingLogic = animateXAsStateSearchInfo.animationSpec;
        }
        if ((i & 4) != 0) {
            toolingOverride = animateXAsStateSearchInfo.toolingOverride;
        }
        return animateXAsStateSearchInfo.copy(animatable, trackpadScrollingLogic, toolingOverride);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateXAsStateSearchInfo)) {
            return false;
        }
        AnimateXAsStateSearchInfo animateXAsStateSearchInfo = (AnimateXAsStateSearchInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.animatable, animateXAsStateSearchInfo.animatable}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.animationSpec, animateXAsStateSearchInfo.animationSpec}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.toolingOverride, animateXAsStateSearchInfo.toolingOverride}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "AnimateXAsStateSearchInfo(animatable=" + this.animatable + ", animationSpec=" + this.animationSpec + ", toolingOverride=" + this.toolingOverride + ')';
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public AnimateXAsStateComposeAnimation<?, ?> createAnimation() {
        return AnimateXAsStateComposeAnimation.Companion.parse$ui_tooling(this);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public AnimateXAsStateClock<?, ?> createClock(AnimateXAsStateComposeAnimation<?, ?> animateXAsStateComposeAnimation, ClockInfo clockInfo) {
        return new AnimateXAsStateClock<>(animateXAsStateComposeAnimation);
    }
}
