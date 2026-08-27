package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class setActionHintText extends IContentCardsUpdateHandler {
    public final safeSetClipToOutline RemoteActionCompatParcelizer;

    @Override // o.IContentCardsUpdateHandler
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.RemoteActionCompatParcelizer.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.RemoteActionCompatParcelizer.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        safeSetClipToOutline safesetcliptooutline = this.RemoteActionCompatParcelizer;
        safesetcliptooutline.getClass();
        return new CaptionedImageContentCardViewViewHolder(safesetcliptooutline, 1);
    }

    public setActionHintText(safeSetClipToOutline safesetcliptooutline) {
        this.RemoteActionCompatParcelizer = safesetcliptooutline;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.RemoteActionCompatParcelizer.read();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.RemoteActionCompatParcelizer.read();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        safeSetClipToOutline safesetcliptooutline = this.RemoteActionCompatParcelizer;
        safesetcliptooutline.getClass();
        int i = safesetcliptooutline.read(entry.getKey());
        if (i < 0) {
            return false;
        }
        Object[] objArr = safesetcliptooutline.ParcelableVolumeInfo;
        objArr.getClass();
        Object[] objArr2 = {objArr[i], entry.getValue()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        safeSetClipToOutline safesetcliptooutline = this.RemoteActionCompatParcelizer;
        safesetcliptooutline.getClass();
        safesetcliptooutline.read();
        int i = safesetcliptooutline.read(entry.getKey());
        if (i >= 0) {
            Object[] objArr = safesetcliptooutline.ParcelableVolumeInfo;
            objArr.getClass();
            Object[] objArr2 = {objArr[i], entry.getValue()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                safesetcliptooutline.IconCompatParcelizer(i);
                return true;
            }
        }
        return false;
    }
}
