package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class accesssetLastChildDragAndDropModifierNodep extends accessgetOnStartTransferp {
    public final Object[] RemoteActionCompatParcelizer;
    public final onDrop read;

    public accesssetLastChildDragAndDropModifierNodep(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.RemoteActionCompatParcelizer = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.read = new onDrop(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        onDrop ondrop = this.read;
        if (ondrop.hasNext()) {
            this.serializer++;
            return ondrop.next();
        }
        int i = this.serializer;
        this.serializer = i + 1;
        return this.RemoteActionCompatParcelizer[i - ondrop.IconCompatParcelizer];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer;
        onDrop ondrop = this.read;
        int i2 = ondrop.IconCompatParcelizer;
        if (i <= i2) {
            this.serializer = i - 1;
            return ondrop.previous();
        }
        int i3 = i - 1;
        this.serializer = i3;
        return this.RemoteActionCompatParcelizer[i3 - i2];
    }
}
