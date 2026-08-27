package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getFocusOwner {
    public final asList IconCompatParcelizer;
    public final asList RemoteActionCompatParcelizer;
    public final asList read;
    public final getClipMetadata serializer;
    public final boolean write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        boolean z = this.write;
        int iHashCode2 = this.IconCompatParcelizer.RemoteActionCompatParcelizer.hashCode();
        return this.read.RemoteActionCompatParcelizer.hashCode() + ((this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.hashCode() + ((iHashCode2 + (((iHashCode * 31) + (z ? 1 : 0)) * 31)) * 31)) * 31);
    }

    public getFocusOwner(getClipMetadata getclipmetadata, boolean z, asList aslist, asList aslist2, asList aslist3) {
        this.serializer = getclipmetadata;
        this.write = z;
        this.IconCompatParcelizer = aslist;
        this.RemoteActionCompatParcelizer = aslist2;
        this.read = aslist3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getFocusOwner.class != obj.getClass()) {
            return false;
        }
        getFocusOwner getfocusowner = (getFocusOwner) obj;
        if (this.write == getfocusowner.write && this.serializer.equals(getfocusowner.serializer) && this.IconCompatParcelizer.equals(getfocusowner.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(getfocusowner.RemoteActionCompatParcelizer)) {
            return this.read.equals(getfocusowner.read);
        }
        return false;
    }
}
