package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class IcInfo implements Serializable {
    private final String id;
    private final List<LocalizedString> name;

    public String getId() {
        return this.id;
    }

    public List<LocalizedString> getName() {
        return this.name;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    public IcInfo(String str, List<LocalizedString> list) {
        this.id = str;
        this.name = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", name: ");
        return MediaSessionCompatQueueItem.read(this.name, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcInfo icInfo = (IcInfo) obj;
        return Objects.equals(this.id, icInfo.id) && Objects.equals(this.name, icInfo.name);
    }
}
