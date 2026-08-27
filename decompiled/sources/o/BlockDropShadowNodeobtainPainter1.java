package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class BlockDropShadowNodeobtainPainter1 implements ListIterator, displayInAppMessagelambda121 {
    public int RemoteActionCompatParcelizer;
    public int read;
    public final Object write;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public int serializer = -1;

    public BlockDropShadowNodeobtainPainter1(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, int i) {
        this.write = snapshotStateList;
        this.RemoteActionCompatParcelizer = i - 1;
        this.read = androidx.compose.runtime.snapshots.SnapshotStateListKt.serializer(snapshotStateList);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i == 0) {
            write();
            int i2 = this.RemoteActionCompatParcelizer + 1;
            this.serializer = i2;
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) obj;
            androidx.compose.runtime.snapshots.SnapshotStateListKt.write(i2, snapshotStateList.size());
            Object obj2 = snapshotStateList.get(i2);
            this.RemoteActionCompatParcelizer = i2;
            return obj2;
        }
        serializer();
        int i3 = this.RemoteActionCompatParcelizer;
        setViewBackground setviewbackground = (setViewBackground) obj;
        if (i3 >= setviewbackground.IconCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.RemoteActionCompatParcelizer = i3 + 1;
        this.serializer = i3;
        return setviewbackground.read[setviewbackground.serializer + i3];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i == 0) {
            write();
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) obj;
            androidx.compose.runtime.snapshots.SnapshotStateListKt.write(this.RemoteActionCompatParcelizer, snapshotStateList.size());
            int i2 = this.RemoteActionCompatParcelizer;
            this.serializer = i2;
            Object obj2 = snapshotStateList.get(i2);
            this.RemoteActionCompatParcelizer--;
            return obj2;
        }
        serializer();
        int i3 = this.RemoteActionCompatParcelizer;
        if (i3 <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i4 = i3 - 1;
        this.RemoteActionCompatParcelizer = i4;
        this.serializer = i4;
        setViewBackground setviewbackground = (setViewBackground) obj;
        return setviewbackground.read[setviewbackground.serializer + i4];
    }

    public void serializer() {
        if (((AbstractList) ((setViewBackground) this.write).RemoteActionCompatParcelizer).modCount == this.read) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.IconCompatParcelizer;
        Object obj2 = this.write;
        if (i != 0) {
            serializer();
            int i2 = this.serializer;
            if (i2 != -1) {
                ((setViewBackground) obj2).set(i2, obj);
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Call next() or previous() before replacing element from the iterator.");
                return;
            }
        }
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) obj2;
        write();
        int i3 = this.serializer;
        if (i3 < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        } else {
            snapshotStateList.set(i3, obj);
            this.read = androidx.compose.runtime.snapshots.SnapshotStateListKt.serializer(snapshotStateList);
        }
    }

    public void write() {
        if (androidx.compose.runtime.snapshots.SnapshotStateListKt.serializer((androidx.compose.runtime.snapshots.SnapshotStateList) this.write) == this.read) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.IconCompatParcelizer;
        Object obj2 = this.write;
        if (i == 0) {
            write();
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) obj2;
            snapshotStateList.add(this.RemoteActionCompatParcelizer + 1, obj);
            this.serializer = -1;
            this.RemoteActionCompatParcelizer++;
            this.read = androidx.compose.runtime.snapshots.SnapshotStateListKt.serializer(snapshotStateList);
            return;
        }
        serializer();
        setViewBackground setviewbackground = (setViewBackground) obj2;
        int i2 = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i2 + 1;
        setviewbackground.add(i2, obj);
        this.serializer = -1;
        this.read = ((AbstractList) setviewbackground).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i == 0) {
            write();
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) obj;
            snapshotStateList.remove(this.serializer);
            this.RemoteActionCompatParcelizer--;
            this.serializer = -1;
            this.read = androidx.compose.runtime.snapshots.SnapshotStateListKt.serializer(snapshotStateList);
            return;
        }
        setViewBackground setviewbackground = (setViewBackground) obj;
        serializer();
        int i2 = this.serializer;
        if (i2 == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Call next() or previous() before removing element from the iterator.");
            return;
        }
        setviewbackground.IconCompatParcelizer(i2);
        this.RemoteActionCompatParcelizer = this.serializer;
        this.serializer = -1;
        this.read = ((AbstractList) setviewbackground).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i != 0) {
            return this.RemoteActionCompatParcelizer < ((setViewBackground) obj).IconCompatParcelizer;
        }
        return this.RemoteActionCompatParcelizer < ((androidx.compose.runtime.snapshots.SnapshotStateList) obj).size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.IconCompatParcelizer != 0) {
            return this.RemoteActionCompatParcelizer > 0;
        }
        return this.RemoteActionCompatParcelizer >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.IconCompatParcelizer != 0 ? this.RemoteActionCompatParcelizer : this.RemoteActionCompatParcelizer + 1;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.IconCompatParcelizer != 0 ? this.RemoteActionCompatParcelizer - 1 : this.RemoteActionCompatParcelizer;
    }

    public BlockDropShadowNodeobtainPainter1(setViewBackground setviewbackground, int i) {
        this.write = setviewbackground;
        this.RemoteActionCompatParcelizer = i;
        this.read = ((AbstractList) setviewbackground).modCount;
    }
}
