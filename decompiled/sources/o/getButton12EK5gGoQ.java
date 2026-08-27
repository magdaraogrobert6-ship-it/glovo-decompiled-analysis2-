package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getButton12EK5gGoQ extends getButton10EK5gGoQ {
    public static final getButton12EK5gGoQ IconCompatParcelizer = new getButton12EK5gGoQ(0, new Object[0]);
    public final transient int RemoteActionCompatParcelizer;
    public final transient Object[] serializer;

    @Override // o.getBreakEK5gGoQ
    public final int IconCompatParcelizer() {
        return 0;
    }

    @Override // o.getButton10EK5gGoQ, o.getBreakEK5gGoQ
    public final int RemoteActionCompatParcelizer(Object[] objArr) {
        Object[] objArr2 = this.serializer;
        int i = this.RemoteActionCompatParcelizer;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // o.getBreakEK5gGoQ
    public final Object[] read() {
        return this.serializer;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getBreakEK5gGoQ
    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.List
    public final Object get(int i) {
        coil3.ExtrasKt.IconCompatParcelizer(i, this.RemoteActionCompatParcelizer);
        Object obj = this.serializer[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public getButton12EK5gGoQ(int i, Object[] objArr) {
        this.serializer = objArr;
        this.RemoteActionCompatParcelizer = i;
    }
}
