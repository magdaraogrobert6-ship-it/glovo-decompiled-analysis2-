package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps {
    private final Float RemoteActionCompatParcelizer;
    private final Float read;
    private final long serializer;
    private final long write;

    public final Float IconCompatParcelizer() {
        return this.read;
    }

    public final Float RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long serializer() {
        return this.write;
    }

    public final long write() {
        return this.serializer;
    }

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(Long.hashCode(this.write) * 31, 31, this.serializer);
        Float f = this.RemoteActionCompatParcelizer;
        int iHashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.read;
        return ((iM + iHashCode) * 31) + (f2 != null ? f2.hashCode() : 0);
    }

    public r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps(long j, long j2, Float f, Float f2) {
        this.write = j;
        this.serializer = j2;
        this.RemoteActionCompatParcelizer = f;
        this.read = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps)) {
            return false;
        }
        r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps r8lambdaf43wjdaanol1ga_eezyhy_7dops = (r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps) obj;
        if (this.write != r8lambdaf43wjdaanol1ga_eezyhy_7dops.write || this.serializer != r8lambdaf43wjdaanol1ga_eezyhy_7dops.serializer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdaf43wjdaanol1ga_eezyhy_7dops.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdaf43wjdaanol1ga_eezyhy_7dops.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "CallEntryWithSpeed(start=" + this.write + ", end=" + this.serializer + ", minSpeedMps=" + this.RemoteActionCompatParcelizer + ", maxSpeedMps=" + this.read + ')';
    }
}
