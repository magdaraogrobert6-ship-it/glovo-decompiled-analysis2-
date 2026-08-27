package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class FocusModifierKt {
    @onItemDismisslambda0
    public static final Modifier focusModifier(Modifier modifier) {
        return focusTarget(modifier);
    }

    public static final Modifier focusTarget(Modifier modifier) {
        return modifier.then(FocusTargetNode.FocusTargetElement.INSTANCE);
    }
}
