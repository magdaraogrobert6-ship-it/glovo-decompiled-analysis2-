package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CaptionedImageContentCardView extends IContentCardsUpdateHandler implements Serializable {
    public static final CaptionedImageContentCardView serializer = new CaptionedImageContentCardView(safeSetClipToOutline.RemoteActionCompatParcelizer);
    public final safeSetClipToOutline read;

    public CaptionedImageContentCardView() {
        this.read = new safeSetClipToOutline();
    }

    @Override // o.IContentCardsUpdateHandler
    public final int RemoteActionCompatParcelizer() {
        return this.read.PlaybackStateCompatCustomAction;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.read.serializer(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.read.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.read.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.read.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        safeSetClipToOutline safesetcliptooutline = this.read;
        safesetcliptooutline.getClass();
        return new CaptionedImageContentCardViewViewHolder(safesetcliptooutline, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        safeSetClipToOutline safesetcliptooutline = this.read;
        safesetcliptooutline.read();
        int i = safesetcliptooutline.read(obj);
        if (i < 0) {
            return false;
        }
        safesetcliptooutline.IconCompatParcelizer(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.read.read();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.read.read();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.read.read();
        return super.retainAll(collection);
    }

    public CaptionedImageContentCardView(safeSetClipToOutline safesetcliptooutline) {
        safesetcliptooutline.getClass();
        this.read = safesetcliptooutline;
    }

    public CaptionedImageContentCardView(int i) {
        this.read = new safeSetClipToOutline(i);
    }
}
