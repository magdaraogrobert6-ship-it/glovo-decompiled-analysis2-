package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getBottomStart implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ AlignmentHorizontal serializer;

    public /* synthetic */ getBottomStart(AlignmentHorizontal alignmentHorizontal, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = alignmentHorizontal;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AlignmentHorizontal alignmentHorizontal = this.serializer;
        if (i == 0) {
            alignmentHorizontal.write(((androidx.compose.ui.geometry.Offset) obj).m487unboximpl(), getNodeannotations.write);
            return createfromparcel;
        }
        if (i != 1) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            alignmentHorizontal.read(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange));
            pointerInputChange.consume();
            return createfromparcel;
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
        alignmentHorizontal.read(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange2));
        pointerInputChange2.consume();
        return createfromparcel;
    }
}
