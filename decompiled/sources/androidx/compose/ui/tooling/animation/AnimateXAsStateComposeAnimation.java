package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.ui.tooling.animation.search.AnimateXAsStateSearchInfo;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.TrackpadScrollingLogic;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.getCieXyz;
import o.onContentCardClicked;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AnimateXAsStateComposeAnimation<T, V extends TransformGestureDetectorKtdetectTransformGestures2> implements ComposeAnimation {
    private static boolean apiAvailable;
    private final Animatable animationObject;
    private final TrackpadScrollingLogic animationSpec;
    private final Object initialState;
    private final String label;
    private final Set<Object> states;
    private final Object targetState;
    private final ToolingState<T> toolingState;
    private final ComposeAnimationType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final TrackpadScrollingLogic getAnimationSpec() {
        return this.animationSpec;
    }

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

    public final ToolingState<T> getToolingState() {
        return this.toolingState;
    }

    public ComposeAnimationType getType() {
        return this.type;
    }

    public final void setState(Object obj) {
        this.toolingState.setValue(obj);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getApiAvailable() {
            return AnimateXAsStateComposeAnimation.apiAvailable;
        }

        public final void testOverrideAvailability(boolean z) {
            AnimateXAsStateComposeAnimation.apiAvailable = z;
        }

        private Companion() {
        }

        public final <T, V extends TransformGestureDetectorKtdetectTransformGestures2> AnimateXAsStateComposeAnimation<T, V> parse$ui_tooling(AnimateXAsStateSearchInfo<T, V> animateXAsStateSearchInfo) {
            if (getApiAvailable() && animateXAsStateSearchInfo.getAnimatable().write() != null) {
                return new AnimateXAsStateComposeAnimation<>(animateXAsStateSearchInfo.getInitialState(), animateXAsStateSearchInfo.getTargetState(), animateXAsStateSearchInfo.getToolingOverride().getState(), animateXAsStateSearchInfo.getAnimationSpec(), animateXAsStateSearchInfo.getAnimatable(), null);
            }
            return null;
        }
    }

    static {
        boolean z = false;
        for (ComposeAnimationType composeAnimationType : ComposeAnimationType.values()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{composeAnimationType.name(), "ANIMATE_X_AS_STATE"}, getCieXyz.write())).booleanValue()) {
                z = true;
                break;
            }
        }
        apiAvailable = z;
    }

    private AnimateXAsStateComposeAnimation(Object obj, Object obj2, ToolingState<T> toolingState, TrackpadScrollingLogic trackpadScrollingLogic, Animatable animatable) {
        this.initialState = obj;
        this.targetState = obj2;
        this.toolingState = toolingState;
        this.animationSpec = trackpadScrollingLogic;
        this.animationObject = animatable;
        this.type = ComposeAnimationType.ANIMATE_X_AS_STATE;
        Object objWrite = m3587getAnimationObject().write();
        objWrite.getClass();
        Object[] enumConstants = objWrite.getClass().getEnumConstants();
        this.states = enumConstants != null ? onContentCardClicked.MediaSessionCompatQueueItem(enumConstants) : RangesKt.write(objWrite);
        this.label = m3587getAnimationObject().write;
    }

    /* JADX INFO: renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public Animatable m3587getAnimationObject() {
        return this.animationObject;
    }

    public /* synthetic */ AnimateXAsStateComposeAnimation(Object obj, Object obj2, ToolingState toolingState, TrackpadScrollingLogic trackpadScrollingLogic, Animatable animatable, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, toolingState, trackpadScrollingLogic, animatable);
    }
}
