package com.google.firebase.firestore.model;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes2.dex */
public final class SnapshotVersion implements Comparable {
    public static final SnapshotVersion IconCompatParcelizer = new SnapshotVersion(new Timestamp(0, 0));
    public final Timestamp read;

    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final int compareTo(SnapshotVersion snapshotVersion) {
        return this.read.compareTo(snapshotVersion.read);
    }

    public SnapshotVersion(Timestamp timestamp) {
        this.read = timestamp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SnapshotVersion) && this.read.compareTo(((SnapshotVersion) obj).read) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotVersion(seconds=");
        Timestamp timestamp = this.read;
        sb.append(timestamp.IconCompatParcelizer);
        sb.append(", nanos=");
        return af$$ExternalSyntheticOutline0.m(timestamp.RemoteActionCompatParcelizer, ")", sb);
    }
}
