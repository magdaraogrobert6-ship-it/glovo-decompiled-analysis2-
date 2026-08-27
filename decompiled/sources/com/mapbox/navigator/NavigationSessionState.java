package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationSessionState implements Serializable {
    private final List<Byte> serialized;

    public List<Byte> getSerialized() {
        return this.serialized;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.serialized);
    }

    public NavigationSessionState(List<Byte> list) {
        this.serialized = list;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.read(this.serialized, new StringBuilder("[serialized: "), "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.serialized, ((NavigationSessionState) obj).serialized);
    }
}
