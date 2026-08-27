package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class isClickHandled implements Map.Entry, displayInAppMessagelambda122 {
    public final int IconCompatParcelizer;
    public final int serializer;
    public final safeSetClipToOutline write;

    public final void read() {
        if (this.write.MediaDescriptionCompat != this.serializer) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    public isClickHandled(safeSetClipToOutline safesetcliptooutline, int i) {
        safesetcliptooutline.getClass();
        this.write = safesetcliptooutline;
        this.IconCompatParcelizer = i;
        this.serializer = safesetcliptooutline.MediaDescriptionCompat;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        read();
        return this.write.MediaBrowserCompatMediaItem[this.IconCompatParcelizer];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        read();
        Object[] objArr = this.write.ParcelableVolumeInfo;
        objArr.getClass();
        return objArr[this.IconCompatParcelizer];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        read();
        safeSetClipToOutline safesetcliptooutline = this.write;
        safesetcliptooutline.read();
        Object[] objArr = safesetcliptooutline.ParcelableVolumeInfo;
        if (objArr == null) {
            int length = safesetcliptooutline.MediaBrowserCompatMediaItem.length;
            if (length < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            safesetcliptooutline.ParcelableVolumeInfo = objArr;
        }
        int i = this.IconCompatParcelizer;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{entry.getKey(), getKey()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{entry.getValue(), getValue()}, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }
}
