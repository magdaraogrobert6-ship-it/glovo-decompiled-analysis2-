package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;

/* JADX INFO: loaded from: classes.dex */
public interface SearchInfo<Animation extends ComposeAnimation, Clock extends ComposeAnimationClock<?, ?>> {
    default void attach() {
    }

    Animation createAnimation();

    Clock createClock(Animation animation, ClockInfo clockInfo);

    default void detach() {
    }

    Object getAnimationObject();

    Object getInitialState();

    String getLabel();

    Object getTargetState();

    void setInitialStateToCurrentAnimationValue();

    void setTargetStateToCurrentAnimationValue();
}
