package o;

import com.google.firebase.firestore.model.SnapshotVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeCoordinatorCompanionPointerInputSource1 {
    public SnapshotVersion IconCompatParcelizer;
    public SnapshotVersion MediaDescriptionCompat;
    public getPointerInputSource RemoteActionCompatParcelizer;
    public final visitNodes read;
    public getSemanticsSource serializer;
    public entityTypeOLwlOKw write;

    public static NodeCoordinatorCompanionPointerInputSource1 serializer(visitNodes visitnodes) {
        getSemanticsSource getsemanticssource = getSemanticsSource.INVALID;
        SnapshotVersion snapshotVersion = SnapshotVersion.IconCompatParcelizer;
        return new NodeCoordinatorCompanionPointerInputSource1(visitnodes, getsemanticssource, snapshotVersion, snapshotVersion, new entityTypeOLwlOKw(), getPointerInputSource.SYNCED);
    }

    public static NodeCoordinatorCompanionPointerInputSource1 write(visitNodes visitnodes, SnapshotVersion snapshotVersion) {
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = new NodeCoordinatorCompanionPointerInputSource1(visitnodes);
        nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer(snapshotVersion);
        return nodeCoordinatorCompanionPointerInputSource1;
    }

    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.equals(getPointerInputSource.HAS_LOCAL_MUTATIONS);
    }

    public final void RemoteActionCompatParcelizer(SnapshotVersion snapshotVersion) {
        this.MediaDescriptionCompat = snapshotVersion;
        this.serializer = getSemanticsSource.NO_DOCUMENT;
        this.write = new entityTypeOLwlOKw();
        this.RemoteActionCompatParcelizer = getPointerInputSource.SYNCED;
    }

    public final int hashCode() {
        return this.read.RemoteActionCompatParcelizer.hashCode();
    }

    public final boolean read() {
        return this.serializer.equals(getSemanticsSource.FOUND_DOCUMENT);
    }

    public final void serializer(SnapshotVersion snapshotVersion, entityTypeOLwlOKw entitytypeolwlokw) {
        this.MediaDescriptionCompat = snapshotVersion;
        this.serializer = getSemanticsSource.FOUND_DOCUMENT;
        this.write = entitytypeolwlokw;
        this.RemoteActionCompatParcelizer = getPointerInputSource.SYNCED;
    }

    public NodeCoordinatorCompanionPointerInputSource1(visitNodes visitnodes, getSemanticsSource getsemanticssource, SnapshotVersion snapshotVersion, SnapshotVersion snapshotVersion2, entityTypeOLwlOKw entitytypeolwlokw, getPointerInputSource getpointerinputsource) {
        this.read = visitnodes;
        this.MediaDescriptionCompat = snapshotVersion;
        this.IconCompatParcelizer = snapshotVersion2;
        this.serializer = getsemanticssource;
        this.RemoteActionCompatParcelizer = getpointerinputsource;
        this.write = entitytypeolwlokw;
    }

    public final String toString() {
        return "Document{key=" + this.read + ", version=" + this.MediaDescriptionCompat + ", readTime=" + this.IconCompatParcelizer + ", type=" + this.serializer + ", documentState=" + this.RemoteActionCompatParcelizer + ", value=" + this.write + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NodeCoordinatorCompanionPointerInputSource1.class != obj.getClass()) {
            return false;
        }
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        if (this.read.equals(nodeCoordinatorCompanionPointerInputSource1.read) && this.MediaDescriptionCompat.equals(nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat) && this.serializer.equals(nodeCoordinatorCompanionPointerInputSource1.serializer) && this.RemoteActionCompatParcelizer.equals(nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer)) {
            return this.write.equals(nodeCoordinatorCompanionPointerInputSource1.write);
        }
        return false;
    }

    public NodeCoordinatorCompanionPointerInputSource1(visitNodes visitnodes) {
        this.read = visitnodes;
        this.IconCompatParcelizer = SnapshotVersion.IconCompatParcelizer;
    }
}
