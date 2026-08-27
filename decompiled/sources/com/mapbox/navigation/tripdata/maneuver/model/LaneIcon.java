package com.mapbox.navigation.tripdata.maneuver.model;

import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes2.dex */
public final class LaneIcon {
    public final int drawableResId;
    public final boolean shouldFlip;

    public LaneIcon(int i, boolean z) {
        this.drawableResId = i;
        this.shouldFlip = z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.shouldFlip) + (this.drawableResId * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaneIcon(drawableResId=");
        sb.append(this.drawableResId);
        sb.append(", shouldFlip=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.shouldFlip, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LaneIcon.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LaneIcon laneIcon = (LaneIcon) obj;
        return this.drawableResId == laneIcon.drawableResId && this.shouldFlip == laneIcon.shouldFlip;
    }
}
