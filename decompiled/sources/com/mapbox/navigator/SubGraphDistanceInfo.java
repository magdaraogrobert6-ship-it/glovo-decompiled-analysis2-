package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class SubGraphDistanceInfo implements Serializable {
    private final List<Gate> entrances;
    private final List<Gate> exits;
    private final boolean inside;

    public List<Gate> getEntrances() {
        return this.entrances;
    }

    public List<Gate> getExits() {
        return this.exits;
    }

    public boolean getInside() {
        return this.inside;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public SubGraphDistanceInfo(boolean z, List<Gate> list, List<Gate> list2) {
        this.inside = z;
        this.entrances = list;
        this.exits = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[inside: ");
        MediaSessionCompatQueueItem.write(sb, this.inside, ", entrances: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.entrances, ", exits: ");
        return MediaSessionCompatQueueItem.read(this.exits, sb, "]");
    }

    public int hashCode() {
        boolean z = this.inside;
        return Objects.hash(Boolean.valueOf(z), this.entrances, this.exits);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubGraphDistanceInfo subGraphDistanceInfo = (SubGraphDistanceInfo) obj;
        return this.inside == subGraphDistanceInfo.inside && Objects.equals(this.entrances, subGraphDistanceInfo.entrances) && Objects.equals(this.exits, subGraphDistanceInfo.exits);
    }
}
