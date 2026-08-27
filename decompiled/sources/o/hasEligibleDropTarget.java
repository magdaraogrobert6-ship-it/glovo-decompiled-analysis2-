package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class hasEligibleDropTarget extends accessgetOnStartTransferp {
    public onDrop MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public final accessgetThisDragAndDropTargetp read;
    public int write;

    public hasEligibleDropTarget(accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetp, int i) {
        super(i, accessgetthisdraganddroptargetp.write);
        this.read = accessgetthisdraganddroptargetp;
        this.RemoteActionCompatParcelizer = accessgetthisdraganddroptargetp.RemoteActionCompatParcelizer();
        this.write = -1;
        IconCompatParcelizer();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void IconCompatParcelizer() {
        accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetp = this.read;
        Object[] objArr = accessgetthisdraganddroptargetp.IconCompatParcelizer;
        if (objArr == null) {
            this.MediaDescriptionCompat = null;
            return;
        }
        int i = (accessgetthisdraganddroptargetp.write - 1) & (-32);
        int i2 = this.serializer;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (accessgetthisdraganddroptargetp.RemoteActionCompatParcelizer / 5) + 1;
        onDrop ondrop = this.MediaDescriptionCompat;
        if (ondrop == null) {
            this.MediaDescriptionCompat = new onDrop(objArr, i2, i, i3);
            return;
        }
        ondrop.serializer = i2;
        ondrop.IconCompatParcelizer = i;
        ondrop.read = i3;
        if (ondrop.RemoteActionCompatParcelizer.length < i3) {
            ondrop.RemoteActionCompatParcelizer = new Object[i3];
        }
        ondrop.RemoteActionCompatParcelizer[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        ondrop.write = r6;
        ondrop.read(i2 - r6, 1);
    }

    public final void read() {
        if (this.RemoteActionCompatParcelizer == this.read.RemoteActionCompatParcelizer()) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    @Override // o.accessgetOnStartTransferp, java.util.ListIterator
    public final void add(Object obj) {
        read();
        int i = this.serializer;
        accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetp = this.read;
        accessgetthisdraganddroptargetp.add(i, obj);
        this.serializer++;
        this.IconCompatParcelizer = accessgetthisdraganddroptargetp.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = accessgetthisdraganddroptargetp.RemoteActionCompatParcelizer();
        this.write = -1;
        IconCompatParcelizer();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        read();
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer;
        this.write = i;
        onDrop ondrop = this.MediaDescriptionCompat;
        accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetp = this.read;
        if (ondrop == null) {
            Object[] objArr = accessgetthisdraganddroptargetp.serializer;
            this.serializer = i + 1;
            return objArr[i];
        }
        if (ondrop.hasNext()) {
            this.serializer++;
            return ondrop.next();
        }
        Object[] objArr2 = accessgetthisdraganddroptargetp.serializer;
        int i2 = this.serializer;
        this.serializer = i2 + 1;
        return objArr2[i2 - ondrop.IconCompatParcelizer];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        read();
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer;
        int i2 = i - 1;
        this.write = i2;
        onDrop ondrop = this.MediaDescriptionCompat;
        accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetp = this.read;
        if (ondrop == null) {
            Object[] objArr = accessgetthisdraganddroptargetp.serializer;
            this.serializer = i2;
            return objArr[i2];
        }
        int i3 = ondrop.IconCompatParcelizer;
        if (i <= i3) {
            this.serializer = i2;
            return ondrop.previous();
        }
        Object[] objArr2 = accessgetthisdraganddroptargetp.serializer;
        int i4 = i - 1;
        this.serializer = i4;
        return objArr2[i4 - i3];
    }

    @Override // o.accessgetOnStartTransferp, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        read();
        int i = this.write;
        if (i == -1) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetp = this.read;
        accessgetthisdraganddroptargetp.IconCompatParcelizer(i);
        int i2 = this.write;
        if (i2 < this.serializer) {
            this.serializer = i2;
        }
        this.IconCompatParcelizer = accessgetthisdraganddroptargetp.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = accessgetthisdraganddroptargetp.RemoteActionCompatParcelizer();
        this.write = -1;
        IconCompatParcelizer();
    }

    @Override // o.accessgetOnStartTransferp, java.util.ListIterator
    public final void set(Object obj) {
        read();
        int i = this.write;
        if (i == -1) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetp = this.read;
        accessgetthisdraganddroptargetp.set(i, obj);
        this.RemoteActionCompatParcelizer = accessgetthisdraganddroptargetp.RemoteActionCompatParcelizer();
        IconCompatParcelizer();
    }
}
