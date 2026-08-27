package o;

import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class getInsideannotations extends getCrop {
    public final transient int read;
    public final /* synthetic */ getCrop serializer;
    public final transient int write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    public getInsideannotations(getCrop getcrop, int i, int i2) {
        this.serializer = getcrop;
        this.write = i;
        this.read = i2;
    }

    @Override // o.getCropannotations
    public final int RemoteActionCompatParcelizer() {
        return this.serializer.RemoteActionCompatParcelizer() + this.write;
    }

    @Override // java.util.List
    public final Object get(int i) {
        UrlUtils.write(i, this.read);
        return this.serializer.get(i + this.write);
    }

    @Override // o.getCrop, java.util.List
    /* JADX INFO: renamed from: serializer */
    public final getCrop subList(int i, int i2) {
        UrlUtils.write(i, i2, this.read);
        int i3 = this.write;
        return this.serializer.subList(i + i3, i2 + i3);
    }

    @Override // o.getCropannotations
    public final Object[] serializer() {
        return this.serializer.serializer();
    }

    @Override // o.getCropannotations
    public final int write() {
        return this.serializer.RemoteActionCompatParcelizer() + this.write + this.read;
    }
}
