package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getUnspecified_hLwfpc extends setPlacementApproachInProgress {
    public final android.graphics.Typeface RemoteActionCompatParcelizer;
    public boolean read;
    public final PinnableContainerKtLocalPinnableContainer1 serializer;

    public getUnspecified_hLwfpc(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, android.graphics.Typeface typeface) {
        this.RemoteActionCompatParcelizer = typeface;
        this.serializer = pinnableContainerKtLocalPinnableContainer1;
    }

    @Override // o.setPlacementApproachInProgress
    public final void RemoteActionCompatParcelizer(int i) {
        if (this.read) {
            return;
        }
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = (accessgetReuseForceSyncDeactivationcp) this.serializer.serializer;
        if (accessgetreuseforcesyncdeactivationcp.IconCompatParcelizer(this.RemoteActionCompatParcelizer)) {
            accessgetreuseforcesyncdeactivationcp.write(false);
        }
    }

    @Override // o.setPlacementApproachInProgress
    public final void serializer(android.graphics.Typeface typeface, boolean z) {
        if (this.read) {
            return;
        }
        accessgetReuseForceSyncDeactivationcp accessgetreuseforcesyncdeactivationcp = (accessgetReuseForceSyncDeactivationcp) this.serializer.serializer;
        if (accessgetreuseforcesyncdeactivationcp.IconCompatParcelizer(typeface)) {
            accessgetreuseforcesyncdeactivationcp.write(false);
        }
    }
}
