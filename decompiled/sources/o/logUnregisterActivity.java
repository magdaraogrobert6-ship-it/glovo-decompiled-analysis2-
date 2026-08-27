package o;

/* JADX INFO: loaded from: classes4.dex */
public final class logUnregisterActivity {
    public static final resolveUnregisterDisplayedMessagelambda0 read = new resolveUnregisterDisplayedMessagelambda0();
    public final Object RemoteActionCompatParcelizer;

    public static final Object RemoteActionCompatParcelizer(Object obj) {
        if (obj instanceof resolveUnregisterDisplayedMessagelambda0) {
            return null;
        }
        return obj;
    }

    public final String toString() {
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj instanceof saveInAppMessageForCarryoverOnUnregister) {
            return ((saveInAppMessageForCarryoverOnUnregister) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public /* synthetic */ logUnregisterActivity(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }

    public static final Throwable write(Object obj) {
        saveInAppMessageForCarryoverOnUnregister saveinappmessageforcarryoveronunregister = obj instanceof saveInAppMessageForCarryoverOnUnregister ? (saveInAppMessageForCarryoverOnUnregister) obj : null;
        if (saveinappmessageforcarryoveronunregister != null) {
            return saveinappmessageforcarryoveronunregister.serializer;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof logUnregisterActivity)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((logUnregisterActivity) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
