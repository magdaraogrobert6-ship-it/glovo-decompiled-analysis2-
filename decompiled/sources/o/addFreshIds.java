package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class addFreshIds extends getSuppressMovementConsumption {
    public final transient Object[] IconCompatParcelizer;
    public final transient ContentScaleKt RemoteActionCompatParcelizer;
    public final transient int read = 1;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.read;
    }

    public addFreshIds(ContentScaleKt contentScaleKt, Object[] objArr) {
        this.RemoteActionCompatParcelizer = contentScaleKt;
        this.IconCompatParcelizer = objArr;
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

    @Override // o.HoverIconModifierNodefindOverridingAncestorNode1
    public final int IconCompatParcelizer(int i, Object[] objArr) {
        getMotionEvent getpointerinputevent = this.serializer;
        if (getpointerinputevent == null) {
            getpointerinputevent = new getPointerInputEvent(this);
            this.serializer = getpointerinputevent;
        }
        return getpointerinputevent.IconCompatParcelizer(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        getMotionEvent getpointerinputevent = this.serializer;
        if (getpointerinputevent == null) {
            getpointerinputevent = new getPointerInputEvent(this);
            this.serializer = getpointerinputevent;
        }
        return getpointerinputevent.listIterator(0);
    }
}
