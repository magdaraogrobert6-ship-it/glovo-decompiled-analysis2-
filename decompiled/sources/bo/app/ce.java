package bo.app;

import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ce {
    public boolean a;
    public Long b;
    public String c;
    public long d;
    public long e;
    public long f;

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a);
        Long l = this.b;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str = this.c;
        return Long.hashCode(this.f) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        boolean z = this.a;
        Long l = this.b;
        String str = this.c;
        long j = this.d;
        long j2 = this.e;
        long j3 = this.f;
        StringBuilder sb = new StringBuilder("Config(isEnabled=");
        sb.append(z);
        sb.append(", sdkDebuggerExpirationTime=");
        sb.append(l);
        sb.append(", sdkDebuggerAuthCode=");
        sb.append(str);
        sb.append(", sdkDebuggerFlushIntervalBytes=");
        sb.append(j);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, ", sdkDebuggerFlushIntervalSeconds=", j2, ", sdkDebuggerMaxPayloadBytes=");
        return c8$$ExternalSyntheticOutline0.m(j3, ")", sb);
    }

    public ce(boolean z, Long l, String str, long j, long j2, long j3) {
        this.a = z;
        this.b = l;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce)) {
            return false;
        }
        ce ceVar = (ce) obj;
        if (this.a != ceVar.a) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, ceVar.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, ceVar.c}, getCieXyz.write())).booleanValue() && this.d == ceVar.d && this.e == ceVar.e && this.f == ceVar.f;
    }

    public /* synthetic */ ce() {
        this(false, null, null, 0L, 0L, 0L);
    }
}
