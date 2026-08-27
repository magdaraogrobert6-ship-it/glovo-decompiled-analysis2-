package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSnapshotObserver {
    public final childHitTestqzLsGqo RemoteActionCompatParcelizer;
    public final accessgetOnCommitAffectingLayercp write;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + ((this.write.hashCode() + 899) * 31);
    }

    public final String toString() {
        return (this.write == accessgetOnCommitAffectingLayercp.ASCENDING ? "" : "-").concat(this.RemoteActionCompatParcelizer.write());
    }

    public accessgetSnapshotObserver(accessgetOnCommitAffectingLayercp accessgetoncommitaffectinglayercp, childHitTestqzLsGqo childhittestqzlsgqo) {
        this.write = accessgetoncommitaffectinglayercp;
        this.RemoteActionCompatParcelizer = childhittestqzlsgqo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof accessgetSnapshotObserver)) {
            return false;
        }
        accessgetSnapshotObserver accessgetsnapshotobserver = (accessgetSnapshotObserver) obj;
        return this.write == accessgetsnapshotobserver.write && this.RemoteActionCompatParcelizer.equals(accessgetsnapshotobserver.RemoteActionCompatParcelizer);
    }
}
