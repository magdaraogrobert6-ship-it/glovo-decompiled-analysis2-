package androidx.compose.ui.layout;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
final class RectRulersImpl implements RectRulers {
    private final String name;
    private VerticalRuler left = new VerticalRuler();
    private HorizontalRuler top = new HorizontalRuler();
    private VerticalRuler right = new VerticalRuler();
    private HorizontalRuler bottom = new HorizontalRuler();

    @Override // androidx.compose.ui.layout.RectRulers
    public HorizontalRuler getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public VerticalRuler getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public VerticalRuler getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public HorizontalRuler getTop() {
        return this.top;
    }

    public void setBottom(HorizontalRuler horizontalRuler) {
        this.bottom = horizontalRuler;
    }

    public void setLeft(VerticalRuler verticalRuler) {
        this.left = verticalRuler;
    }

    public void setRight(VerticalRuler verticalRuler) {
        this.right = verticalRuler;
    }

    public void setTop(HorizontalRuler horizontalRuler) {
        this.top = horizontalRuler;
    }

    public RectRulersImpl(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name != null ? ff$$ExternalSyntheticOutline0.m(new StringBuilder("RectRulers("), this.name, ')') : super.toString();
    }
}
