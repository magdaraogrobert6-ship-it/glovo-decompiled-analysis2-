package o;

/* JADX INFO: loaded from: classes2.dex */
public final class toParentPosition8S9VItkdefault {
    public final transformFromAncestorEL8BTi8 IconCompatParcelizer;
    public final transformFromAncestorEL8BTi8 RemoteActionCompatParcelizer;
    public final updateLayerParametersdefault write;

    public final transformFromAncestorEL8BTi8 RemoteActionCompatParcelizer(NodeCoordinatorCompanion nodeCoordinatorCompanion) {
        return nodeCoordinatorCompanion.equals(NodeCoordinatorCompanion.DESCENDING) ? this.IconCompatParcelizer : this.RemoteActionCompatParcelizer;
    }

    public toParentPosition8S9VItkdefault() {
        updateLayerParametersdefault updatelayerparametersdefault = new updateLayerParametersdefault();
        updatelayerparametersdefault.write = 0;
        updatelayerparametersdefault.read = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
        this.write = updatelayerparametersdefault;
        this.RemoteActionCompatParcelizer = new transformFromAncestorEL8BTi8(this, 0);
        this.IconCompatParcelizer = new transformFromAncestorEL8BTi8(this, 1);
    }
}
