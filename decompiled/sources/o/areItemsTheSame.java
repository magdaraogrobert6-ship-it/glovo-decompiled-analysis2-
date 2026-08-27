package o;

import java.util.Objects;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class areItemsTheSame extends delegateUnprotectedui {
    public final transient int RemoteActionCompatParcelizer;
    public final transient int read;
    public final transient Object[] serializer;

    @Override // o.getSelfKindSetui
    public final boolean serializer() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    @Override // java.util.List
    public final Object get(int i) {
        TextStreamsKt.RemoteActionCompatParcelizer(i, this.read);
        Object obj = this.serializer[(i * 2) + this.RemoteActionCompatParcelizer];
        Objects.requireNonNull(obj);
        return obj;
    }

    public areItemsTheSame(int i, int i2, Object[] objArr) {
        this.serializer = objArr;
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
    }
}
