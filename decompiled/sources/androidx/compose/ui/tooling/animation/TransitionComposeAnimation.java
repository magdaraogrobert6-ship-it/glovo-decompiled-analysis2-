package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {
    public static final int $stable = 8;
    private final Transition animationObject;
    private final Object initialState;
    private final String label;
    private final Set<Object> states;
    private final Object targetState;
    private final ComposeAnimationType type = ComposeAnimationType.TRANSITION_ANIMATION;

    public final Object getInitialState() {
        return this.initialState;
    }

    public String getLabel() {
        return this.label;
    }

    public Set<Object> getStates() {
        return this.states;
    }

    public final Object getTargetState() {
        return this.targetState;
    }

    public ComposeAnimationType getType() {
        return this.type;
    }

    public TransitionComposeAnimation(Object obj, Object obj2, Transition transition, Set<? extends Object> set, String str) {
        this.initialState = obj;
        this.targetState = obj2;
        this.animationObject = transition;
        this.states = set;
        this.label = str;
    }

    @Override // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    /* JADX INFO: renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public Transition m3596getAnimationObject() {
        return this.animationObject;
    }
}
