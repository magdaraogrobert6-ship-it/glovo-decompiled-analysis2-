package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getTopRight implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager RemoteActionCompatParcelizer;
    public final /* synthetic */ DragAndDropTargetModifierNode read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getTopRight(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = textFieldSelectionManager;
        this.read = dragAndDropTargetModifierNode;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.serializer;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.read;
        androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i != 0) {
            getTopLeft.serializer(textFieldSelectionManager, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
            return createfromparcel;
        }
        Actual_androidKt.write(textFieldSelectionManager, dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1));
        return createfromparcel;
    }
}
