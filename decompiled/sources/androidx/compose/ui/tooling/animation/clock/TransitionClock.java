package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.TransitionBasedAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.onShowTranslationui;
import o.requiredSize3ABfNKs;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionClock<T> implements ComposeAnimationClock<TransitionBasedAnimation<T>, TargetState<T>> {
    public static final int $stable = 8;
    private final TransitionBasedAnimation<T> animation;
    private long currentClockTimeNanos;
    private TargetState<T> state = new TargetState<>(getAnimation().m3596getAnimationObject().MediaSessionCompatToken.IconCompatParcelizer(), ((onShowTranslationui) getAnimation().m3596getAnimationObject().MediaBrowserCompatMediaItem).getValue());

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j) {
        this.currentClockTimeNanos = j;
        getAnimation().m3596getAnimationObject().seek(j, getState().getInitial(), getState().getTarget());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(TargetState<T> targetState) {
        this.state = targetState;
        setClockTime(this.currentClockTimeNanos);
    }

    public TransitionClock(TransitionBasedAnimation<T> transitionBasedAnimation) {
        this.animation = transitionBasedAnimation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        List<requiredSize3ABfNKs> listAllAnimations = Utils_androidKt.allAnimations(getAnimation().m3596getAnimationObject());
        ArrayList arrayList = new ArrayList();
        for (requiredSize3ABfNKs requiredsize3abfnks : listAllAnimations) {
            Object value = ((onShowTranslationui) requiredsize3abfnks.ParcelableVolumeInfo).getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(requiredsize3abfnks.MediaMetadataCompat, value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) t).getLabel())) {
                arrayList2.add(t);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Utils_androidKt.nanosToMillis(getAnimation().m3596getAnimationObject().RemoteActionCompatParcelizer());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return Utils_androidKt.nanosToMillis(getAnimation().m3596getAnimationObject().RemoteActionCompatParcelizer());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long j) {
        List<requiredSize3ABfNKs> listAllAnimations = Utils_androidKt.allAnimations(getAnimation().m3596getAnimationObject());
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listAllAnimations, 10));
        Iterator<T> it = listAllAnimations.iterator();
        while (it.hasNext()) {
            arrayList.add(Utils_androidKt.createTransitionInfo((requiredSize3ABfNKs) it.next(), j));
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) t).getLabel())) {
                arrayList2.add(t);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object obj, Object obj2) {
        TargetState<T> parametersToValue = Utils_androidKt.parseParametersToValue(getState().getInitial(), obj, obj2);
        if (parametersToValue != null) {
            setState((TargetState) parametersToValue);
        }
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public TargetState<T> getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public TransitionBasedAnimation<T> getAnimation() {
        return this.animation;
    }
}
