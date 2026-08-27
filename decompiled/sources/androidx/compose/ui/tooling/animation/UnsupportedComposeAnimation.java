package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ItemTouchHelperAdapter;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedComposeAnimation implements ComposeAnimation {
    private static boolean apiAvailable;
    private final Object animationObject;
    private final String label;
    private final Set<Integer> states;
    private final ComposeAnimationType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public Object getAnimationObject() {
        return this.animationObject;
    }

    public String getLabel() {
        return this.label;
    }

    public Set<Integer> getStates() {
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
            return UnsupportedComposeAnimation.apiAvailable;
        }

        public final void testOverrideAvailability(boolean z) {
            UnsupportedComposeAnimation.apiAvailable = z;
        }

        private Companion() {
        }

        public final UnsupportedComposeAnimation create(String str) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (getApiAvailable()) {
                return new UnsupportedComposeAnimation(str, defaultConstructorMarker);
            }
            return null;
        }
    }

    static {
        boolean z = false;
        for (ComposeAnimationType composeAnimationType : ComposeAnimationType.values()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{composeAnimationType.name(), "UNSUPPORTED"}, getCieXyz.write())).booleanValue()) {
                z = true;
                break;
            }
        }
        apiAvailable = z;
    }

    private UnsupportedComposeAnimation(String str) {
        this.label = str;
        this.type = ComposeAnimationType.UNSUPPORTED;
        this.animationObject = 0;
        this.states = ItemTouchHelperAdapter.serializer;
    }

    public /* synthetic */ UnsupportedComposeAnimation(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
