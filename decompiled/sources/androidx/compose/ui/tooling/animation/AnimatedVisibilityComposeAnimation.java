package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import java.util.Set;
import o.onContentCardClicked;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedVisibilityComposeAnimation implements ComposeAnimation {
    public static final int $stable = 8;
    private final Transition animationObject;
    private final String label;
    private final Set<AnimatedVisibilityState> states;
    private final ComposeAnimationType type = ComposeAnimationType.ANIMATED_VISIBILITY;

    public static /* synthetic */ void getChildTransition$annotations() {
    }

    public String getLabel() {
        return this.label;
    }

    public Set<AnimatedVisibilityState> getStates() {
        return this.states;
    }

    public ComposeAnimationType getType() {
        return this.type;
    }

    public AnimatedVisibilityComposeAnimation(Transition transition, String str) {
        this.animationObject = transition;
        this.label = str;
        AnimatedVisibilityState.Companion companion = AnimatedVisibilityState.Companion;
        this.states = onContentCardClicked.MediaSessionCompatQueueItem(new AnimatedVisibilityState[]{AnimatedVisibilityState.m3603boximpl(companion.m3610getEnterjXw82LU()), AnimatedVisibilityState.m3603boximpl(companion.m3611getExitjXw82LU())});
    }

    public final Transition getChildTransition() {
        Object obj = onContentCardDismissed.read(0, m3589getAnimationObject().read);
        if (obj instanceof Transition) {
            return (Transition) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public Transition m3589getAnimationObject() {
        return this.animationObject;
    }
}
