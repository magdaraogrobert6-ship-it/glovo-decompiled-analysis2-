package o;

/* JADX INFO: loaded from: classes2.dex */
public final class setStrokeAlpha {
    public final boolean serializer;
    public final long write;

    public final int hashCode() {
        return Boolean.hashCode(this.serializer) + (Long.hashCode(this.write) * 31);
    }

    public setStrokeAlpha(long j, boolean z) {
        this.write = j;
        this.serializer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setStrokeAlpha)) {
            return false;
        }
        setStrokeAlpha setstrokealpha = (setStrokeAlpha) obj;
        return this.write == setstrokealpha.write && this.serializer == setstrokealpha.serializer;
    }

    public final String toString() {
        return "TelemetryExecutionResult(telemetryDelay=" + this.write + ", isSuccess=" + this.serializer + ")";
    }
}
