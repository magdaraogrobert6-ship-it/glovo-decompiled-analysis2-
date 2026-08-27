package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.tooling.animation.TransitionBasedAnimation;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import o.onShowTranslationui;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionBasedSearchInfo<AnimationType extends TransitionBasedAnimation<?>> implements SearchInfo<AnimationType, TransitionClock<?>> {
    public static final int $stable = 8;
    private final Object animationObject;
    private Object initialState;
    private Object targetState;
    private final Transition transition;

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getAnimationObject() {
        return this.animationObject;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public final Object getInitialState() {
        return this.initialState;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public final Object getTargetState() {
        return this.targetState;
    }

    public final Transition getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setInitialStateToCurrentAnimationValue() {
        this.initialState = ((onShowTranslationui) this.transition.MediaBrowserCompatMediaItem).getValue();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setTargetStateToCurrentAnimationValue() {
        this.targetState = ((onShowTranslationui) this.transition.MediaBrowserCompatMediaItem).getValue();
    }

    public TransitionBasedSearchInfo(Transition transition) {
        this.transition = transition;
        this.animationObject = transition;
    }
}
