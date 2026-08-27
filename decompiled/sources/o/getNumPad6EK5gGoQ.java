package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPad6EK5gGoQ extends getNumPad7EK5gGoQ {
    public final transient int read;
    public final transient int serializer;
    public final /* synthetic */ getNumPad7EK5gGoQ write;

    @Override // o.getNumPad4EK5gGoQ
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer;
    }

    public getNumPad6EK5gGoQ(getNumPad7EK5gGoQ getnumpad7ek5ggoq, int i, int i2) {
        this.write = getnumpad7ek5ggoq;
        this.read = i;
        this.serializer = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        getNumLockEK5gGoQ.serializer(i, this.serializer);
        return this.write.get(i + this.read);
    }

    @Override // o.getNumPad4EK5gGoQ
    public final int read() {
        return this.write.read() + this.read;
    }

    @Override // o.getNumPad4EK5gGoQ
    public final int serializer() {
        return this.write.read() + this.read + this.serializer;
    }

    @Override // o.getNumPad7EK5gGoQ, java.util.List
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final getNumPad7EK5gGoQ subList(int i, int i2) {
        getNumLockEK5gGoQ.write(i, i2, this.serializer);
        int i3 = this.read;
        return this.write.subList(i + i3, i2 + i3);
    }

    @Override // o.getNumPad4EK5gGoQ
    public final Object[] write() {
        return this.write.write();
    }
}
