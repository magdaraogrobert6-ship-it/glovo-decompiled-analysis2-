package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ComposeAnimationClock<T extends ComposeAnimation, TState extends ComposeAnimationState> {
    List<ComposeAnimatedProperty> getAnimatedProperties();

    T getAnimation();

    long getMaxDuration();

    long getMaxDurationPerIteration();

    TState getState();

    List<TransitionInfo> getTransitions(long j);

    void setClockTime(long j);

    void setState(TState tstate);

    void setStateParameters(Object obj, Object obj2);

    static /* synthetic */ void setStateParameters$default(ComposeAnimationClock composeAnimationClock, Object obj, Object obj2, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 2) != 0) {
                obj2 = null;
            }
            composeAnimationClock.setStateParameters(obj, obj2);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: setStateParameters");
    }
}
