package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetF4cp {
    public final accessgetF7cp serializer;
    public final long write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        long j = this.write;
        return ((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetF4cp)) {
            return false;
        }
        accessgetF4cp accessgetf4cp = (accessgetF4cp) obj;
        return this.serializer.equals(accessgetf4cp.serializer) && this.write == accessgetf4cp.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.serializer);
        sb.append(", nextRequestWaitMillis=");
        return c8$$ExternalSyntheticOutline0.m(this.write, "}", sb);
    }

    public accessgetF4cp(accessgetF7cp accessgetf7cp, long j) {
        if (accessgetf7cp == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null status");
            throw null;
        }
        this.serializer = accessgetf7cp;
        this.write = j;
    }
}
