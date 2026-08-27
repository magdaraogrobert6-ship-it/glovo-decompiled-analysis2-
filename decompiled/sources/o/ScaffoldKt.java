package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class ScaffoldKt extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {
    public TooltipDefaults serializer;
    public TooltipDefaults write;

    public abstract TooltipDefaults IconCompatParcelizer(TooltipDefaults tooltipDefaults);

    public void IconCompatParcelizer() {
        this.serializer = IconCompatParcelizer(this.write);
        androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new ScaffoldKtScaffoldLayoutcontentPadding11(this, 0));
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.serializer = this.write;
        androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new ScaffoldKtScaffoldLayoutcontentPadding11(this, 0));
        super.onDetach();
    }

    public ScaffoldKt() {
        ModalBottomSheet_androidKtModalBottomSheetDialogdialog111 modalBottomSheet_androidKtModalBottomSheetDialogdialog111 = androidx.compose.foundation.layout.OffsetKt.read;
        this.write = modalBottomSheet_androidKtModalBottomSheetDialogdialog111;
        this.serializer = modalBottomSheet_androidKtModalBottomSheetDialogdialog111;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new ScaffoldKtScaffoldLayoutcontentPadding11(this, 1));
        IconCompatParcelizer();
        super.onAttach();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        this.write = androidx.compose.foundation.layout.OffsetKt.read;
    }
}
