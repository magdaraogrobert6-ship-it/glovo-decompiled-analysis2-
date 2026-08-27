package o;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetUnboundedcp implements ListIterator, displayInAppMessagelambda121 {
    public final /* synthetic */ androidx.compose.runtime.snapshots.SubList serializer;
    public final /* synthetic */ createBrazeUserChangeEventSubscriberlambda01 write;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.write.read < this.serializer.serializer - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.write.read >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = this.write;
        int i = createbrazeuserchangeeventsubscriberlambda01.read + 1;
        androidx.compose.runtime.snapshots.SubList subList = this.serializer;
        androidx.compose.runtime.snapshots.SnapshotStateListKt.write(i, subList.serializer);
        createbrazeuserchangeeventsubscriberlambda01.read = i;
        return subList.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.write.read + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = this.write;
        int i = createbrazeuserchangeeventsubscriberlambda01.read;
        androidx.compose.runtime.snapshots.SubList subList = this.serializer;
        androidx.compose.runtime.snapshots.SnapshotStateListKt.write(i, subList.serializer);
        createbrazeuserchangeeventsubscriberlambda01.read = i - 1;
        return subList.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.write.read;
    }

    public accessgetUnboundedcp(createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01, androidx.compose.runtime.snapshots.SubList subList) {
        this.write = createbrazeuserchangeeventsubscriberlambda01;
        this.serializer = subList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
