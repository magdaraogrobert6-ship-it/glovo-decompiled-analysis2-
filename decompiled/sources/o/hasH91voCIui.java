package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hasH91voCIui implements Comparable {
    public final getClipMetadata write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return com.google.firebase.firestore.util.Util.IconCompatParcelizer(this.write, ((hasH91voCIui) obj).write);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public hasH91voCIui(getClipMetadata getclipmetadata) {
        this.write = getclipmetadata;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hasH91voCIui) {
            return this.write.equals(((hasH91voCIui) obj).write);
        }
        return false;
    }

    public final String toString() {
        return "Blob { bytes=" + com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(this.write) + " }";
    }
}
