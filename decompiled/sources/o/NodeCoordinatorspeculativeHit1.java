package o;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeCoordinatorspeculativeHit1 {
    public final NodeKindKt serializer;
    public final childHitTestqzLsGqo write;

    public final int hashCode() {
        return this.serializer.hashCode() + (this.write.hashCode() * 31);
    }

    public NodeCoordinatorspeculativeHit1(childHitTestqzLsGqo childhittestqzlsgqo, NodeKindKt nodeKindKt) {
        this.write = childhittestqzlsgqo;
        this.serializer = nodeKindKt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NodeCoordinatorspeculativeHit1.class != obj.getClass()) {
            return false;
        }
        NodeCoordinatorspeculativeHit1 nodeCoordinatorspeculativeHit1 = (NodeCoordinatorspeculativeHit1) obj;
        if (this.write.equals(nodeCoordinatorspeculativeHit1.write)) {
            return this.serializer.equals(nodeCoordinatorspeculativeHit1.serializer);
        }
        return false;
    }
}
