package o;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentCardViewHolder extends newArray {
    public final safeSetClipToOutline IconCompatParcelizer;

    @Override // o.newArray
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.PlaybackStateCompatCustomAction;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.IconCompatParcelizer.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.IconCompatParcelizer.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        safeSetClipToOutline safesetcliptooutline = this.IconCompatParcelizer;
        safesetcliptooutline.getClass();
        return new CaptionedImageContentCardViewViewHolder(safesetcliptooutline, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        safeSetClipToOutline safesetcliptooutline = this.IconCompatParcelizer;
        safesetcliptooutline.read();
        int iIconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer(obj);
        if (iIconCompatParcelizer < 0) {
            return false;
        }
        safesetcliptooutline.IconCompatParcelizer(iIconCompatParcelizer);
        return true;
    }

    public ContentCardViewHolder(safeSetClipToOutline safesetcliptooutline) {
        this.IconCompatParcelizer = safesetcliptooutline;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.IconCompatParcelizer.read();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.IconCompatParcelizer.read();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }
}
