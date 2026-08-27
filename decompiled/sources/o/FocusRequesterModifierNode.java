package o;

/* JADX INFO: loaded from: classes.dex */
public class FocusRequesterModifierNode extends C0165focusRequester {
    public FocusRequesterModifierNode() {
    }

    @Override // o.FocusRequesterModifierNodeKt, o.FocusRequesterModifier
    public void IconCompatParcelizer(int i, setRight setright) {
        this.serializer.setInsets(FocusRestorerKt.write(i), setright.bt_());
    }

    public FocusRequesterModifierNode(FocusRequesterModifierKt focusRequesterModifierKt) {
        super(focusRequesterModifierKt);
    }
}
