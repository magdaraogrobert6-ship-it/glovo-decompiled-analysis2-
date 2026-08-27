package com.mapbox.maps.extension.observable.eventdata;

import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.RenderMode;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class RenderFrameFinishedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    private final Long end;

    @SerializedName("needs-repaint")
    private final boolean needsRepaint;

    @SerializedName("placement-changed")
    private final boolean placementChanged;

    @SerializedName("render-mode")
    private final RenderMode renderMode;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin);
        Long l = this.end;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        int iHashCode3 = this.renderMode.hashCode();
        boolean z = this.needsRepaint;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        boolean z2 = this.placementChanged;
        return ((((iHashCode3 + (((iHashCode * 31) + iHashCode2) * 31)) * 31) + r3) * 31) + (z2 ? 1 : z2);
    }

    public RenderFrameFinishedEventData(long j, Long l, RenderMode renderMode, boolean z, boolean z2) {
        renderMode.getClass();
        this.begin = j;
        this.end = l;
        this.renderMode = renderMode;
        this.needsRepaint = z;
        this.placementChanged = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderFrameFinishedEventData)) {
            return false;
        }
        RenderFrameFinishedEventData renderFrameFinishedEventData = (RenderFrameFinishedEventData) obj;
        if (this.begin != renderFrameFinishedEventData.begin) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.end, renderFrameFinishedEventData.end}, getCieXyz.write())).booleanValue() && this.renderMode == renderFrameFinishedEventData.renderMode && this.needsRepaint == renderFrameFinishedEventData.needsRepaint && this.placementChanged == renderFrameFinishedEventData.placementChanged;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RenderFrameFinishedEventData(begin=");
        sb.append(this.begin);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", renderMode=");
        sb.append(this.renderMode);
        sb.append(", needsRepaint=");
        sb.append(this.needsRepaint);
        sb.append(", placementChanged=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.placementChanged, ')');
    }
}
