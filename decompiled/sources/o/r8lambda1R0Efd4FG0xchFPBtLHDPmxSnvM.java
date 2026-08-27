package o;

import com.sentiance.core.model.datasync.Payload;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM {
    private final long IconCompatParcelizer;
    private final boolean read;
    private final Payload write;

    public final long IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Payload read() {
        return this.write;
    }

    public final long serializer() {
        return this.IconCompatParcelizer;
    }

    public final boolean write() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        int iHashCode = Long.hashCode(this.IconCompatParcelizer);
        Payload payload = this.write;
        int iHashCode2 = payload == null ? 0 : payload.hashCode();
        boolean z = this.read;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + r2;
    }

    public r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM(long j, Payload payload, boolean z) {
        this.IconCompatParcelizer = j;
        this.write = payload;
        this.read = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM)) {
            return false;
        }
        r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM r8lambda1r0efd4fg0xchfpbtlhdpmxsnvm = (r8lambda1R0Efd4FG0xchFPBtLHDPmxSnvM) obj;
        if (this.IconCompatParcelizer != r8lambda1r0efd4fg0xchfpbtlhdpmxsnvm.IconCompatParcelizer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambda1r0efd4fg0xchfpbtlhdpmxsnvm.write}, getCieXyz.write())).booleanValue() && this.read == r8lambda1r0efd4fg0xchfpbtlhdpmxsnvm.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackProcessingResult(feedbackTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", payload=");
        sb.append(this.write);
        sb.append(", isProcessed=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.read, ')');
    }
}
