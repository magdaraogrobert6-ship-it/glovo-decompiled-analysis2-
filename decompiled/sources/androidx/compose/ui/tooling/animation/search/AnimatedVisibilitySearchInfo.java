package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation_androidKt;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock;
import o.onShowTranslationui;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedVisibilitySearchInfo implements SearchInfo<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> {
    public static final int $stable = 8;
    private final Object animationObject;
    private boolean initialState;
    private boolean targetState;
    private final Transition transition;

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getAnimationObject() {
        return this.animationObject;
    }

    public final Transition getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        String str = this.transition.write;
        return str == null ? "AnimatedVisibility" : str;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setInitialStateToCurrentAnimationValue() {
        this.initialState = ((Boolean) ((onShowTranslationui) this.transition.MediaBrowserCompatMediaItem).getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setTargetStateToCurrentAnimationValue() {
        this.targetState = ((Boolean) ((onShowTranslationui) this.transition.MediaBrowserCompatMediaItem).getValue()).booleanValue();
    }

    public AnimatedVisibilitySearchInfo(Transition transition) {
        this.transition = transition;
        this.animationObject = transition;
        this.initialState = ((Boolean) ((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue()).booleanValue();
        this.targetState = ((Boolean) ((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public AnimatedVisibilityClock createClock(AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation, ClockInfo clockInfo) {
        clockInfo.requestLayout();
        AnimatedVisibilityClock animatedVisibilityClock = new AnimatedVisibilityClock(animatedVisibilityComposeAnimation);
        animatedVisibilityClock.setClockTime(0L);
        return animatedVisibilityClock;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Boolean getInitialState() {
        return Boolean.valueOf(this.initialState);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Boolean getTargetState() {
        return Boolean.valueOf(this.targetState);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public AnimatedVisibilityComposeAnimation createAnimation() {
        return AnimatedVisibilityComposeAnimation_androidKt.parseAnimatedVisibility(this.transition);
    }
}
