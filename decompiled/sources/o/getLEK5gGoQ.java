package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getLEK5gGoQ extends getLeftBracketEK5gGoQ {
    public final transient int IconCompatParcelizer;
    public final transient int RemoteActionCompatParcelizer;
    public final /* synthetic */ getLeftBracketEK5gGoQ read;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }

    public getLEK5gGoQ(getLeftBracketEK5gGoQ getleftbracketek5ggoq, int i, int i2) {
        this.read = getleftbracketek5ggoq;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // o.getKanaEK5gGoQ
    public final Object[] IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    @Override // o.getKanaEK5gGoQ
    public final int RemoteActionCompatParcelizer() {
        return this.read.write() + this.IconCompatParcelizer + this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.List
    public final Object get(int i) {
        getKEK5gGoQ.read(i, this.RemoteActionCompatParcelizer);
        return this.read.get(i + this.IconCompatParcelizer);
    }

    @Override // o.getLeftBracketEK5gGoQ, java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getLeftBracketEK5gGoQ subList(int i, int i2) {
        getKEK5gGoQ.serializer(i, i2, this.RemoteActionCompatParcelizer);
        int i3 = this.IconCompatParcelizer;
        return this.read.subList(i + i3, i2 + i3);
    }

    @Override // o.getKanaEK5gGoQ
    public final int write() {
        return this.read.write() + this.IconCompatParcelizer;
    }
}
