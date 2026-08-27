package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.AnimationDebugMutableState;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.DrawableTransformation;
import o.ItemTouchHelperAdapter;
import o.PopulateViewStructure_androidKtpopulate7;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class TriggerComposeAnimation<T> {
    private final PopulateViewStructure_androidKtpopulate7 animationObject;
    private final T defaultState;
    private T initialState;
    private final String label;
    private final Set<T> states;
    private T targetState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final PopulateViewStructure_androidKtpopulate7 getAnimationObject() {
        return this.animationObject;
    }

    public final T getInitialState() {
        return this.initialState;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Set<T> getStates() {
        return this.states;
    }

    public final T getTargetState() {
        return this.targetState;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> TriggerComposeAnimation<T> parse(AnimationDebugMutableState<T> animationDebugMutableState) {
            return new TriggerComposeAnimation<>(animationDebugMutableState, animationDebugMutableState.getLabel(), (Set) animationDebugMutableState.getStates().invoke(), null);
        }
    }

    private TriggerComposeAnimation(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, String str, Set<? extends T> set) {
        this.animationObject = populateViewStructure_androidKtpopulate7;
        this.label = str;
        this.initialState = (T) populateViewStructure_androidKtpopulate7.getValue();
        Set<? extends T> set2 = set;
        for (T t : set2) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{t, this.initialState}, getCieXyz.write())).booleanValue()) {
                this.targetState = t;
                Set<T> setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) set2));
                Object value = this.animationObject.getValue();
                setParcelableVolumeInfo.addAll(value != null ? RangesKt.write(value) : ItemTouchHelperAdapter.serializer);
                this.states = setParcelableVolumeInfo;
                this.defaultState = (T) this.animationObject.getValue();
                return;
            }
        }
        DrawableTransformation.write("Collection contains no element matching the predicate.");
        throw null;
    }

    public /* synthetic */ TriggerComposeAnimation(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, String str, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(populateViewStructure_androidKtpopulate7, str, set);
    }
}
