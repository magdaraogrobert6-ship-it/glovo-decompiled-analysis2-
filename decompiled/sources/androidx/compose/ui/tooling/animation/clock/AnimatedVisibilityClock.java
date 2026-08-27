package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onShowTranslationui;
import o.onViewAttachedToWindowlambda0;
import o.requiredSize3ABfNKs;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedVisibilityClock implements ComposeAnimationClock<AnimatedVisibilityComposeAnimation, AnimatedVisibilityState> {
    public static final int $stable = 8;
    private final AnimatedVisibilityComposeAnimation animation;
    private long currentClockTimeNanos;
    private String state;

    /* JADX INFO: renamed from: getState-jXw82LU, reason: not valid java name */
    public String m3598getStatejXw82LU() {
        return this.state;
    }

    /* JADX INFO: renamed from: toCurrentTargetPair-7IW2chM, reason: not valid java name */
    private final onViewAttachedToWindowlambda0 m3597toCurrentTargetPair7IW2chM(String str) {
        return AnimatedVisibilityState.m3606equalsimpl0(str, AnimatedVisibilityState.Companion.m3610getEnterjXw82LU()) ? new onViewAttachedToWindowlambda0(Boolean.FALSE, Boolean.TRUE) : new onViewAttachedToWindowlambda0(Boolean.TRUE, Boolean.FALSE);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j) {
        this.currentClockTimeNanos = j;
        Transition transitionM3589getAnimationObject = getAnimation().m3589getAnimationObject();
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0M3597toCurrentTargetPair7IW2chM = m3597toCurrentTargetPair7IW2chM(m3598getStatejXw82LU());
        Boolean bool = (Boolean) onviewattachedtowindowlambda0M3597toCurrentTargetPair7IW2chM.serializer;
        bool.booleanValue();
        Boolean bool2 = (Boolean) onviewattachedtowindowlambda0M3597toCurrentTargetPair7IW2chM.write;
        bool2.booleanValue();
        transitionM3589getAnimationObject.seek(j, bool, bool2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* synthetic */ void setState(ComposeAnimationState composeAnimationState) {
        m3599setState7IW2chM(((AnimatedVisibilityState) composeAnimationState).m3609unboximpl());
    }

    /* JADX INFO: renamed from: setState-7IW2chM, reason: not valid java name */
    public void m3599setState7IW2chM(String str) {
        this.state = str;
        setClockTime(this.currentClockTimeNanos);
    }

    public AnimatedVisibilityClock(AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation) {
        this.animation = animatedVisibilityComposeAnimation;
        this.state = ((Boolean) getAnimation().m3589getAnimationObject().MediaSessionCompatToken.IconCompatParcelizer()).booleanValue() ? AnimatedVisibilityState.Companion.m3611getExitjXw82LU() : AnimatedVisibilityState.Companion.m3610getEnterjXw82LU();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object obj, Object obj2) {
        obj.getClass();
        m3599setState7IW2chM(((AnimatedVisibilityState) obj).m3609unboximpl());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        Transition childTransition = getAnimation().getChildTransition();
        if (childTransition == null) {
            return instance_delegatelambda0.write;
        }
        List<requiredSize3ABfNKs> listAllAnimations = Utils_androidKt.allAnimations(childTransition);
        ArrayList arrayList = new ArrayList();
        for (requiredSize3ABfNKs requiredsize3abfnks : listAllAnimations) {
            String str = requiredsize3abfnks.MediaMetadataCompat;
            Object value = ((onShowTranslationui) requiredsize3abfnks.ParcelableVolumeInfo).getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(str, value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        List listSerializer = onContentCardDismissed.serializer(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getAnimatedProperties$lambda$0$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return setNativeShader.RemoteActionCompatParcelizer((Comparable) ((ComposeAnimatedProperty) t).getLabel(), (Comparable) ((ComposeAnimatedProperty) t2).getLabel());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listSerializer) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        Transition childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return Utils_androidKt.nanosToMillis(childTransition.RemoteActionCompatParcelizer());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Transition childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return Utils_androidKt.nanosToMillis(childTransition.RemoteActionCompatParcelizer());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* synthetic */ ComposeAnimationState getState() {
        return AnimatedVisibilityState.m3603boximpl(m3598getStatejXw82LU());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long j) {
        Transition childTransition = getAnimation().getChildTransition();
        if (childTransition == null) {
            return instance_delegatelambda0.write;
        }
        List<requiredSize3ABfNKs> listAllAnimations = Utils_androidKt.allAnimations(childTransition);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listAllAnimations, 10));
        Iterator<T> it = listAllAnimations.iterator();
        while (it.hasNext()) {
            arrayList.add(Utils_androidKt.createTransitionInfo((requiredSize3ABfNKs) it.next(), j));
        }
        List listSerializer = onContentCardDismissed.serializer(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getTransitions$lambda$0$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return setNativeShader.RemoteActionCompatParcelizer((Comparable) ((TransitionInfo) t).getLabel(), (Comparable) ((TransitionInfo) t2).getLabel());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listSerializer) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public AnimatedVisibilityComposeAnimation getAnimation() {
        return this.animation;
    }
}
