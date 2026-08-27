package o;

/* JADX INFO: loaded from: classes2.dex */
public enum releaseLayer {
    NO_DOCUMENT(1),
    FOUND_DOCUMENT(2),
    UNKNOWN_DOCUMENT(3),
    INVALID_DOCUMENT(4);

    public final int dbValue;

    public static releaseLayer forMutableDocument(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        if (nodeCoordinatorCompanionPointerInputSource1.serializer.equals(getSemanticsSource.NO_DOCUMENT)) {
            return NO_DOCUMENT;
        }
        if (nodeCoordinatorCompanionPointerInputSource1.read()) {
            return FOUND_DOCUMENT;
        }
        if (nodeCoordinatorCompanionPointerInputSource1.serializer.equals(getSemanticsSource.UNKNOWN_DOCUMENT)) {
            return UNKNOWN_DOCUMENT;
        }
        getRectManager.RemoteActionCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1.serializer.equals(getSemanticsSource.INVALID), "MutableDocument has an unknown type", new Object[0]);
        return INVALID_DOCUMENT;
    }

    releaseLayer(int i) {
        this.dbValue = i;
    }
}
