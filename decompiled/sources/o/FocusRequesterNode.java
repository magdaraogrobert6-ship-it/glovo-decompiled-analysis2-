package o;

/* JADX INFO: loaded from: classes.dex */
public class FocusRequesterNode extends FocusRequesterModifierNode {
    @Override // o.FocusRequesterModifierNode, o.FocusRequesterModifierNodeKt, o.FocusRequesterModifier
    public void IconCompatParcelizer(int i, setRight setright) {
        super.IconCompatParcelizer(i, setright);
    }

    @Override // o.FocusRequesterModifier
    public void read(FocusRequesterModifierKt focusRequesterModifierKt) {
    }

    public FocusRequesterNode(FocusRequesterModifierKt focusRequesterModifierKt) {
        super(focusRequesterModifierKt);
        focusRequesterModifierKt.IconCompatParcelizer.isConsumed();
    }

    public FocusRequesterNode() {
    }
}
