package o;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableKtrestartable21 implements PullToRefreshBox {
    public final DragAndDropTargetModifierNode RemoteActionCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    @Override // o.PullToRefreshBox
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.PullToRefreshBox
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer() {
        return this.write;
    }

    public AnchoredDraggableKtrestartable21(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.RemoteActionCompatParcelizer = dragAndDropTargetModifierNode;
    }
}
