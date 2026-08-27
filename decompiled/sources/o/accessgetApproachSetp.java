package o;

import java.util.Objects;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetApproachSetp extends delegateUnprotectedui {
    public static final accessgetApproachSetp read = new accessgetApproachSetp(0, new Object[0]);
    public final transient Object[] RemoteActionCompatParcelizer;
    public final transient int serializer;

    @Override // o.getSelfKindSetui
    public final int IconCompatParcelizer() {
        return 0;
    }

    @Override // o.getSelfKindSetui
    public final int RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.getSelfKindSetui
    public final boolean serializer() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.serializer;
    }

    @Override // o.getSelfKindSetui
    public final Object[] write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.List
    public final Object get(int i) {
        TextStreamsKt.RemoteActionCompatParcelizer(i, this.serializer);
        Object obj = this.RemoteActionCompatParcelizer[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public accessgetApproachSetp(int i, Object[] objArr) {
        this.RemoteActionCompatParcelizer = objArr;
        this.serializer = i;
    }

    @Override // o.delegateUnprotectedui, o.getSelfKindSetui
    public final int write(int i, Object[] objArr) {
        Object[] objArr2 = this.RemoteActionCompatParcelizer;
        int i2 = this.serializer;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }
}
