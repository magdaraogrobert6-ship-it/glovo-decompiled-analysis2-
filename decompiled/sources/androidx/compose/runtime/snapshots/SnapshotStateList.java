package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o.BlockDropShadowNodeobtainPainter1;
import o.BlockInnerShadowNode;
import o.BlurKt;
import o.accessgetThisDragAndDropTargetp;
import o.accesssetThisDragAndDropTargetp;
import o.blur1fqSgw;
import o.displayInAppMessagelambda12;
import o.getBrush;
import o.getCieXyz;
import o.getContentCaptureSessionuiannotations;
import o.getOffsetF1C5BW0;
import o.r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4;
import o.removeNodeAtDepth;
import o.setBrush;
import o.setShape;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class SnapshotStateList<T> implements Parcelable, blur1fqSgw, List<T>, RandomAccess, displayInAppMessagelambda12 {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new setBrush();
    public BlockInnerShadowNode write;

    @Override // o.blur1fqSgw
    public final BlurKt IconCompatParcelizer() {
        return this.write;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }

    public final void IconCompatParcelizer(int i, int i2) {
        int i3;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        getBrush getbrushWrite;
        boolean zSerializer;
        do {
            synchronized (SnapshotStateListKt.write) {
                BlockInnerShadowNode blockInnerShadowNode = this.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i3 = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetpSerializer = accesssetthisdraganddroptargetp.serializer();
            accessgetthisdraganddroptargetpSerializer.subList(i, i2).clear();
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetpWrite = accessgetthisdraganddroptargetpSerializer.write();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{accesssetthisdraganddroptargetpWrite, accesssetthisdraganddroptargetp}, iWrite3)).booleanValue()) {
                return;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = this.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = SnapshotStateListKt.serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, this, getbrushWrite), i3, accesssetthisdraganddroptargetpWrite, true);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!zSerializer);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        getBrush getbrushWrite;
        boolean zSerializer;
        do {
            synchronized (SnapshotStateListKt.write) {
                BlockInnerShadowNode blockInnerShadowNode = this.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp2 = accesssetthisdraganddroptargetp.read(obj);
            if (accesssetthisdraganddroptargetp2.equals(accesssetthisdraganddroptargetp)) {
                return false;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = this.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = SnapshotStateListKt.serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, this, getbrushWrite), i, accesssetthisdraganddroptargetp2, true);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!zSerializer);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        getBrush getbrushWrite;
        boolean zSerializer;
        do {
            synchronized (SnapshotStateListKt.write) {
                BlockInnerShadowNode blockInnerShadowNode = this.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetpIconCompatParcelizer = accesssetthisdraganddroptargetp.IconCompatParcelizer(collection);
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{accesssetthisdraganddroptargetpIconCompatParcelizer, accesssetthisdraganddroptargetp}, iWrite3)).booleanValue()) {
                return false;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = this.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = SnapshotStateListKt.serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, this, getbrushWrite), i, accesssetthisdraganddroptargetpIconCompatParcelizer, true);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!zSerializer);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        getBrush getbrushWrite;
        BlockInnerShadowNode blockInnerShadowNode = this.write;
        blockInnerShadowNode.getClass();
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            getbrushWrite = getOffsetF1C5BW0.write();
            BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode, this, getbrushWrite);
            synchronized (SnapshotStateListKt.write) {
                blockInnerShadowNode2.read = SmallPersistentVector.IconCompatParcelizer;
                blockInnerShadowNode2.RemoteActionCompatParcelizer++;
                blockInnerShadowNode2.write++;
            }
        }
        getOffsetF1C5BW0.write(getbrushWrite, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        getBrush getbrushWrite;
        boolean zSerializer;
        do {
            synchronized (SnapshotStateListKt.write) {
                BlockInnerShadowNode blockInnerShadowNode = this.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            int iIndexOf = accesssetthisdraganddroptargetp.indexOf(obj);
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp2 = iIndexOf != -1 ? accesssetthisdraganddroptargetp.read(iIndexOf) : accesssetthisdraganddroptargetp;
            if (accesssetthisdraganddroptargetp2.equals(accesssetthisdraganddroptargetp)) {
                return false;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = this.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = SnapshotStateListKt.serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, this, getbrushWrite), i, accesssetthisdraganddroptargetp2, true);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!zSerializer);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        getBrush getbrushWrite;
        boolean zSerializer;
        do {
            synchronized (SnapshotStateListKt.write) {
                BlockInnerShadowNode blockInnerShadowNode = this.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetpRemoteActionCompatParcelizer = accesssetthisdraganddroptargetp.RemoteActionCompatParcelizer(new SnapshotStateList$$ExternalSyntheticLambda0(1, collection));
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{accesssetthisdraganddroptargetpRemoteActionCompatParcelizer, accesssetthisdraganddroptargetp}, iWrite3)).booleanValue()) {
                return false;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = this.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = SnapshotStateListKt.serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, this, getbrushWrite), i, accesssetthisdraganddroptargetpRemoteActionCompatParcelizer, true);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!zSerializer);
        return true;
    }

    @Override // o.blur1fqSgw
    public final void serializer(BlurKt blurKt) {
        blurKt.MediaSessionCompatQueueItem = this.write;
        this.write = (BlockInnerShadowNode) blurKt;
    }

    public final String toString() {
        BlockInnerShadowNode blockInnerShadowNode = this.write;
        blockInnerShadowNode.getClass();
        return "SnapshotStateList(value=" + ((BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode)).read + ")@" + hashCode();
    }

    public SnapshotStateList(accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp) {
        getBrush getbrushWrite = getOffsetF1C5BW0.write();
        BlockInnerShadowNode blockInnerShadowNode = new BlockInnerShadowNode(getbrushWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), accesssetthisdraganddroptargetp);
        if (!(getbrushWrite instanceof setShape)) {
            blockInnerShadowNode.MediaSessionCompatQueueItem = new BlockInnerShadowNode(1L, accesssetthisdraganddroptargetp);
        }
        this.write = blockInnerShadowNode;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new BlockDropShadowNodeobtainPainter1(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return SnapshotStateListKt.IconCompatParcelizer(this, new SnapshotStateList$$ExternalSyntheticLambda0(0, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return SnapshotStateListKt.IconCompatParcelizer(this).read.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return SnapshotStateListKt.IconCompatParcelizer(this).read.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return SnapshotStateListKt.IconCompatParcelizer(this).read.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return SnapshotStateListKt.IconCompatParcelizer(this).read.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return SnapshotStateListKt.IconCompatParcelizer(this).read.isEmpty();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return SnapshotStateListKt.IconCompatParcelizer(this).read.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        getBrush getbrushWrite;
        boolean zSerializer;
        Object obj2 = get(i);
        do {
            synchronized (SnapshotStateListKt.write) {
                BlockInnerShadowNode blockInnerShadowNode = this.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i2 = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetpWrite = accesssetthisdraganddroptargetp.write(i, obj);
            if (accesssetthisdraganddroptargetpWrite.equals(accesssetthisdraganddroptargetp)) {
                break;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = this.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = SnapshotStateListKt.serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, this, getbrushWrite), i2, accesssetthisdraganddroptargetpWrite, false);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!zSerializer);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return SnapshotStateListKt.IconCompatParcelizer(this).read.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, i, i2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp = SnapshotStateListKt.IconCompatParcelizer(this).read;
        int size = accesssetthisdraganddroptargetp.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(accesssetthisdraganddroptargetp.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new BlockDropShadowNodeobtainPainter1(this, i);
    }

    public SnapshotStateList() {
        this(SmallPersistentVector.IconCompatParcelizer);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        getBrush getbrushWrite;
        boolean zSerializer;
        do {
            synchronized (SnapshotStateListKt.write) {
                BlockInnerShadowNode blockInnerShadowNode = this.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i2 = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp2 = accesssetthisdraganddroptargetp.read(i, obj);
            if (accesssetthisdraganddroptargetp2.equals(accesssetthisdraganddroptargetp)) {
                return;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = this.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = SnapshotStateListKt.serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, this, getbrushWrite), i2, accesssetthisdraganddroptargetp2, true);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!zSerializer);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return SnapshotStateListKt.IconCompatParcelizer(this, new SnapshotStateList$$ExternalSyntheticLambda1(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp;
        getBrush getbrushWrite;
        boolean zSerializer;
        Object obj = get(i);
        do {
            synchronized (SnapshotStateListKt.write) {
                BlockInnerShadowNode blockInnerShadowNode = this.write;
                blockInnerShadowNode.getClass();
                BlockInnerShadowNode blockInnerShadowNode2 = (BlockInnerShadowNode) getOffsetF1C5BW0.IconCompatParcelizer(blockInnerShadowNode);
                i2 = blockInnerShadowNode2.RemoteActionCompatParcelizer;
                accesssetthisdraganddroptargetp = blockInnerShadowNode2.read;
            }
            accesssetthisdraganddroptargetp.getClass();
            accesssetThisDragAndDropTargetp accesssetthisdraganddroptargetp2 = accesssetthisdraganddroptargetp.read(i);
            if (accesssetthisdraganddroptargetp2.equals(accesssetthisdraganddroptargetp)) {
                break;
            }
            BlockInnerShadowNode blockInnerShadowNode3 = this.write;
            blockInnerShadowNode3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                zSerializer = SnapshotStateListKt.serializer((BlockInnerShadowNode) getOffsetF1C5BW0.RemoteActionCompatParcelizer(blockInnerShadowNode3, this, getbrushWrite), i2, accesssetthisdraganddroptargetp2, true);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!zSerializer);
        return obj;
    }
}
