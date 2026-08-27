package o;

import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getHasMoreContent extends BeyondBoundsLayout {
    public static final getHasMoreContent RemoteActionCompatParcelizer = new getHasMoreContent(0, new Object[0]);
    public final transient Object[] IconCompatParcelizer;
    public final transient int write;

    @Override // o.setMeasurementApproachInProgress
    public final int IconCompatParcelizer() {
        return this.write;
    }

    @Override // o.setMeasurementApproachInProgress
    public final Object[] read() {
        return this.IconCompatParcelizer;
    }

    @Override // o.setMeasurementApproachInProgress
    public final int serializer() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write;
    }

    @Override // java.util.List
    public final Object get(int i) {
        DelayKt.read(i, this.write);
        Object obj = this.IconCompatParcelizer[i];
        obj.getClass();
        return obj;
    }

    public getHasMoreContent(int i, Object[] objArr) {
        this.IconCompatParcelizer = objArr;
        this.write = i;
    }

    @Override // o.BeyondBoundsLayout, o.setMeasurementApproachInProgress
    public final int write(Object[] objArr) {
        Object[] objArr2 = this.IconCompatParcelizer;
        int i = this.write;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }
}
