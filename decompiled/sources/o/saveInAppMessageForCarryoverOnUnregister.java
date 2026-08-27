package o;

/* JADX INFO: loaded from: classes4.dex */
public final class saveInAppMessageForCarryoverOnUnregister extends resolveUnregisterDisplayedMessagelambda0 {
    public final Throwable serializer;

    public saveInAppMessageForCarryoverOnUnregister(Throwable th) {
        this.serializer = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof saveInAppMessageForCarryoverOnUnregister)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((saveInAppMessageForCarryoverOnUnregister) obj).serializer}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Throwable th = this.serializer;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // o.resolveUnregisterDisplayedMessagelambda0
    public final String toString() {
        return "Closed(" + this.serializer + ')';
    }
}
