package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bringIntoView implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ bringIntoView(int i, int i2, int i3, Object obj) {
        this.RemoteActionCompatParcelizer = i3;
        this.serializer = obj;
        this.write = i;
        this.IconCompatParcelizer = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        if (i != 0) {
            return androidx.compose.ui.text.MultiParagraph.getPathForRange$lambda$1((androidx.compose.ui.graphics.Path) obj2, this.write, this.IconCompatParcelizer, (androidx.compose.ui.text.ParagraphInfo) obj);
        }
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelativeWithLayer$default((androidx.compose.ui.layout.Placeable.PlacementScope) obj, (androidx.compose.ui.layout.Placeable) obj2, this.write, this.IconCompatParcelizer, 0.0f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null, 12, (Object) null);
        return createFromParcel.INSTANCE;
    }
}
