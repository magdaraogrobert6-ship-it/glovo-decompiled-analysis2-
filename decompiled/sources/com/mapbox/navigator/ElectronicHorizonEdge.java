package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class ElectronicHorizonEdge implements Serializable {
    private final long id;
    private final boolean isOnRoute;
    private final byte level;
    private final List<ElectronicHorizonEdge> out;
    private final double probability;

    public long getId() {
        return this.id;
    }

    public boolean getIsOnRoute() {
        return this.isOnRoute;
    }

    public byte getLevel() {
        return this.level;
    }

    public List<ElectronicHorizonEdge> getOut() {
        return this.out;
    }

    public double getProbability() {
        return this.probability;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ElectronicHorizonEdge(long j, byte b, double d, boolean z, List<ElectronicHorizonEdge> list) {
        this.id = j;
        this.level = b;
        this.probability = d;
        this.isOnRoute = z;
        this.out = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        af$$ExternalSyntheticOutline1.m(this.id, ", level: ", sb);
        MediaSessionCompatQueueItem.serializer(this.level, sb, ", probability: ");
        m1$$ExternalSyntheticOutline0.m(this.probability, ", isOnRoute: ", sb);
        MediaSessionCompatQueueItem.write(sb, this.isOnRoute, ", out: ");
        return MediaSessionCompatQueueItem.read(this.out, sb, "]");
    }

    public int hashCode() {
        long j = this.id;
        byte b = this.level;
        double d = this.probability;
        boolean z = this.isOnRoute;
        return Objects.hash(Long.valueOf(j), Byte.valueOf(b), Double.valueOf(d), Boolean.valueOf(z), this.out);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElectronicHorizonEdge electronicHorizonEdge = (ElectronicHorizonEdge) obj;
        return this.id == electronicHorizonEdge.id && this.level == electronicHorizonEdge.level && PartialEq.compare(this.probability, electronicHorizonEdge.probability) && this.isOnRoute == electronicHorizonEdge.isOnRoute && Objects.equals(this.out, electronicHorizonEdge.out);
    }
}
