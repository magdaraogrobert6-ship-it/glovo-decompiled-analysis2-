package o;

/* JADX INFO: loaded from: classes.dex */
public final class addObserverForBackInvokerlambda0 extends computeHorizontalBoundsdefault {
    public final androidx.activity.OnBackPressedCallback read;
    public final accessisRenderNodeCompatiblecp serializer;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = this.serializer;
        return (iHashCode * 31) + (accessisrendernodecompatiblecp == null ? 0 : accessisrendernodecompatiblecp.hashCode());
    }

    public addObserverForBackInvokerlambda0(androidx.activity.OnBackPressedCallback onBackPressedCallback, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        onBackPressedCallback.getClass();
        this.read = onBackPressedCallback;
        this.serializer = accessisrendernodecompatiblecp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addObserverForBackInvokerlambda0)) {
            return false;
        }
        addObserverForBackInvokerlambda0 addobserverforbackinvokerlambda0 = (addObserverForBackInvokerlambda0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, addobserverforbackinvokerlambda0.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, addobserverforbackinvokerlambda0.serializer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.read + ", owner=" + this.serializer + ')';
    }
}
