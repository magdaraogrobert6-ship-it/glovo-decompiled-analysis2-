package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutBoundsHolderKt {
    public static final Modifier layoutBounds(Modifier modifier, LayoutBoundsHolder layoutBoundsHolder) {
        return modifier.then(new LayoutBoundsElement(layoutBoundsHolder));
    }
}
