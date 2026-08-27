package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getHasPendingOnPositionedCallbacks extends setDuringAlignmentLinesQueryui {
    public final String IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final int serializer;
    public final String write;

    public getHasPendingOnPositionedCallbacks(long j, String str, String str2, long j2, int i) {
        this.read = j;
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = j2;
        this.serializer = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setDuringAlignmentLinesQueryui)) {
            return false;
        }
        getHasPendingOnPositionedCallbacks gethaspendingonpositionedcallbacks = (getHasPendingOnPositionedCallbacks) ((setDuringAlignmentLinesQueryui) obj);
        if (this.read != gethaspendingonpositionedcallbacks.read || !this.write.equals(gethaspendingonpositionedcallbacks.write)) {
            return false;
        }
        String str = gethaspendingonpositionedcallbacks.IconCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.RemoteActionCompatParcelizer == gethaspendingonpositionedcallbacks.RemoteActionCompatParcelizer && this.serializer == gethaspendingonpositionedcallbacks.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.read);
        sb.append(", symbol=");
        sb.append(this.write);
        sb.append(", file=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", offset=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", importance=");
        return af$$ExternalSyntheticOutline0.m(this.serializer, "}", sb);
    }

    public final int hashCode() {
        long j = this.read;
        int i = (int) (j ^ (j >>> 32));
        int iHashCode = this.write.hashCode();
        String str = this.IconCompatParcelizer;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.RemoteActionCompatParcelizer;
        return ((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.serializer;
    }
}
