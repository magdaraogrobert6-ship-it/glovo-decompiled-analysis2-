package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
final class getContentCardSyncUserId {
    private final String IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final long serializer;

    public final long IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long read() {
        return this.serializer;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return Long.hashCode(this.RemoteActionCompatParcelizer) + d$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.serializer);
    }

    public getContentCardSyncUserId(String str, long j, long j2) {
        this.IconCompatParcelizer = str;
        this.serializer = j;
        this.RemoteActionCompatParcelizer = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getContentCardSyncUserId)) {
            return false;
        }
        getContentCardSyncUserId getcontentcardsyncuserid = (getContentCardSyncUserId) obj;
        return this.IconCompatParcelizer.equals(getcontentcardsyncuserid.IconCompatParcelizer) && this.serializer == getcontentcardsyncuserid.serializer && this.RemoteActionCompatParcelizer == getcontentcardsyncuserid.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Module(name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", base=");
        sb.append(this.serializer);
        sb.append(", size=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.RemoteActionCompatParcelizer, ')');
    }
}
