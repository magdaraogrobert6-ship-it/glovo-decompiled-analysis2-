package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getBookmarkEK5gGoQ extends getButton10EK5gGoQ {
    public final transient getButton10EK5gGoQ RemoteActionCompatParcelizer;

    @Override // o.getButton10EK5gGoQ
    public final getButton10EK5gGoQ RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getButton10EK5gGoQ, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final getButton10EK5gGoQ subList(int i, int i2) {
        getButton10EK5gGoQ getbutton10ek5ggoq = this.RemoteActionCompatParcelizer;
        coil3.ExtrasKt.read(i, i2, getbutton10ek5ggoq.size());
        return getbutton10ek5ggoq.subList(getbutton10ek5ggoq.size() - i2, getbutton10ek5ggoq.size() - i).RemoteActionCompatParcelizer();
    }

    @Override // o.getButton10EK5gGoQ, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.RemoteActionCompatParcelizer.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        getButton10EK5gGoQ getbutton10ek5ggoq = this.RemoteActionCompatParcelizer;
        coil3.ExtrasKt.IconCompatParcelizer(i, getbutton10ek5ggoq.size());
        return getbutton10ek5ggoq.get((getbutton10ek5ggoq.size() - 1) - i);
    }

    @Override // o.getButton10EK5gGoQ, java.util.List
    public final int indexOf(Object obj) {
        getButton10EK5gGoQ getbutton10ek5ggoq = this.RemoteActionCompatParcelizer;
        int iLastIndexOf = getbutton10ek5ggoq.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (getbutton10ek5ggoq.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // o.getButton10EK5gGoQ, java.util.List
    public final int lastIndexOf(Object obj) {
        getButton10EK5gGoQ getbutton10ek5ggoq = this.RemoteActionCompatParcelizer;
        int iIndexOf = getbutton10ek5ggoq.indexOf(obj);
        if (iIndexOf >= 0) {
            return (getbutton10ek5ggoq.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer.size();
    }

    public getBookmarkEK5gGoQ(getButton10EK5gGoQ getbutton10ek5ggoq) {
        this.RemoteActionCompatParcelizer = getbutton10ek5ggoq;
    }
}
