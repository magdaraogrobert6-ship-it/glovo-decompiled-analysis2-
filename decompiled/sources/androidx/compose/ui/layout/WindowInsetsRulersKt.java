package androidx.compose.ui.layout;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class WindowInsetsRulersKt {
    private static final RectRulers NeverProvidedRectRulers = RectRulersKt.RectRulers();

    public static final List<RectRulers> getDisplayCutoutBounds(Placeable.PlacementScope placementScope) {
        return WindowInsetsRulers_androidKt.findDisplayCutouts(placementScope);
    }

    public static final RectRulers getNeverProvidedRectRulers() {
        return NeverProvidedRectRulers;
    }
}
