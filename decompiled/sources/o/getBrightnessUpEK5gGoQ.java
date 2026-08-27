package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getBrightnessUpEK5gGoQ extends getButton10EK5gGoQ {
    public final transient int IconCompatParcelizer;
    public final /* synthetic */ getButton10EK5gGoQ read;
    public final transient int serializer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer;
    }

    public getBrightnessUpEK5gGoQ(getButton10EK5gGoQ getbutton10ek5ggoq, int i, int i2) {
        this.read = getbutton10ek5ggoq;
        this.IconCompatParcelizer = i;
        this.serializer = i2;
    }

    @Override // o.getBreakEK5gGoQ
    public final int IconCompatParcelizer() {
        return this.read.IconCompatParcelizer() + this.IconCompatParcelizer;
    }

    @Override // o.getButton10EK5gGoQ, java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final getButton10EK5gGoQ subList(int i, int i2) {
        coil3.ExtrasKt.read(i, i2, this.serializer);
        int i3 = this.IconCompatParcelizer;
        return this.read.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        coil3.ExtrasKt.IconCompatParcelizer(i, this.serializer);
        return this.read.get(i + this.IconCompatParcelizer);
    }

    @Override // o.getBreakEK5gGoQ
    public final Object[] read() {
        return this.read.read();
    }

    @Override // o.getBreakEK5gGoQ
    public final int write() {
        return this.read.IconCompatParcelizer() + this.IconCompatParcelizer + this.serializer;
    }
}
