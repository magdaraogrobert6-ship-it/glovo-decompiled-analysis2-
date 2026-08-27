package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPad5EK5gGoQ extends getNumPad7EK5gGoQ {
    public static final getNumPad5EK5gGoQ serializer = new getNumPad5EK5gGoQ(0, new Object[0]);
    public final transient Object[] read;
    public final transient int write;

    @Override // o.getNumPad4EK5gGoQ
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // o.getNumPad4EK5gGoQ
    public final int read() {
        return 0;
    }

    @Override // o.getNumPad4EK5gGoQ
    public final int serializer() {
        return this.write;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write;
    }

    @Override // o.getNumPad4EK5gGoQ
    public final Object[] write() {
        return this.read;
    }

    @Override // java.util.List
    public final Object get(int i) {
        getNumLockEK5gGoQ.serializer(i, this.write);
        Object obj = this.read[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public getNumPad5EK5gGoQ(int i, Object[] objArr) {
        this.read = objArr;
        this.write = i;
    }

    @Override // o.getNumPad7EK5gGoQ, o.getNumPad4EK5gGoQ
    public final int read(Object[] objArr) {
        Object[] objArr2 = this.read;
        int i = this.write;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }
}
