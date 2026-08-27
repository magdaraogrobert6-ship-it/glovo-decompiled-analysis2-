package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public final class RenderFrameFinished implements Serializable {
    private final boolean needsRepaint;
    private final boolean placementChanged;
    private final RenderModeType renderMode;
    private final EventTimeInterval timeInterval;

    public boolean getNeedsRepaint() {
        return this.needsRepaint;
    }

    public boolean getPlacementChanged() {
        return this.placementChanged;
    }

    public RenderModeType getRenderMode() {
        return this.renderMode;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        RenderModeType renderModeType = this.renderMode;
        boolean z = this.needsRepaint;
        boolean z2 = this.placementChanged;
        return Objects.hash(renderModeType, Boolean.valueOf(z), Boolean.valueOf(z2), this.timeInterval);
    }

    public RenderFrameFinished(RenderModeType renderModeType, boolean z, boolean z2, EventTimeInterval eventTimeInterval) {
        this.renderMode = renderModeType;
        this.needsRepaint = z;
        this.placementChanged = z2;
        this.timeInterval = eventTimeInterval;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[renderMode: ");
        sb.append(RecordUtils.fieldToString(this.renderMode));
        sb.append(", needsRepaint: ");
        MediaSessionCompatQueueItem.write(sb, this.needsRepaint, ", placementChanged: ");
        MediaSessionCompatQueueItem.write(sb, this.placementChanged, ", timeInterval: ");
        sb.append(RecordUtils.fieldToString(this.timeInterval));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RenderFrameFinished.class != obj.getClass()) {
            return false;
        }
        RenderFrameFinished renderFrameFinished = (RenderFrameFinished) obj;
        return Objects.equals(this.renderMode, renderFrameFinished.renderMode) && this.needsRepaint == renderFrameFinished.needsRepaint && this.placementChanged == renderFrameFinished.placementChanged && Objects.equals(this.timeInterval, renderFrameFinished.timeInterval);
    }
}
