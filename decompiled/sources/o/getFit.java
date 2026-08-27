package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getFit extends getFillHeight {
    public final transient ContentScaleKt RemoteActionCompatParcelizer;
    public final transient Object[] serializer;
    public final transient int write = 1;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.write;
    }

    public getFit(ContentScaleKt contentScaleKt, Object[] objArr) {
        this.RemoteActionCompatParcelizer = contentScaleKt;
        this.serializer = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.RemoteActionCompatParcelizer.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        getCrop contentScaleCompanionFillBounds1 = this.read;
        if (contentScaleCompanionFillBounds1 == null) {
            contentScaleCompanionFillBounds1 = new ContentScaleCompanionFillBounds1(this);
            this.read = contentScaleCompanionFillBounds1;
        }
        return contentScaleCompanionFillBounds1.listIterator(0);
    }

    @Override // o.getCropannotations
    public final int write(Object[] objArr) {
        getCrop contentScaleCompanionFillBounds1 = this.read;
        if (contentScaleCompanionFillBounds1 == null) {
            contentScaleCompanionFillBounds1 = new ContentScaleCompanionFillBounds1(this);
            this.read = contentScaleCompanionFillBounds1;
        }
        return contentScaleCompanionFillBounds1.write(objArr);
    }
}
