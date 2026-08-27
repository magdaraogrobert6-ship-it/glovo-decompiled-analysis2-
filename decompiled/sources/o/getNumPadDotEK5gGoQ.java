package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadDotEK5gGoQ implements Iterator {
    public final /* synthetic */ Iterator serializer;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new getNumPadSubtractEK5gGoQ((String) this.serializer.next());
    }

    public getNumPadDotEK5gGoQ(Iterator it) {
        this.serializer = it;
    }
}
