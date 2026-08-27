package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;

/* JADX INFO: loaded from: classes3.dex */
public final class cleandefault {
    private long read;
    private final long serializer;
    private final ClassifiedTransportMode write;

    public final long RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.read = j;
    }

    public final long serializer() {
        return this.read;
    }

    public final ClassifiedTransportMode write() {
        return this.write;
    }

    public final int hashCode() {
        return this.write.hashCode() + d$$ExternalSyntheticOutline0.m(Long.hashCode(this.serializer) * 31, 31, this.read);
    }

    public cleandefault(long j, long j2, ClassifiedTransportMode classifiedTransportMode) {
        classifiedTransportMode.getClass();
        this.serializer = j;
        this.read = j2;
        this.write = classifiedTransportMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cleandefault)) {
            return false;
        }
        cleandefault cleandefaultVar = (cleandefault) obj;
        return this.serializer == cleandefaultVar.serializer && this.read == cleandefaultVar.read && this.write == cleandefaultVar.write;
    }

    public final String toString() {
        return "MergedPostProcessedTransportClassification(startTime=" + this.serializer + ", endTime=" + this.read + ", transportMode=" + this.write + ')';
    }
}
