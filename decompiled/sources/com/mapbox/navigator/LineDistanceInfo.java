package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public class LineDistanceInfo implements Serializable {
    private final double distanceToEnd;
    private final double distanceToEntry;
    private final double distanceToExit;
    private final boolean entryFromStart;
    private final double length;

    public double getDistanceToEnd() {
        return this.distanceToEnd;
    }

    public double getDistanceToEntry() {
        return this.distanceToEntry;
    }

    public double getDistanceToExit() {
        return this.distanceToExit;
    }

    public boolean getEntryFromStart() {
        return this.entryFromStart;
    }

    public double getLength() {
        return this.length;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LineDistanceInfo(double d, double d2, double d3, boolean z, double d4) {
        this.distanceToEntry = d;
        this.distanceToExit = d2;
        this.distanceToEnd = d3;
        this.entryFromStart = z;
        this.length = d4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[distanceToEntry: ");
        m1$$ExternalSyntheticOutline0.m(this.distanceToEntry, ", distanceToExit: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.distanceToExit, ", distanceToEnd: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.distanceToEnd, ", entryFromStart: ", sb);
        MediaSessionCompatQueueItem.write(sb, this.entryFromStart, ", length: ");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.length, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.distanceToEntry), Double.valueOf(this.distanceToExit), Double.valueOf(this.distanceToEnd), Boolean.valueOf(this.entryFromStart), Double.valueOf(this.length));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineDistanceInfo lineDistanceInfo = (LineDistanceInfo) obj;
        return PartialEq.compare(this.distanceToEntry, lineDistanceInfo.distanceToEntry) && PartialEq.compare(this.distanceToExit, lineDistanceInfo.distanceToExit) && PartialEq.compare(this.distanceToEnd, lineDistanceInfo.distanceToEnd) && this.entryFromStart == lineDistanceInfo.entryFromStart && PartialEq.compare(this.length, lineDistanceInfo.length);
    }
}
