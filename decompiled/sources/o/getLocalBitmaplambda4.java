package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class getLocalBitmaplambda4 implements Iterator, Cloneable {
    public final getLocalBitmaplambda3 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final Object[] serializer;

    public final Object clone() {
        return new getLocalBitmaplambda4(this.IconCompatParcelizer, this.serializer, this.RemoteActionCompatParcelizer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer < this.serializer.length;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public getLocalBitmaplambda4(getLocalBitmaplambda3 getlocalbitmaplambda3, Object[] objArr, int i) {
        this.IconCompatParcelizer = getlocalbitmaplambda3;
        this.serializer = objArr;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        return this.serializer[i];
    }
}
