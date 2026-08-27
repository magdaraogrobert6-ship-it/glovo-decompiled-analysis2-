package o;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 {
    public final int IconCompatParcelizer;
    public final NodeCoordinatorKt serializer;

    public NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1(int i, NodeCoordinatorKt nodeCoordinatorKt) {
        this.IconCompatParcelizer = i;
        this.serializer = nodeCoordinatorKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1)) {
            return false;
        }
        NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1 = (NodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1) obj;
        return this.IconCompatParcelizer == nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1.IconCompatParcelizer && this.serializer.equals(nodeCoordinatordrawBlockdrawBlockCallToDrawModifiers1.serializer);
    }

    public final String toString() {
        return "Overlay{largestBatchId=" + this.IconCompatParcelizer + ", mutation=" + this.serializer + "}";
    }

    public final int hashCode() {
        return ((this.IconCompatParcelizer ^ 1000003) * 1000003) ^ this.serializer.hashCode();
    }
}
