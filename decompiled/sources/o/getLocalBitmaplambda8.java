package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalBitmaplambda8 implements Map.Entry {
    public final Object IconCompatParcelizer;
    public getLocalBitmaplambda8 MediaBrowserCompatMediaItem;
    public getLocalBitmaplambda8 MediaDescriptionCompat;
    public getLocalBitmaplambda8 MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public getLocalBitmaplambda8 RemoteActionCompatParcelizer;
    public getLocalBitmaplambda8 read;
    public final int serializer;
    public int write;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.IconCompatParcelizer;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.MediaSessionCompatQueueItem;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.MediaSessionCompatQueueItem;
        this.MediaSessionCompatQueueItem = obj;
        return obj2;
    }

    public final String toString() {
        return this.IconCompatParcelizer + ContainerUtils.KEY_VALUE_DELIMITER + this.MediaSessionCompatQueueItem;
    }

    public getLocalBitmaplambda8(getLocalBitmaplambda8 getlocalbitmaplambda8, Object obj, int i, getLocalBitmaplambda8 getlocalbitmaplambda9, getLocalBitmaplambda8 getlocalbitmaplambda10) {
        this.MediaMetadataCompat = getlocalbitmaplambda8;
        this.IconCompatParcelizer = obj;
        this.serializer = i;
        this.write = 1;
        this.RemoteActionCompatParcelizer = getlocalbitmaplambda9;
        this.MediaDescriptionCompat = getlocalbitmaplambda10;
        getlocalbitmaplambda10.RemoteActionCompatParcelizer = this;
        getlocalbitmaplambda9.MediaDescriptionCompat = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.IconCompatParcelizer;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.MediaSessionCompatQueueItem;
        if (obj3 == null) {
            return entry.getValue() == null;
        }
        return obj3.equals(entry.getValue());
    }

    public getLocalBitmaplambda8() {
        this.IconCompatParcelizer = null;
        this.serializer = -1;
        this.MediaDescriptionCompat = this;
        this.RemoteActionCompatParcelizer = this;
    }
}
