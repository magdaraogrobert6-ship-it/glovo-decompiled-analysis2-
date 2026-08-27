package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class visitNodesaLcG6gQ implements Comparable {
    public final String serializer;
    public final String write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        visitNodesaLcG6gQ visitnodesalcg6gq = (visitNodesaLcG6gQ) obj;
        int iCompareTo = this.write.compareTo(visitnodesalcg6gq.write);
        return iCompareTo != 0 ? iCompareTo : this.serializer.compareTo(visitnodesalcg6gq.serializer);
    }

    public final int hashCode() {
        return this.serializer.hashCode() + (this.write.hashCode() * 31);
    }

    public visitNodesaLcG6gQ(String str, String str2) {
        this.write = str;
        this.serializer = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatabaseId(");
        sb.append(this.write);
        sb.append(", ");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || visitNodesaLcG6gQ.class != obj.getClass()) {
            return false;
        }
        visitNodesaLcG6gQ visitnodesalcg6gq = (visitNodesaLcG6gQ) obj;
        return this.write.equals(visitnodesalcg6gq.write) && this.serializer.equals(visitnodesalcg6gq.serializer);
    }
}
