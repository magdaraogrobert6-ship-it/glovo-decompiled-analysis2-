package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.sentiance.sdk.memory.MemoryDecisionReason;

/* JADX INFO: loaded from: classes5.dex */
public final class setSubtitleGravity {
    private final boolean RemoteActionCompatParcelizer;
    private final long read;
    private final MemoryDecisionReason serializer;
    private final long write;

    public final MemoryDecisionReason IconCompatParcelizer() {
        return this.serializer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long read() {
        return this.write;
    }

    public final long serializer() {
        return this.read;
    }

    public setSubtitleGravity(boolean z, MemoryDecisionReason memoryDecisionReason, long j, long j2) {
        memoryDecisionReason.getClass();
        this.RemoteActionCompatParcelizer = z;
        this.serializer = memoryDecisionReason;
        this.read = j;
        this.write = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSubtitleGravity)) {
            return false;
        }
        setSubtitleGravity setsubtitlegravity = (setSubtitleGravity) obj;
        return this.RemoteActionCompatParcelizer == setsubtitlegravity.RemoteActionCompatParcelizer && this.serializer == setsubtitlegravity.serializer && this.read == setsubtitlegravity.read && this.write == setsubtitlegravity.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemoryDecision(canProceed=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", reason=");
        sb.append(this.serializer);
        sb.append(", availableBytes=");
        sb.append(this.read);
        sb.append(", requestedBytes=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.write, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.RemoteActionCompatParcelizer;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Long.hashCode(this.write) + d$$ExternalSyntheticOutline0.m((this.serializer.hashCode() + (r0 * 31)) * 31, 31, this.read);
    }
}
