package androidx.compose.ui.input.pointer.util;

import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
public final class DataPointAtTime {
    public static final int $stable = 8;
    private float dataPoint;
    private long time;

    public final long component1() {
        return this.time;
    }

    public final float component2() {
        return this.dataPoint;
    }

    public final float getDataPoint() {
        return this.dataPoint;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setDataPoint(float f) {
        this.dataPoint = f;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final DataPointAtTime copy(long j, float f) {
        return new DataPointAtTime(j, f);
    }

    public int hashCode() {
        return Float.hashCode(this.dataPoint) + (Long.hashCode(this.time) * 31);
    }

    public DataPointAtTime(long j, float f) {
        this.time = j;
        this.dataPoint = f;
    }

    public static /* synthetic */ DataPointAtTime copy$default(DataPointAtTime dataPointAtTime, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dataPointAtTime.time;
        }
        if ((i & 2) != 0) {
            f = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.copy(j, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.time);
        sb.append(", dataPoint=");
        return MediaSessionCompatQueueItem.serializer(sb, this.dataPoint, ')');
    }
}
