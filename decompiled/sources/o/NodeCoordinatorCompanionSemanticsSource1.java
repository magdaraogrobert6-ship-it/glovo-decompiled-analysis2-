package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NodeCoordinatorCompanionSemanticsSource1 {
    public static boolean read(accessgetSnapshotObserver accessgetsnapshotobserver, shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings) {
        childHitTestqzLsGqo childhittestqzlsgqo = accessgetsnapshotobserver.RemoteActionCompatParcelizer;
        accessgetOnCommitAffectingLayercp accessgetoncommitaffectinglayercp = accessgetsnapshotobserver.write;
        childHitTestqzLsGqo childhittestqzlsgqo2 = shouldsharepointerinputwithsiblings.IconCompatParcelizer;
        NodeCoordinatorCompanion nodeCoordinatorCompanion = shouldsharepointerinputwithsiblings.RemoteActionCompatParcelizer;
        if (!childhittestqzlsgqo.equals(childhittestqzlsgqo2)) {
            return false;
        }
        if (nodeCoordinatorCompanion.equals(NodeCoordinatorCompanion.ASCENDING) && accessgetoncommitaffectinglayercp.equals(accessgetOnCommitAffectingLayercp.ASCENDING)) {
            return true;
        }
        return nodeCoordinatorCompanion.equals(NodeCoordinatorCompanion.DESCENDING) && accessgetoncommitaffectinglayercp.equals(accessgetOnCommitAffectingLayercp.DESCENDING);
    }

    public static boolean serializer(nodeReused nodereused, shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings) {
        if (nodereused != null) {
            updateUnsafe updateunsafe = nodereused.read;
            if (nodereused.serializer.equals(shouldsharepointerinputwithsiblings.IconCompatParcelizer)) {
                if (shouldsharepointerinputwithsiblings.RemoteActionCompatParcelizer.equals(NodeCoordinatorCompanion.CONTAINS) == (updateunsafe.equals(updateUnsafe.ARRAY_CONTAINS) || updateunsafe.equals(updateUnsafe.ARRAY_CONTAINS_ANY))) {
                    return true;
                }
            }
        }
        return false;
    }
}
