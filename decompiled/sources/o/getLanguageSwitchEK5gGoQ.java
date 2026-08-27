package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class getLanguageSwitchEK5gGoQ extends getLeftBracketEK5gGoQ {
    public static final getLanguageSwitchEK5gGoQ IconCompatParcelizer = new getLanguageSwitchEK5gGoQ(0, new Object[0]);
    public final transient int RemoteActionCompatParcelizer;
    public final transient Object[] read;

    @Override // o.getKanaEK5gGoQ
    public final Object[] IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.getKanaEK5gGoQ
    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getLeftBracketEK5gGoQ, o.getKanaEK5gGoQ
    public final int read(Object[] objArr) {
        Object[] objArr2 = this.read;
        int i = this.RemoteActionCompatParcelizer;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getKanaEK5gGoQ
    public final int write() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        getKEK5gGoQ.read(i, this.RemoteActionCompatParcelizer);
        Object obj = this.read[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public getLanguageSwitchEK5gGoQ(int i, Object[] objArr) {
        this.read = objArr;
        this.RemoteActionCompatParcelizer = i;
    }
}
