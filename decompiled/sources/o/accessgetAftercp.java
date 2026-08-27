package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetAftercp extends BeyondBoundsLayoutBeyondBoundsScope {
    public final transient Object[] IconCompatParcelizer;
    public final transient ContentScaleKt read;
    public final transient int write = 1;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.write;
    }

    public accessgetAftercp(ContentScaleKt contentScaleKt, Object[] objArr) {
        this.read = contentScaleKt;
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
        return value != null && value.equals(this.read.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        BeyondBoundsLayout beyondBoundsLayoutLayoutDirection = this.RemoteActionCompatParcelizer;
        if (beyondBoundsLayoutLayoutDirection == null) {
            beyondBoundsLayoutLayoutDirection = new BeyondBoundsLayoutLayoutDirection(this);
            this.RemoteActionCompatParcelizer = beyondBoundsLayoutLayoutDirection;
        }
        return beyondBoundsLayoutLayoutDirection.listIterator(0);
    }

    @Override // o.setMeasurementApproachInProgress
    public final int write(Object[] objArr) {
        BeyondBoundsLayout beyondBoundsLayoutLayoutDirection = this.RemoteActionCompatParcelizer;
        if (beyondBoundsLayoutLayoutDirection == null) {
            beyondBoundsLayoutLayoutDirection = new BeyondBoundsLayoutLayoutDirection(this);
            this.RemoteActionCompatParcelizer = beyondBoundsLayoutLayoutDirection;
        }
        return beyondBoundsLayoutLayoutDirection.write(objArr);
    }
}
