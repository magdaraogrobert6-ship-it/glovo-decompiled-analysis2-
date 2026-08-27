package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
final class WindowInsetsRulersImpl implements WindowInsetsRulers {
    private final RectRulers current;
    private final RectRulers maximum;
    private final String name;

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public WindowInsetsAnimation getAnimation(Placeable.PlacementScope placementScope) {
        return WindowInsetsRulers_androidKt.findInsetsAnimationProperties(placementScope, this);
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public RectRulers getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public RectRulers getMaximum() {
        return this.maximum;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public WindowInsetsRulersImpl(String str) {
        this.name = str;
        this.current = RectRulersKt.RectRulers(str);
        this.maximum = RectRulersKt.RectRulers(str + " maximum");
    }
}
