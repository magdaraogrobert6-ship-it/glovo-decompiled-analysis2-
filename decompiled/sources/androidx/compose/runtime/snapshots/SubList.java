package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.BlockInnerShadowNode;
import o.PlatformMagnifierFactoryApi29Impl;
import o.accessgetThisDragAndDropTargetp;
import o.accessgetUnboundedcp;
import o.accesssetThisDragAndDropTargetp;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.displayInAppMessagelambda12;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getBrush;
import o.getCieXyz;
import o.getContentCaptureSessionuiannotations;
import o.getInAppMessageStackannotations;
import o.getOffsetF1C5BW0;
import o.r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class SubList implements List, displayInAppMessagelambda12 {
    public int RemoteActionCompatParcelizer;
    public final SnapshotStateList read;
    public int serializer;
    public final int write;

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.serializer == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.serializer;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }

    public final void RemoteActionCompatParcelizer() {
        if (SnapshotStateListKt.serializer(this.read) == this.RemoteActionCompatParcelizer) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        SnapshotStateListKt.write(i, this.serializer);
        RemoteActionCompatParcelizer();
        int i2 = this.write;
        SnapshotStateList snapshotStateList = this.read;
        Object obj2 = snapshotStateList.set(i + i2, obj);
        this.RemoteActionCompatParcelizer = SnapshotStateListKt.serializer(snapshotStateList);
        return obj2;
    }

    public SubList(SnapshotStateList snapshotStateList, int i, int i2) {
        this.read = snapshotStateList;
        this.write = i;
        this.RemoteActionCompatParcelizer = SnapshotStateListKt.serializer(snapshotStateList);
        this.serializer = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        RemoteActionCompatParcelizer();
        int i = this.write;
        int i2 = this.serializer;
        SnapshotStateList snapshotStateList = this.read;
        snapshotStateList.add(i + i2, obj);
        this.serializer++;
        this.RemoteActionCompatParcelizer = SnapshotStateListKt.serializer(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        RemoteActionCompatParcelizer();
        int i2 = this.write;
        SnapshotStateList snapshotStateList = this.read;
        boolean zAddAll = snapshotStateList.addAll(i + i2, collection);
        if (zAddAll) {
            this.serializer = collection.size() + this.serializer;
            this.RemoteActionCompatParcelizer = SnapshotStateListKt.serializer(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        RemoteActionCompatParcelizer();
        SnapshotStateListKt.write(i, this.serializer);
        return this.read.get(this.write + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        RemoteActionCompatParcelizer();
        int i = this.serializer;
        int i2 = this.write;
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i + i2)};
        int iWrite = BackspaceCommand.write();
        getInAppMessageStackannotations it = ((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite)).iterator();
        while (it.RemoteActionCompatParcelizer) {
            int iRemoteActionCompatParcelizer = it.RemoteActionCompatParcelizer();
            Object[] objArr2 = {obj, this.read.get(iRemoteActionCompatParcelizer)};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return iRemoteActionCompatParcelizer - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        RemoteActionCompatParcelizer();
        int i = this.serializer;
        int i2 = this.write;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.read.get(i3)}, getCieXyz.write())).booleanValue()) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        RemoteActionCompatParcelizer();
        int i2 = this.write;
        SnapshotStateList snapshotStateList = this.read;
        Object objRemove = snapshotStateList.remove(i2 + i);
        this.serializer--;
        this.RemoteActionCompatParcelizer = SnapshotStateListKt.serializer(snapshotStateList);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        getBrush getbrushWrite;
        boolean zSerializer;
        RemoteActionCompatParcelizer();
        SnapshotStateList snapshotStateList = this.read;
        int i2 = this.write;
        int i3 = this.serializer;
        int size = snapshotStateList.size();
        do {
            synchronized (SnapshotStateListKt.write) {
                BlockInnerShadowNode blockInnerShadowNode = snapshotStateList.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetpSerializer = accesssetthisdraganddroptargetp.serializer();
            accessgetthisdraganddroptargetpSerializer.subList(i2, i3 + i2).retainAll(collection);
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetpWrite = accessgetthisdraganddroptargetpSerializer.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accesssetthisdraganddroptargetpWrite, accesssetthisdraganddroptargetp}, getCieXyz.write())).booleanValue()) {
                break;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = snapshotStateList.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = SnapshotStateListKt.serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, snapshotStateList, getbrushWrite), i, accesssetthisdraganddroptargetpWrite, true);
            }
            getOffsetF1C5BW0.write(getbrushWrite, snapshotStateList);
        } while (!zSerializer);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.RemoteActionCompatParcelizer = SnapshotStateListKt.serializer(this.read);
            this.serializer -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.serializer > 0) {
            RemoteActionCompatParcelizer();
            int i = this.serializer;
            int i2 = this.write;
            SnapshotStateList snapshotStateList = this.read;
            snapshotStateList.IconCompatParcelizer(i2, i + i2);
            this.serializer = 0;
            this.RemoteActionCompatParcelizer = SnapshotStateListKt.serializer(snapshotStateList);
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.serializer) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("fromIndex or toIndex are out of bounds");
        }
        RemoteActionCompatParcelizer();
        int i3 = this.write;
        return new SubList(this.read, i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        RemoteActionCompatParcelizer();
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = new createBrazeUserChangeEventSubscriberlambda01();
        createbrazeuserchangeeventsubscriberlambda01.read = i - 1;
        return new accessgetUnboundedcp(createbrazeuserchangeeventsubscriberlambda01, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        RemoteActionCompatParcelizer();
        int i2 = this.write;
        SnapshotStateList snapshotStateList = this.read;
        snapshotStateList.add(i2 + i, obj);
        this.serializer++;
        this.RemoteActionCompatParcelizer = SnapshotStateListKt.serializer(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.serializer, collection);
    }
}
