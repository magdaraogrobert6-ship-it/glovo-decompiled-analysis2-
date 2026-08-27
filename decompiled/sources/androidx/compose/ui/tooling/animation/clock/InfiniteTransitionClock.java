package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BoxMeasurePolicy;
import o.RemoteActionCompatParcelizer;
import o.SizeNode;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;
import o.onShowTranslationui;
import o.placeSpaceBetweenfoundation_layout;
import o.placeSpaceEvenlyfoundation_layout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.requiredWidth3ABfNKs;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteTransitionClock implements ComposeAnimationClock<InfiniteTransitionComposeAnimation, TargetState<Object>> {
    public static final int $stable = 8;
    private final InfiniteTransitionComposeAnimation animation;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 maxDuration;
    private TargetState<Object> state;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0() {
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(Object obj, Object obj2) {
    }

    private final <T, V extends TransformGestureDetectorKtdetectTransformGestures2> long getIterationDuration(placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layout) {
        TrackpadScrollingLogic trackpadScrollingLogic = placespacebetweenfoundation_layout.serializer;
        trackpadScrollingLogic.getClass();
        placeSpaceEvenlyfoundation_layout placespaceevenlyfoundation_layout = (placeSpaceEvenlyfoundation_layout) trackpadScrollingLogic;
        int i = placespaceevenlyfoundation_layout.serializer == BoxMeasurePolicy.Reverse ? 2 : 1;
        SizeNode sizeNodeSerializer = placespaceevenlyfoundation_layout.RemoteActionCompatParcelizer.serializer(requiredWidth3ABfNKs.read);
        return Utils_androidKt.millisToNanos(((long) sizeNodeSerializer.IconCompatParcelizer()) + ((long) (sizeNodeSerializer.serializer() * i)));
    }

    public InfiniteTransitionClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.animation = infiniteTransitionComposeAnimation;
        this.maxDuration = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.state = new TargetState<>(0, 0);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        List<placeSpaceBetweenfoundation_layout> list = getAnimation().getAnimationObject().IconCompatParcelizer.read();
        ArrayList arrayList = new ArrayList();
        for (placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layout : list) {
            Object value = ((onShowTranslationui) placespacebetweenfoundation_layout.MediaSessionCompatQueueItem).getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(placespacebetweenfoundation_layout.IconCompatParcelizer, value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Math.max(getMaxDurationPerIteration(), ((Number) this.maxDuration.invoke()).longValue());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Long l;
        Iterator it = getAnimation().getAnimationObject().IconCompatParcelizer.read().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(getIterationDuration((placeSpaceBetweenfoundation_layout) it.next()));
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(getIterationDuration((placeSpaceBetweenfoundation_layout) it.next()));
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l = lValueOf;
        } else {
            l = null;
        }
        return Utils_androidKt.nanosToMillis(l != null ? l.longValue() : 0L);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public List<TransitionInfo> getTransitions(long j) {
        List list = getAnimation().getAnimationObject().IconCompatParcelizer.read();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Utils_androidKt.createTransitionInfo((placeSpaceBetweenfoundation_layout) it.next(), j, getMaxDuration()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return onContentCardDismissed.PlaybackStateCompat(arrayList2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j) {
        getAnimation().setTimeNanos(j);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public TargetState<Object> getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(TargetState<Object> targetState) {
        this.state = targetState;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public InfiniteTransitionComposeAnimation getAnimation() {
        return this.animation;
    }

    public /* synthetic */ InfiniteTransitionClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(infiniteTransitionComposeAnimation, (i & 2) != 0 ? new RemoteActionCompatParcelizer(26) : r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }
}
