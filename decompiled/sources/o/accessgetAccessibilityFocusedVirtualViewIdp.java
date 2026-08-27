package o;

import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetAccessibilityFocusedVirtualViewIdp {
    public final MutexImpl IconCompatParcelizer;
    public getDetachedFromParentLookaheadPlacement write = null;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        getDetachedFromParentLookaheadPlacement getdetachedfromparentlookaheadplacement = this.write;
        return (iHashCode * 31) + (getdetachedfromparentlookaheadplacement == null ? 0 : getdetachedfromparentlookaheadplacement.hashCode());
    }

    public accessgetAccessibilityFocusedVirtualViewIdp(MutexImpl mutexImpl) {
        this.IconCompatParcelizer = mutexImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof accessgetAccessibilityFocusedVirtualViewIdp) {
            accessgetAccessibilityFocusedVirtualViewIdp accessgetaccessibilityfocusedvirtualviewidp = (accessgetAccessibilityFocusedVirtualViewIdp) obj;
            if (this.IconCompatParcelizer != accessgetaccessibilityfocusedvirtualviewidp.IconCompatParcelizer) {
                return false;
            }
            Object[] objArr = {this.write, accessgetaccessibilityfocusedvirtualviewidp.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.IconCompatParcelizer + ", subscriber=" + this.write + ')';
    }
}
