package androidx.compose.ui.focus;

import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;

/* JADX INFO: loaded from: classes.dex */
@r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
public final class Focusability {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Always = m405constructorimpl(1);
    private static final int SystemDefined = m405constructorimpl(0);
    private static final int Never = m405constructorimpl(2);

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m405constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m407equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m408hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m410unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Focusability m403boximpl(int i) {
        return new Focusability(i);
    }

    /* JADX INFO: renamed from: canFocus-impl$ui, reason: not valid java name */
    public static final boolean m404canFocusimpl$ui(int i, CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        if (m407equalsimpl0(i, Always)) {
            return true;
        }
        if (m407equalsimpl0(i, SystemDefined)) {
            return !InputMode.m1538equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, CompositionLocalsKt.getLocalInputModeManager())).mo1545getInputModeaOaMEAU(), InputMode.Companion.m1543getTouchaOaMEAU());
        }
        if (m407equalsimpl0(i, Never)) {
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Unknown Focusability");
        return false;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m409toStringimpl(int i) {
        if (m407equalsimpl0(i, Always)) {
            return "Always";
        }
        if (m407equalsimpl0(i, SystemDefined)) {
            return "SystemDefined";
        }
        if (m407equalsimpl0(i, Never)) {
            return "Never";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Unknown Focusability");
        return null;
    }

    public boolean equals(Object obj) {
        return m406equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m408hashCodeimpl(this.value);
    }

    public String toString() {
        return m409toStringimpl(this.value);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m411getAlwaysLCbbffg() {
            return Focusability.Always;
        }

        /* JADX INFO: renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m412getNeverLCbbffg() {
            return Focusability.Never;
        }

        /* JADX INFO: renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m413getSystemDefinedLCbbffg() {
            return Focusability.SystemDefined;
        }

        private Companion() {
        }
    }

    private /* synthetic */ Focusability(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m406equalsimpl(int i, Object obj) {
        return (obj instanceof Focusability) && i == ((Focusability) obj).m410unboximpl();
    }
}
