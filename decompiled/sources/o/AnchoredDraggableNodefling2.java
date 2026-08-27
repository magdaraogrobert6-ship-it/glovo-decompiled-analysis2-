package o;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableNodefling2 implements ListIterator, displayInAppMessagelambda121 {
    public int RemoteActionCompatParcelizer;
    public final List read;
    public final /* synthetic */ int write;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.write;
        List list = this.read;
        if (i != 0) {
            list.add(this.RemoteActionCompatParcelizer, obj);
            this.RemoteActionCompatParcelizer++;
        } else {
            int i2 = this.RemoteActionCompatParcelizer + 1;
            this.RemoteActionCompatParcelizer = i2;
            list.add(i2, obj);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.write;
        List list = this.read;
        if (i != 0) {
            int i2 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i2 + 1;
            return list.get(i2);
        }
        int i3 = this.RemoteActionCompatParcelizer + 1;
        this.RemoteActionCompatParcelizer = i3;
        return list.get(i3);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.write;
        List list = this.read;
        if (i != 0) {
            int i2 = this.RemoteActionCompatParcelizer - 1;
            this.RemoteActionCompatParcelizer = i2;
            return list.get(i2);
        }
        int i3 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i3 - 1;
        return list.get(i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.write;
        List list = this.read;
        if (i == 0) {
            list.remove(this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer--;
        } else {
            int i2 = this.RemoteActionCompatParcelizer - 1;
            this.RemoteActionCompatParcelizer = i2;
            list.remove(i2);
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.write;
        List list = this.read;
        if (i != 0) {
            list.set(this.RemoteActionCompatParcelizer, obj);
        } else {
            list.set(this.RemoteActionCompatParcelizer, obj);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.write;
        List list = this.read;
        if (i != 0) {
            return this.RemoteActionCompatParcelizer < list.size();
        }
        return this.RemoteActionCompatParcelizer < list.size() - 1;
    }

    public AnchoredDraggableNodefling2(List list, int i, int i2) {
        this.write = i2;
        if (i2 != 1) {
            this.read = list;
            this.RemoteActionCompatParcelizer = i - 1;
        } else {
            this.read = list;
            this.RemoteActionCompatParcelizer = i;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.write != 0) {
            return this.RemoteActionCompatParcelizer > 0;
        }
        return this.RemoteActionCompatParcelizer >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.write != 0 ? this.RemoteActionCompatParcelizer : this.RemoteActionCompatParcelizer + 1;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.write != 0 ? this.RemoteActionCompatParcelizer - 1 : this.RemoteActionCompatParcelizer;
    }
}
