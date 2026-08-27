package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import o.ScrollableNodesetScrollSemanticsActions11;
import o.ScrollingLogicdoFlingAnimation2reverseScope1;
import o.TapGestureDetectorKt;
import o.consumefoundation;
import o.onKeyEventZmokQxo;
import o.requiredWidthInVpY3zN4default;
import o.sendDragEventEu1f8Dk;

/* JADX INFO: loaded from: classes.dex */
public interface AnimatedVisibilityScope {
    Transition serializer();

    static /* synthetic */ Modifier IconCompatParcelizer(sendDragEventEu1f8Dk senddrageventeu1f8dk, Modifier.Companion companion, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, int i) {
        if ((i & 1) != 0) {
            scrollingLogicdoFlingAnimation2reverseScope1 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
        }
        if ((i & 2) != 0) {
            tapGestureDetectorKt = onKeyEventZmokQxo.write(null, 3);
        }
        return senddrageventeu1f8dk.animateEnterExit(companion, scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt);
    }

    default Modifier animateEnterExit(Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ScrollableNodesetScrollSemanticsActions11(scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt, 1) : InspectableValueKt.getNoInspectorInfo(), new consumefoundation(this, scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt));
    }
}
