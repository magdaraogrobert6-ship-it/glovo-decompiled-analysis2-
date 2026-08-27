package o;

import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetBeforecp extends BeyondBoundsLayout {
    public final transient int IconCompatParcelizer = 1;
    public final transient int RemoteActionCompatParcelizer;
    public final transient Object[] write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.List
    public final Object get(int i) {
        DelayKt.read(i, this.IconCompatParcelizer);
        Object obj = this.write[i + i + this.RemoteActionCompatParcelizer];
        obj.getClass();
        return obj;
    }

    public accessgetBeforecp(int i, Object[] objArr) {
        this.write = objArr;
        this.RemoteActionCompatParcelizer = i;
    }
}
