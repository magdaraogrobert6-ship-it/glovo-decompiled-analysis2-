package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.ui.tooling.animation.search.AnimatedContentSearchInfo;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.getCieXyz;
import o.onContentCardClicked;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {
    private static boolean apiAvailable;
    private final Transition animationObject;
    private final Object initialState;
    private final String label;
    private final Set<Object> states;
    private final Object targetState;
    private final ComposeAnimationType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

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

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getApiAvailable() {
            return AnimatedContentComposeAnimation.apiAvailable;
        }

        public final void testOverrideAvailability(boolean z) {
            AnimatedContentComposeAnimation.apiAvailable = z;
        }

        private Companion() {
        }

        public final AnimatedContentComposeAnimation<?> parseAnimatedContent(AnimatedContentSearchInfo animatedContentSearchInfo) {
            Object objIconCompatParcelizer;
            if (!getApiAvailable() || (objIconCompatParcelizer = animatedContentSearchInfo.getTransition().MediaSessionCompatToken.IconCompatParcelizer()) == null) {
                return null;
            }
            Object[] enumConstants = objIconCompatParcelizer.getClass().getEnumConstants();
            return new AnimatedContentComposeAnimation<>(animatedContentSearchInfo.getInitialState(), animatedContentSearchInfo.getTargetState(), animatedContentSearchInfo.getTransition(), enumConstants != null ? onContentCardClicked.MediaSessionCompatQueueItem(enumConstants) : RangesKt.write(objIconCompatParcelizer), animatedContentSearchInfo.getLabel(), null);
        }
    }

    static {
        boolean z = false;
        for (ComposeAnimationType composeAnimationType : ComposeAnimationType.values()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{composeAnimationType.name(), "ANIMATED_CONTENT"}, getCieXyz.write())).booleanValue()) {
                z = true;
                break;
            }
        }
        apiAvailable = z;
    }

    private AnimatedContentComposeAnimation(Object obj, Object obj2, Transition transition, Set<? extends Object> set, String str) {
        this.initialState = obj;
        this.targetState = obj2;
        this.animationObject = transition;
        this.states = set;
        this.label = str;
        this.type = ComposeAnimationType.ANIMATED_CONTENT;
    }

    @Override // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    /* JADX INFO: renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public Transition m3588getAnimationObject() {
        return this.animationObject;
    }

    public /* synthetic */ AnimatedContentComposeAnimation(Object obj, Object obj2, Transition transition, Set set, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, transition, set, str);
    }
}
