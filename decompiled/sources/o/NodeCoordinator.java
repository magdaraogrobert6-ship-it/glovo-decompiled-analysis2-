package o;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeCoordinator {
    public final accessgetGraphicsLayerScopecp IconCompatParcelizer;
    public final visitNodes serializer;

    public final int hashCode() {
        return this.serializer.RemoteActionCompatParcelizer.hashCode() + ((this.IconCompatParcelizer.hashCode() + 2077) * 31);
    }

    public NodeCoordinator(accessgetGraphicsLayerScopecp accessgetgraphicslayerscopecp, visitNodes visitnodes) {
        this.IconCompatParcelizer = accessgetgraphicslayerscopecp;
        this.serializer = visitnodes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NodeCoordinator)) {
            return false;
        }
        NodeCoordinator nodeCoordinator = (NodeCoordinator) obj;
        return this.IconCompatParcelizer.equals(nodeCoordinator.IconCompatParcelizer) && this.serializer.equals(nodeCoordinator.serializer);
    }
}
