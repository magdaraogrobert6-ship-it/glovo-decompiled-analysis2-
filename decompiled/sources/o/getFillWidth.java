package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class getFillWidth extends getCrop {
    public static final getFillWidth read = new getFillWidth(0, new Object[0]);
    public final transient Object[] serializer;
    public final transient int write;

    @Override // o.getCropannotations
    public final int RemoteActionCompatParcelizer() {
        return 0;
    }

    @Override // o.getCropannotations
    public final Object[] serializer() {
        return this.serializer;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write;
    }

    @Override // o.getCropannotations
    public final int write() {
        return this.write;
    }

    @Override // java.util.List
    public final Object get(int i) {
        UrlUtils.write(i, this.write);
        Object obj = this.serializer[i];
        obj.getClass();
        return obj;
    }

    public getFillWidth(int i, Object[] objArr) {
        this.serializer = objArr;
        this.write = i;
    }

    @Override // o.getCrop, o.getCropannotations
    public final int write(Object[] objArr) {
        Object[] objArr2 = this.serializer;
        int i = this.write;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }
}
