package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import androidx.sqlite.SQLite;
import com.roadrunner.location.util.HmsTasksKt;
import java.util.List;
import o.PaddingKt;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.getQueryParameterslambda2;
import o.requiredSizeInqDBjuR0default;

/* JADX INFO: loaded from: classes.dex */
public final class AnimateXAsStateClock<T, V extends TransformGestureDetectorKtdetectTransformGestures2> implements ComposeAnimationClock<AnimateXAsStateComposeAnimation<T, V>, TargetState<T>> {
    public static final int $stable = 8;
    private final AnimateXAsStateComposeAnimation<T, V> animation;
    private long clockTimeNanos;
    private TargetState<T> state = new TargetState<>(getAnimation().m3587getAnimationObject().write(), getAnimation().m3587getAnimationObject().write());
    private T currentValue = getAnimation().getToolingState().getValue();
    private PaddingKt currAnimation = getCurrentAnimation();

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j) {
        setClockTimeNanos(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setClockTimeNanos(long j) {
        this.clockTimeNanos = j;
        setCurrentValue(this.currAnimation.RemoteActionCompatParcelizer(j));
    }

    private final void setCurrentValue(T t) {
        this.currentValue = t;
        getAnimation().getToolingState().setValue(t);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        String label = getAnimation().getLabel();
        T t = this.currentValue;
        t.getClass();
        Object[] objArr = {new ComposeAnimatedProperty(label, t)};
        int iSerializer = getQueryParameterslambda2.serializer();
        return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Utils_androidKt.nanosToMillis(this.currAnimation.serializer());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return Utils_androidKt.nanosToMillis(this.currAnimation.serializer());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long j) {
        Object[] objArr = {Utils_androidKt.createTransitionInfo(this.currAnimation, getAnimation().getLabel(), getAnimation().getAnimationSpec(), j)};
        int iSerializer = getQueryParameterslambda2.serializer();
        return (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(TargetState<T> targetState) {
        this.state = targetState;
        this.currAnimation = getCurrentAnimation();
        setClockTime(this.clockTimeNanos);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object obj, Object obj2) {
        TargetState<T> parametersToValue = Utils_androidKt.parseParametersToValue(this.currentValue, obj, obj2);
        if (parametersToValue != null) {
            setState((TargetState) parametersToValue);
        }
    }

    public AnimateXAsStateClock(AnimateXAsStateComposeAnimation<T, V> animateXAsStateComposeAnimation) {
        this.animation = animateXAsStateComposeAnimation;
    }

    private final PaddingKt getCurrentAnimation() {
        TrackpadScrollingLogic animationSpec = getAnimation().getAnimationSpec();
        T initial = getState().getInitial();
        T target = getState().getTarget();
        requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = getAnimation().m3587getAnimationObject().MediaSessionCompatResultReceiverWrapper;
        Animatable animatableM3587getAnimationObject = getAnimation().m3587getAnimationObject();
        return HmsTasksKt.read(animationSpec, requiredsizeinqdbjur0default, initial, target, animatableM3587getAnimationObject.MediaSessionCompatResultReceiverWrapper.read.invoke(animatableM3587getAnimationObject.IconCompatParcelizer.MediaSessionCompatQueueItem));
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public TargetState<T> getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public AnimateXAsStateComposeAnimation<T, V> getAnimation() {
        return this.animation;
    }
}
