package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class r8 {
    public final s8 a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public r8(s8 s8Var) {
        s8Var.getClass();
        this.a = s8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((r8) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.a + ")";
    }
}
