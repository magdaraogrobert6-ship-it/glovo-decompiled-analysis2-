package o;

import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableKtrestartable2 extends AbstractApplier {
    public final down serializer = new down();

    @Override // o.AbstractApplier
    public final down read() {
        return this.serializer;
    }

    public final void serializer(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        this.serializer.read(i, new AnchoredDraggableKtrestartable21(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, dragAndDropTargetModifierNode));
    }

    public AnchoredDraggableKtrestartable2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
    }

    public static void serializer(int i, AnchoredDraggableKtrestartable2 anchoredDraggableKtrestartable2, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        int i2 = 1;
        String str = (i & 1) != 0 ? null : "earnings";
        anchoredDraggableKtrestartable2.serializer.read(1, new AnchoredDraggableKtrestartable21(str != null ? new InlineChildren(7, str) : null, new getViewportSizeYbymL2g(19), new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(i2, dragAndDropTargetModifierNode), true, -857469575)));
    }
}
