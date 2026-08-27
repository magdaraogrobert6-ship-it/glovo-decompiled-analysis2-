package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.ui.tooling.animation.search.InfiniteTransitionSearchInfo;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.ArrangementHorizontal;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class InfiniteTransitionComposeAnimation implements ComposeAnimation {
    private static boolean apiAvailable;
    private final ArrangementHorizontal animationObject;
    private final String label;
    private final Set<Object> states;
    private final ToolingState<Long> toolingState;
    private final ComposeAnimationType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public String getLabel() {
        return this.label;
    }

    public Set<Object> getStates() {
        return this.states;
    }

    public ComposeAnimationType getType() {
        return this.type;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getApiAvailable() {
            return InfiniteTransitionComposeAnimation.apiAvailable;
        }

        public final void testOverrideAvailability(boolean z) {
            InfiniteTransitionComposeAnimation.apiAvailable = z;
        }

        private Companion() {
        }

        public final InfiniteTransitionComposeAnimation parse$ui_tooling(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (getApiAvailable()) {
                return new InfiniteTransitionComposeAnimation(infiniteTransitionSearchInfo.getToolingOverride().getState(), infiniteTransitionSearchInfo.getInfiniteTransition(), defaultConstructorMarker);
            }
            return null;
        }
    }

    static {
        boolean z = false;
        for (ComposeAnimationType composeAnimationType : ComposeAnimationType.values()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{composeAnimationType.name(), "INFINITE_TRANSITION"}, getCieXyz.write())).booleanValue()) {
                z = true;
                break;
            }
        }
        apiAvailable = z;
    }

    private InfiniteTransitionComposeAnimation(ToolingState<Long> toolingState, ArrangementHorizontal arrangementHorizontal) {
        this.toolingState = toolingState;
        this.animationObject = arrangementHorizontal;
        this.type = ComposeAnimationType.INFINITE_TRANSITION;
        this.states = RangesKt.write((Object) 0);
        this.label = getAnimationObject().read;
    }

    public ArrangementHorizontal getAnimationObject() {
        return this.animationObject;
    }

    public final void setTimeNanos(long j) {
        this.toolingState.setValue(Long.valueOf(j));
    }

    public /* synthetic */ InfiniteTransitionComposeAnimation(ToolingState toolingState, ArrangementHorizontal arrangementHorizontal, DefaultConstructorMarker defaultConstructorMarker) {
        this(toolingState, arrangementHorizontal);
    }
}
