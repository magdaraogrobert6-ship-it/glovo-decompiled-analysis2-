package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class onMoved extends IContentCardsUpdateHandler {
    public final /* synthetic */ int IconCompatParcelizer;
    public final onEntered RemoteActionCompatParcelizer;

    public /* synthetic */ onMoved(int i, onEntered onentered) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = onentered;
    }

    @Override // o.IContentCardsUpdateHandler
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer != 0 ? this.RemoteActionCompatParcelizer.read() : this.RemoteActionCompatParcelizer.read();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.IconCompatParcelizer == 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.IconCompatParcelizer != 0) {
            this.RemoteActionCompatParcelizer.clear();
        } else {
            this.RemoteActionCompatParcelizer.clear();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.IconCompatParcelizer == 0) {
            return this.RemoteActionCompatParcelizer.containsKey(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            onEntered onentered = this.RemoteActionCompatParcelizer;
            Object obj2 = onentered.get(key);
            if (obj2 != null) {
                return obj2.equals(entry.getValue());
            }
            if (entry.getValue() == null && onentered.containsKey(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (this.IconCompatParcelizer == 0) {
            onEntered onentered = this.RemoteActionCompatParcelizer;
            if (!onentered.containsKey(obj)) {
                return false;
            }
            onentered.remove(obj);
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.RemoteActionCompatParcelizer.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.IconCompatParcelizer != 0) {
            return new ContentCardsDividerItemDecoration(this.RemoteActionCompatParcelizer);
        }
        startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr = new startDragAndDropTransferd4ec7I[8];
        for (int i = 0; i < 8; i++) {
            startdraganddroptransferd4ec7iArr[i] = new DragAndDropNodeCompanion(0);
        }
        return new onEnded(this.RemoteActionCompatParcelizer, startdraganddroptransferd4ec7iArr);
    }
}
