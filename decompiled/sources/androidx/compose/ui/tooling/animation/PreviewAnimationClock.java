package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.Utils_androidKt;
import androidx.compose.ui.tooling.animation.search.SearchInfo;
import androidx.compose.ui.tooling.animation.search.UnsupportedSearchInfo;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.createFromParcel;
import o.instance_delegatelambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public class PreviewAnimationClock {
    public static final int $stable = 8;
    private final boolean DEBUG;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 applySnapshot;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 requestLayout;
    private final String TAG = "PreviewAnimationClock";
    private final Map<ComposeAnimation, ComposeAnimationClock<?, ?>> animationClocks = new LinkedHashMap();
    private final PreviewAnimationClock$clockInfo$1 clockInfo = new ClockInfo() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$clockInfo$1
        @Override // androidx.compose.ui.tooling.animation.ClockInfo
        public long getMaxDurationPerIterationMillis() {
            return this.this$0.getMaxDurationPerIteration();
        }

        @Override // androidx.compose.ui.tooling.animation.ClockInfo
        public void requestLayout() {
            this.this$0.requestLayout.invoke();
        }
    };
    private final LinkedHashSet<UnsupportedComposeAnimation> trackedUnsupportedAnimations = new LinkedHashSet<>();
    private final LinkedHashSet<Object> trackedAnimations = new LinkedHashSet<>();
    private final Object lock = new Object();

    public static /* synthetic */ void getAnimationClocks$ui_tooling$annotations() {
    }

    public static /* synthetic */ void getTrackedUnsupportedAnimations$annotations() {
    }

    public final Map<ComposeAnimation, ComposeAnimationClock<?, ?>> getAnimationClocks$ui_tooling() {
        return this.animationClocks;
    }

    public final LinkedHashSet<UnsupportedComposeAnimation> getTrackedUnsupportedAnimations() {
        return this.trackedUnsupportedAnimations;
    }

    public void notifySubscribe(ComposeAnimation composeAnimation) {
    }

    public void notifyUnsubscribe(ComposeAnimation composeAnimation) {
    }

    private final boolean trackAnimation(Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        synchronized (this.lock) {
            if (this.trackedAnimations.contains(obj)) {
                if (this.DEBUG) {
                    Objects.toString(obj);
                }
                return false;
            }
            this.trackedAnimations.add(obj);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
            if (!this.DEBUG) {
                return true;
            }
            Objects.toString(obj);
            return true;
        }
    }

    public final void dispose() {
        Iterator<Map.Entry<ComposeAnimation, ComposeAnimationClock<?, ?>>> it = this.animationClocks.entrySet().iterator();
        while (it.hasNext()) {
            notifyUnsubscribe(it.next().getKey());
        }
        Iterator<T> it2 = this.trackedUnsupportedAnimations.iterator();
        while (it2.hasNext()) {
            notifyUnsubscribe((UnsupportedComposeAnimation) it2.next());
        }
        this.trackedUnsupportedAnimations.clear();
        this.animationClocks.clear();
        this.trackedAnimations.clear();
    }

    public final List<ComposeAnimatedProperty> getAnimatedProperties(ComposeAnimation composeAnimation) {
        List<ComposeAnimatedProperty> animatedProperties;
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        return (composeAnimationClock == null || (animatedProperties = composeAnimationClock.getAnimatedProperties()) == null) ? instance_delegatelambda0.write : animatedProperties;
    }

    /* JADX INFO: renamed from: getAnimatedVisibilityState-cc2g1to, reason: not valid java name */
    public final String m3595getAnimatedVisibilityStatecc2g1to(ComposeAnimation composeAnimation) {
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        ComposeAnimationState state = composeAnimationClock != null ? composeAnimationClock.getState() : null;
        String strM3609unboximpl = state instanceof AnimatedVisibilityState ? ((AnimatedVisibilityState) state).m3609unboximpl() : null;
        return strM3609unboximpl == null ? AnimatedVisibilityState.Companion.m3610getEnterjXw82LU() : strM3609unboximpl;
    }

    public final long getMaxDuration() {
        Long l;
        Iterator<T> it = this.animationClocks.values().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l = lValueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long getMaxDurationPerIteration() {
        Long l;
        Iterator<T> it = this.animationClocks.values().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l = lValueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final List<TransitionInfo> getTransitions(ComposeAnimation composeAnimation, long j) {
        List<TransitionInfo> transitions;
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        return (composeAnimationClock == null || (transitions = composeAnimationClock.getTransitions(j)) == null) ? instance_delegatelambda0.write : transitions;
    }

    public final void updateAnimatedVisibilityState(ComposeAnimation composeAnimation, Object obj) {
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        if (composeAnimationClock != null) {
            ComposeAnimationClock.setStateParameters$default(composeAnimationClock, obj, null, 2, null);
        }
    }

    public final void updateFromAndToStates(ComposeAnimation composeAnimation, Object obj, Object obj2) {
        ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(composeAnimation);
        if (composeAnimationClock != null) {
            composeAnimationClock.setStateParameters(obj, obj2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.tooling.animation.PreviewAnimationClock$clockInfo$1] */
    public PreviewAnimationClock(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.requestLayout = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.applySnapshot = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    public final void setClockTime(long j) {
        long jMillisToNanos = Utils_androidKt.millisToNanos(j);
        Iterator<T> it = this.animationClocks.values().iterator();
        while (it.hasNext()) {
            ((ComposeAnimationClock) it.next()).setClockTime(jMillisToNanos);
        }
        this.applySnapshot.invoke();
    }

    public final void setClockTimes(Map<ComposeAnimation, Long> map) {
        for (Map.Entry<ComposeAnimation, Long> entry : map.entrySet()) {
            ComposeAnimation key = entry.getKey();
            long jLongValue = entry.getValue().longValue();
            ComposeAnimationClock<?, ?> composeAnimationClock = this.animationClocks.get(key);
            if (composeAnimationClock != null) {
                composeAnimationClock.setClockTime(Utils_androidKt.millisToNanos(jLongValue));
            }
        }
        this.applySnapshot.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel trackComposeAnimation$lambda$0(SearchInfo searchInfo, PreviewAnimationClock previewAnimationClock, Object obj) {
        ComposeAnimation composeAnimationCreateAnimation;
        SearchInfo searchInfo2 = !(searchInfo instanceof UnsupportedSearchInfo) ? searchInfo : null;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (searchInfo2 == null || (composeAnimationCreateAnimation = searchInfo2.createAnimation()) == null) {
            UnsupportedComposeAnimation unsupportedComposeAnimationCreate = UnsupportedComposeAnimation.Companion.create(searchInfo.getLabel());
            if (unsupportedComposeAnimationCreate != null) {
                previewAnimationClock.trackedUnsupportedAnimations.add(unsupportedComposeAnimationCreate);
                previewAnimationClock.notifySubscribe(unsupportedComposeAnimationCreate);
            }
            return createfromparcel;
        }
        Map<ComposeAnimation, ComposeAnimationClock<?, ?>> map = previewAnimationClock.animationClocks;
        ComposeAnimationClock<?, ?> composeAnimationClockCreateClock = searchInfo.createClock(composeAnimationCreateAnimation, previewAnimationClock.clockInfo);
        composeAnimationClockCreateClock.setClockTime(0L);
        map.put(composeAnimationCreateAnimation, composeAnimationClockCreateClock);
        previewAnimationClock.notifySubscribe(composeAnimationCreateAnimation);
        return createfromparcel;
    }

    public final <AnimationType extends ComposeAnimation> void trackComposeAnimation(SearchInfo<AnimationType, ?> searchInfo) {
        trackAnimation(searchInfo.getAnimationObject(), new Navigator$$ExternalSyntheticLambda1(searchInfo, 15, this));
    }
}
