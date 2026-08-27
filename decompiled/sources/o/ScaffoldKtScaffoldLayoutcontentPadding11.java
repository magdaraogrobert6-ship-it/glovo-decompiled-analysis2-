package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ScaffoldKtScaffoldLayoutcontentPadding11 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;
    public final /* synthetic */ ScaffoldKt write;

    public /* synthetic */ ScaffoldKtScaffoldLayoutcontentPadding11(ScaffoldKt scaffoldKt, int i) {
        this.read = i;
        this.write = scaffoldKt;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        ScaffoldKt scaffoldKt = this.write;
        androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) obj;
        if (i != 0) {
            traversableNode.getClass();
            scaffoldKt.write = ((ScaffoldKt) traversableNode).serializer;
            return Boolean.FALSE;
        }
        traversableNode.getClass();
        ScaffoldKt scaffoldKt2 = (ScaffoldKt) traversableNode;
        TooltipDefaults tooltipDefaults = scaffoldKt.serializer;
        Object[] objArr = {scaffoldKt2.write, tooltipDefaults};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            scaffoldKt2.write = tooltipDefaults;
            scaffoldKt2.IconCompatParcelizer();
        }
        return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
    }
}
