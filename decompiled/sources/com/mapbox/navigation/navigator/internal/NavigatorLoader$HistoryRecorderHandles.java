package com.mapbox.navigation.navigator.internal;

import com.mapbox.navigator.HistoryRecorderHandle;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigatorLoader$HistoryRecorderHandles {
    public final HistoryRecorderHandle composite;
    public final HistoryRecorderHandle copilot;
    public final HistoryRecorderHandle general;

    public final int hashCode() {
        HistoryRecorderHandle historyRecorderHandle = this.general;
        int iHashCode = historyRecorderHandle == null ? 0 : historyRecorderHandle.hashCode();
        HistoryRecorderHandle historyRecorderHandle2 = this.copilot;
        int iHashCode2 = historyRecorderHandle2 == null ? 0 : historyRecorderHandle2.hashCode();
        HistoryRecorderHandle historyRecorderHandle3 = this.composite;
        return (((iHashCode * 31) + iHashCode2) * 31) + (historyRecorderHandle3 != null ? historyRecorderHandle3.hashCode() : 0);
    }

    public NavigatorLoader$HistoryRecorderHandles(HistoryRecorderHandle historyRecorderHandle, HistoryRecorderHandle historyRecorderHandle2, HistoryRecorderHandle historyRecorderHandle3) {
        this.general = historyRecorderHandle;
        this.copilot = historyRecorderHandle2;
        this.composite = historyRecorderHandle3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigatorLoader$HistoryRecorderHandles)) {
            return false;
        }
        NavigatorLoader$HistoryRecorderHandles navigatorLoader$HistoryRecorderHandles = (NavigatorLoader$HistoryRecorderHandles) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.general, navigatorLoader$HistoryRecorderHandles.general}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.copilot, navigatorLoader$HistoryRecorderHandles.copilot}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.composite, navigatorLoader$HistoryRecorderHandles.composite}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "HistoryRecorderHandles(general=" + this.general + ", copilot=" + this.copilot + ", composite=" + this.composite + ')';
    }
}
