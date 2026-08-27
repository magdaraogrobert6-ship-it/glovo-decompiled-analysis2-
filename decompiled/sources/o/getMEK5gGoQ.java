package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getMEK5gGoQ extends getLastChannelEK5gGoQ {
    public final transient Object read;

    @Override // o.getKanaEK5gGoQ
    public final int read(Object[] objArr) {
        objArr[0] = this.read;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // o.getKanaEK5gGoQ, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.read.equals(obj);
    }

    @Override // o.getLastChannelEK5gGoQ, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new getKatakanaHiraganaEK5gGoQ(this.read);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m("[", this.read.toString(), "]");
    }

    public getMEK5gGoQ(Object obj) {
        this.read = obj;
    }
}
