package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class LaneAccessability implements Serializable {
    private final List<String> designated;

    public List<String> getDesignated() {
        return this.designated;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.designated);
    }

    public LaneAccessability(List<String> list) {
        this.designated = list;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.read(this.designated, new StringBuilder("[designated: "), "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.designated, ((LaneAccessability) obj).designated);
    }
}
