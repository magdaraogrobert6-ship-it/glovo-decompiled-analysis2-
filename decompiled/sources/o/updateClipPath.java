package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class updateClipPath {
    public final BrazeContentCardsManager IconCompatParcelizer;
    public final LinkedHashMap RemoteActionCompatParcelizer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU write;

    public updateClipPath() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BrazeContentCardsManager brazeContentCardsManager = new BrazeContentCardsManager();
        this.RemoteActionCompatParcelizer = linkedHashMap;
        this.IconCompatParcelizer = brazeContentCardsManager;
        this.write = null;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.write;
        return ((iHashCode2 + (iHashCode * 31)) * 31) + (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu == null ? 0 : r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updateClipPath)) {
            return false;
        }
        updateClipPath updateclippath = (updateClipPath) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, updateclippath.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, updateclippath.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, updateclippath.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ScreenMemoryState(lifecycleMetrics=" + this.RemoteActionCompatParcelizer + ", resumeSnapshots=" + this.IconCompatParcelizer + ", trackingJob=" + this.write + ")";
    }
}
